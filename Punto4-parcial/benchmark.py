import time  # Para medir tiempo
import tracemalloc  # Para medir memoria
import matplotlib.pyplot as plt  # Para graficar
import os  # Para abrir la imagen automáticamente

from cyk_parser import cyk
from predictivo_parser import evaluar


def leer_expresiones(archivo):
    with open(archivo, "r") as f:
        return [line.strip() for line in f if line.strip()]
    # Lee cada línea del archivo y elimina espacios vacíos


def medir(func, expr, repeticiones=200):

    tracemalloc.start()
    # Inicia medición de memoria

    inicio = time.perf_counter()
    # Marca tiempo inicial

    for _ in range(repeticiones):
        func(expr)
        # Ejecuta la función varias veces

    fin = time.perf_counter()
    # Marca tiempo final

    memoria_actual, memoria_pico = tracemalloc.get_traced_memory()
    tracemalloc.stop()
    # Obtiene uso de memoria

    tiempo_promedio = (fin - inicio) / repeticiones
    # Calcula tiempo promedio

    return tiempo_promedio, memoria_pico


# Leer expresiones desde archivo
expresiones = leer_expresiones("expresiones.txt")

resultados = []

tiempos_cyk = []
tiempos_pred = []


for expr in expresiones:

    t_cyk, m_cyk = medir(cyk, expr)
    # Mide CYK

    t_pred, m_pred = medir(evaluar, expr)
    # Mide predictivo

    tiempos_cyk.append(t_cyk * 1000)
    tiempos_pred.append(t_pred * 1000)
    # Convertimos a milisegundos para mejor visualización

    resultados.append([
        expr,
        "CYK",
        f"{t_cyk:.6f}",
        f"{m_cyk / 1024:.2f} KB"
    ])

    resultados.append([
        expr,
        "Predictivo",
        f"{t_pred:.6f}",
        f"{m_pred / 1024:.2f} KB"
    ])


# 📊 TABLA EN CONSOLA
print("\nComparación de rendimiento:\n")
print(f"{'Expresión':<25} {'Algoritmo':<12} {'Tiempo (s)':<12} {'Memoria'}")
print("-" * 70)

for fila in resultados:
    print(f"{fila[0]:<25} {fila[1]:<12} {fila[2]:<12} {fila[3]}")


# 📈 GRÁFICA (USANDO ÍNDICES PARA EVITAR ERRORES)

x = list(range(len(expresiones)))
# Índices numéricos: 0,1,2,...

plt.figure()

plt.plot(x, tiempos_cyk, marker='o', label='CYK')
# Grafica CYK

plt.plot(x, tiempos_pred, marker='s', label='Predictivo')
# Grafica predictivo

plt.xlabel("Expresiones")
plt.ylabel("Tiempo promedio (ms)")
plt.title("Comparación CYK vs Predictivo")

plt.legend()
plt.grid()

# Etiquetas cortas para evitar saturación visual
plt.xticks(x, [f"E{i}" for i in range(len(expresiones))])

plt.tight_layout()

# 🔥 GUARDAR Y ABRIR AUTOMÁTICAMENTE (SOLUCIÓN DEFINITIVA)
plt.savefig("grafica.png")

print("\nGráfica guardada como: grafica.png")

os.startfile("grafica.png")
# Abre la imagen automáticamente en Windows


#  Mostrar equivalencia de expresiones
print("\nEquivalencia de expresiones:\n")

for i, expr in enumerate(expresiones):
    print(f"E{i}: {expr}")