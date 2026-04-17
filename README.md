# Compiladores e Intérpretes

Trabajos prácticos del curso. Cada punto implementa un componente diferente de análisis léxico/sintáctico.

## Puntos 1 y 2 — CRUD NoSQL con ANTLR4

Gramática e implementación de un lenguaje para operar sobre bases de datos no relacionales (estilo MongoDB), con soporte para INSERT, FIND, UPDATE y DELETE.

### Archivos importantes

| Archivo | Rol | Notas |
|---|---|---|
| `CRUD.g4` | Gramática ANTLR4 | El editable|
| `MiListener.java` | Acciones semánticas | Implementa `enterInsertar`, `enterBuscar`, etc. |
| `Main.java` | Punto de entrada | Lee el archivo y lanza el parser |
| `pruebas.crud` | Casos de prueba | INSERT, FIND, UPDATE, DELETE de ejemplo |
| `CRUDLexer.java` | Generado por ANTLR |  No editar |
| `CRUDParser.java` | Generado por ANTLR | No editar |
| `CRUDBaseListener.java` | Generado por ANTLR |  No editar|
| `*.class` / `*.tokens` / `*.interp` | Bytecode y metadatos | Agregar al `.gitignore` |

### Requisitos

- Java JDK 11+
- ANTLR4: `antlr-4.13.1-complete.jar` en `~/`

### Compilación y ejecución

```bash
# 1. Instalar Java
sudo apt update && sudo apt install default-jdk -y

# 2. Descargar ANTLR4
wget https://www.antlr.org/download/antlr-4.13.1-complete.jar -P ~/

# 3. Crear carpeta y entrar
mkdir ~/crud_nosql && cd ~/crud_nosql

# 4. Generar lexer y parser desde la gramática
java -jar ~/antlr-4.13.1-complete.jar -visitor CRUD.g4

# 5. Compilar todo
javac -cp .:$HOME/antlr-4.13.1-complete.jar *.java

# 6. Ejecutar con el archivo de pruebas
java -cp .:$HOME/antlr-4.13.1-complete.jar Main pruebas.crud
```

### Salida esperada

```
=== INSERT ===
  Colección : usuarios
  Datos     : nombre:"Carlos",edad:25,activo:true
=== FIND ===
  Colección : usuarios
  Filtro    : (todos los documentos)
=== FIND ===
  Colección : usuarios
  Filtro    : edad>18
=== UPDATE ===
  Colección : usuarios
  Campo     : edad
  Nuevo val : 26
  Filtro    : nombre=="Carlos"
=== DELETE ===
  Colección : usuarios
  Filtro    : activo==false
```


## Punto 3 — Gramática LL(1)

Verificador en Python que calcula FIRST, FOLLOW, construye la tabla de análisis predictivo y determina si la gramática es LL(1).

### Gramática analizada

```
S → AaAb | BbBa
A → ε
B → ε
```

### Archivo

```
gramatica_LL.py
```

### Ejecución

```bash
python3 gramatica_LL.py
```

### Resultados

| NT | FIRST | FOLLOW |
|---|---|---|
| S | { a, b } | { $ } |
| A | { ε } | { a, b } |
| B | { ε } | { a, b } |

**Veredicto:** la gramática **ES LL(1)**.

Aunque `A` y `B` derivan `ε`, las dos alternativas de `S` se distinguen por el primer terminal: `a` dirige a `S → AaAb` y `b` a `S → BbBa`. Por lo tanto:

```
FIRST(AaAb) ∩ FIRST(BbBa) = {a} ∩ {b} = ∅
```

Cada celda de la tabla tiene a lo sumo una producción → condición suficiente para LL(1).

---

## Punto 4 — Benchmark CYK vs Predictivo

Comparación de rendimiento entre el algoritmo CYK O(n³) y el parser predictivo LL(1) O(n) sobre expresiones aritméticas de longitud creciente.

### Archivos

```
cyk_parser.py        ← implementación CYK
predictivo_parser.py ← parser recursivo descendente LL(1)
benchmark.py         ← medición de tiempo y memoria
expresiones.txt      ← 14 expresiones de prueba
```

### Ejecución

```bash
# Instalar dependencia
pip3 install matplotlib --break-system-packages

# Correr benchmark (genera tabla en consola + grafica.png)
python3 benchmark.py

# Ver la gráfica
xdg-open grafica.png
```

### Resultados

| Expresiones | Tokens | CYK O(n³) | Predictivo O(n) | CYK más lento |
|---|---|---|---|---|
| E0 – E3 | 3 | ~0.05 ms | ~0.005 ms | ~10× |
| E4 – E8 | 5–7 | ~0.15 ms | ~0.010 ms | ~15× |
| E9 – E11 | 9–11 | ~0.25 ms | ~0.015 ms | ~16× |
| E12 | 27 | ~2.60 ms | ~0.040 ms | ~65× |
| E13 | 19 | ~2.05 ms | ~0.070 ms | ~29× |

<img width="646" height="475" alt="image" src="https://github.com/user-attachments/assets/4b723b9a-63f7-431c-8a40-dd781bcc6919" />


### Conclusión

El parser predictivo es consistentemente más rápido porque recorre la entrada una sola vez (O(n)). CYK escala cúbicamente con el número de tokens — en E12 (27 tokens) es **65 veces más lento**. Para gramáticas simples como expresiones aritméticas, el enfoque LL(1) es claramente superior en rendimiento.

---

## Punto 5 — Calculadora Booleana con YACC/Flex

Calculadora de escritorio que evalúa expresiones booleanas usando un analizador LALR(1) generado por Bison + Flex.

### Expresiones soportadas

```
TRUE AND FALSE
NOT FALSE
(TRUE OR FALSE) AND TRUE
NOT (TRUE AND TRUE)
FALSE OR TRUE AND FALSE
```

### Archivos

```
bool.y   ← gramática y acciones (YACC/Bison)
bool.l   ← reglas léxicas (Flex)
pruebas.txt ← casos de prueba
```

### Ejecución

```bash
# 1. Instalar herramientas
sudo apt install bison flex gcc -y

# 2. Generar el parser
bison -d bool.y -o bool.tab.c

# 3. Generar el lexer
flex -o lex.yy.c bool.l

# 4. Compilar
gcc bool.tab.c lex.yy.c -o boolcalc -lfl

# 5a. Ejecutar con archivo de pruebas
./boolcalc < pruebas.txt

# 5b. O modo interactivo (Ctrl+D para salir)
./boolcalc
```

### Salida esperada

```
Calculadora Booleana (Ctrl+D para salir)
==========================================
Resultado: FALSE

Resultado: TRUE

Resultado: TRUE

Resultado: FALSE

Resultado: FALSE
```

### Desempeño del analizador

Bison genera un analizador **LALR(1)** — bottom-up, izquierda a derecha, con 1 token de lookahead.

| Aspecto | Detalle |
|---|---|
| Tipo | LALR(1) bottom-up |
| Complejidad | O(n) en el tamaño de la entrada |
| Lookahead | 1 token basta para todas las decisiones |
| Precedencia | `NOT > AND > OR` declarada con `%left` / `%right` |
| Recuperación | `yyerrok` permite continuar tras un error de sintaxis |
| Memoria | La pila crece solo con la profundidad del paréntesis |

---

## .gitignore recomendado

```gitignore
# ANTLR generados
*.class
*.tokens
*.interp
CRUDLexer.java
CRUDParser.java
CRUDBaseListener.java

# Flex/Bison generados
lex.yy.c
bool.tab.c
bool.tab.h
boolcalc

# Python
__pycache__/
*.pyc
```
