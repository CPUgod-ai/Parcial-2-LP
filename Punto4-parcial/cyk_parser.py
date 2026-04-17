import re  # Para separar la expresión en tokens


def tokenizar(expr):
    tokens = re.findall(r'\d+|[()+\-*/]', expr)
    # Extrae números y operadores de la expresión
    return tokens


def cyk(expr):
    tokens = tokenizar(expr)  # Convierte la expresión en lista de tokens
    n = len(tokens)

    if n == 0:
        return False  # Expresión vacía no es válida

    table = [[set() for _ in range(n)] for _ in range(n)]
    # Crea tabla CYK de tamaño n x n

    # Llenar diagonal (casos base)
    for i in range(n):
        if tokens[i].isdigit():
            table[i][i].add('E')
            # Si es número, pertenece a la variable E

    # Algoritmo CYK
    for l in range(2, n + 1):
        # l = longitud de subcadena

        for i in range(n - l + 1):
            j = i + l - 1
            # Subcadena va de i a j

            for k in range(i, j):
                # Divide la subcadena en dos partes

                for b in table[i][k]:
                    for c in table[k + 1][j]:

                        if b == 'E' and c == 'E':
                            table[i][j].add('E')
                            # Regla simplificada: E -> E op E

    return 'E' in table[0][n - 1]
    # Si E está en la celda final, la expresión es válida


if __name__ == "__main__":
    print(cyk("3+4*5"))  # True