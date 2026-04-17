EPSILON = 'ε'  # Representa la cadena vacía
FIN = '$'      # Símbolo de fin de entrada

# Gramática: cada producción es (no_terminal -> lista de símbolos)
# [] o ['ε'] representa epsilon
GRAMATICA = {
    'S': [['A', 'a', 'A', 'b'], ['B', 'b', 'B', 'a']],
    'A': [[EPSILON]],
    'B': [[EPSILON]],
}

NO_TERMINALES = list(GRAMATICA.keys())  # Lista de no terminales
INICIAL = 'S'  # Símbolo inicial

# FIRST
def first_de_secuencia(secuencia, first):
    resultado = set()

    for simbolo in secuencia:

        if simbolo == EPSILON:
            resultado.add(EPSILON)
            # Si encontramos ε directamente, lo agregamos
            break

        if simbolo not in GRAMATICA:
            resultado.add(simbolo)
            # Si es terminal, se agrega y se detiene
            break

        resultado |= (first[simbolo] - {EPSILON})
        # Agrega FIRST del no terminal sin ε

        if EPSILON not in first[simbolo]:
            break
            # Si no genera ε, se detiene

    else:
        resultado.add(EPSILON)
        # Si todos generan ε, se agrega ε

    return resultado


def calcular_first():
    first = {nt: set() for nt in NO_TERMINALES}
    # Inicializa FIRST vacío para cada no terminal

    cambio = True

    while cambio:
        cambio = False

        for nt, producciones in GRAMATICA.items():

            for prod in producciones:

                antes = len(first[nt])

                first[nt] |= first_de_secuencia(prod, first)
                # Agrega nuevos símbolos a FIRST

                if len(first[nt]) != antes:
                    cambio = True
                    # Si cambió, se sigue iterando

    return first

# FOLLOW

def calcular_follow(first):
    follow = {nt: set() for nt in NO_TERMINALES}
    follow[INICIAL].add(FIN)
    # El símbolo inicial siempre contiene $

    cambio = True

    while cambio:
        cambio = False

        for nt, producciones in GRAMATICA.items():

            for prod in producciones:

                for i, simbolo in enumerate(prod):

                    if simbolo not in GRAMATICA:
                        continue
                        # Solo nos interesan no terminales

                    resto = prod[i+1:] if i+1 < len(prod) else [EPSILON]
                    # Parte derecha después del símbolo

                    first_resto = first_de_secuencia(resto, first)

                    antes = len(follow[simbolo])

                    follow[simbolo] |= (first_resto - {EPSILON})
                    # Agrega FIRST(resto) sin ε

                    if EPSILON in first_resto:
                        follow[simbolo] |= follow[nt]
                        # Si resto puede ser ε, agrega FOLLOW del padre

                    if len(follow[simbolo]) != antes:
                        cambio = True

    return follow

# TABLA LL(1)

def construir_tabla(first, follow):
    tabla = {}
    conflicto = False

    for nt, producciones in GRAMATICA.items():

        for prod in producciones:

            f = first_de_secuencia(prod, first)

            for terminal in f - {EPSILON}:
                clave = (nt, terminal)

                if clave in tabla:
                    conflicto = True
                    # Si ya existe, hay conflicto

                tabla[clave] = prod

            if EPSILON in f:
                # Si la producción genera ε

                for terminal in follow[nt]:
                    clave = (nt, terminal)

                    if clave in tabla:
                        conflicto = True

                    tabla[clave] = prod

    return tabla, conflicto

# IMPRESIÓN

def prod_a_texto(prod):
    return ' '.join(prod) if prod != [EPSILON] else 'ε'
    # Convierte producción a string legible


def imprimir_conjuntos(first, follow):

    print("=" * 50)
    print("CONJUNTOS FIRST")
    print("=" * 50)

    for nt in NO_TERMINALES:
        print(f"FIRST({nt}) = {{ {', '.join(sorted(first[nt]))} }}")

    print("\n" + "=" * 50)
    print("CONJUNTOS FOLLOW")
    print("=" * 50)

    for nt in NO_TERMINALES:
        print(f"FOLLOW({nt}) = {{ {', '.join(sorted(follow[nt]))} }}")


def imprimir_tabla(tabla):

    terminales = sorted({t for (_, t) in tabla})
    ancho = 20

    print("\n" + "=" * 50)
    print("TABLA LL(1)")
    print("=" * 50)

    encabezado = f"{'NT':<6}" + "".join(f"{t:^{ancho}}" for t in terminales)
    print(encabezado)
    print("-" * len(encabezado))

    for nt in NO_TERMINALES:

        fila = f"{nt:<6}"

        for t in terminales:

            celda = tabla.get((nt, t))

            if celda:
                fila += f"{(nt + '→' + prod_a_texto(celda)):^{ancho}}"
            else:
                fila += f"{'':^{ancho}}"

        print(fila)


def imprimir_veredicto(conflicto):

    print("\n" + "=" * 50)

    if not conflicto:
        print("La gramática ES LL(1):")
        # Indica que no hay ambigüedad en la tabla

        print(" - No hay conflictos en la tabla de análisis.")
        # Cada celda tiene máximo una producción

        print(" - Cada celda M[A, a] tiene a lo sumo una producción.")
        # Condición clave de gramáticas LL(1)

        print(" - FIRST(AaAb) ∩ FIRST(BbBa) = {a} ∩ {b} = ∅")
        # No hay intersección entre las producciones

        print("   (A y B derivan ε, pero las producciones se distinguen")
        print("    por el terminal que las sigue: 'a' para S→AaAb,")
        print("    'b' para S→BbBa).")
        # Explicación de por qué no hay conflicto

    else:
        print("La gramática NO es LL(1): hay conflictos en la tabla.")
        # Indica que existe ambigüedad

    print("=" * 50)

# MAIN

if __name__ == "__main__":

    first = calcular_first()
    follow = calcular_follow(first)
    tabla, conflicto = construir_tabla(first, follow)

    imprimir_conjuntos(first, follow)
    imprimir_tabla(tabla)
    imprimir_veredicto(conflicto)