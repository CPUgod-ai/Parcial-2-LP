%{
#include <stdio.h>
#include <stdlib.h>

void yyerror(const char *s);
int yylex();
%}

%union {
    int bval;
}

/* Tokens terminales */
%token <bval> TRUE FALSE
%token AND OR NOT LPAREN RPAREN

/* Tipo del no-terminal expr */
%type <bval> expr

/* Precedencia: menor a mayor, NOT tiene más que OR y AND */
%left OR
%left AND
%right NOT

%%

programa:
    /* vacío */
    | programa linea
;

linea:
    expr '\n'   { printf("Resultado: %s\n\n", $1 ? "TRUE" : "FALSE"); }
    | '\n'
    | error '\n' { yyerrok; }
;

expr:
    TRUE                    { $$ = 1; }
    | FALSE                 { $$ = 0; }
    | expr AND expr         { $$ = $1 && $3; }
    | expr OR  expr         { $$ = $1 || $3; }
    | NOT expr              { $$ = !$2; }
    | LPAREN expr RPAREN    { $$ = $2; }
;

%%

void yyerror(const char *s) {
    fprintf(stderr, "Error sintáctico: %s\n", s);
}

int main() {
    printf("Calculadora Booleana (Ctrl+D para salir)\n");
    printf("==========================================\n");
    return yyparse();
}


