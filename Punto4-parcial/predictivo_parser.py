import re  # Para dividir la expresión


def tokenizar(expr):
    tokens = re.findall(r'\d+|[()+\-*/]', expr)
    # Separa números y operadores
    return tokens


class Parser:

    def __init__(self, expr):
        self.tokens = tokenizar(expr)  # Lista de tokens
        self.pos = 0  # Posición actual

    def actual(self):
        if self.pos < len(self.tokens):
            return self.tokens[self.pos]
            # Retorna el token actual sin avanzar
        return None

    def consumir(self, t):
        if self.actual() == t:
            self.pos += 1
            # Avanza si el token coincide
        else:
            raise SyntaxError("Token inesperado")

    def parse(self):
        resultado = self.E()  # Empieza desde la regla inicial

        if self.pos != len(self.tokens):
            raise SyntaxError("Expresión inválida")
            # Si quedan tokens, hay error

        return resultado

    def E(self):
        resultado = self.T()
        # E empieza evaluando un término

        while self.actual() is not None and self.actual() in ('+', '-'):
            # Verifica primero que no sea None

            op = self.actual()
            self.consumir(op)

            if op == '+':
                resultado += self.T()
                # Suma el siguiente término
            else:
                resultado -= self.T()
                # Resta el siguiente término

        return resultado

    def T(self):
        resultado = self.F()
        # T empieza con un factor

        while self.actual() is not None and self.actual() in ('*', '/'):
            # Verifica que no sea None antes de comparar

            op = self.actual()
            self.consumir(op)

            if op == '*':
                resultado *= self.F()
                # Multiplica por el siguiente factor
            else:
                divisor = self.F()

                if divisor == 0:
                    raise ZeroDivisionError("División por cero")

                resultado /= divisor
                # Divide entre el siguiente factor

        return resultado

    def F(self):
        token = self.actual()
        # Guarda el token actual para no llamarlo varias veces

        if token is not None and token.isdigit():
            valor = int(token)
            self.pos += 1
            # Lee un número
            return valor

        elif token == '(':
            self.consumir('(')
            valor = self.E()
            self.consumir(')')
            # Evalúa expresión entre paréntesis
            return valor

        else:
            raise SyntaxError("Factor inválido")


def evaluar(expr):
    return Parser(expr).parse()
    # Función externa para usar en benchmark


if __name__ == "__main__":
    print(evaluar("3+4*5"))  # 23