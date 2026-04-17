grammar CRUD;

// ─── PARSER ──────────────────────────────────────────────────

programa
    : sentencia+ EOF
    ;

sentencia
    : insertar SEMICOLON
    | buscar   SEMICOLON
    | actualizar SEMICOLON
    | eliminar SEMICOLON
    ;

insertar
    : INSERT INTO ID LBRACE lista RBRACE
    ;

buscar
    : FIND FROM ID (WHERE condicion)?
    ;

// ASSIGN para SET campo = valor  (distinto de EQ que es ==)
actualizar
    : UPDATE ID SET campo ASSIGN valor (WHERE condicion)?
    ;

eliminar
    : DELETE FROM ID WHERE condicion
    ;

lista
    : campo COLON valor (COMMA campo COLON valor)*
    ;

condicion
    : valor op valor
    | condicion AND condicion
    | condicion OR  condicion
    | NOT condicion
    | LPAREN condicion RPAREN
    ;

op  : EQ | NEQ | LT | GT | LTE | GTE ;

valor
    : valor (PLUS | MINUS) valor
    | valor (MULT  | DIV)  valor
    | INT
    | FLOAT
    | STRING
    | BOOL
    | NULL
    | ID
    | LPAREN valor RPAREN
    ;

campo : ID ;

// ─── LEXER ───────────────────────────────────────────────────

INSERT      : 'INSERT' ;
INTO        : 'INTO'   ;
FIND        : 'FIND'   ;
FROM        : 'FROM'   ;
WHERE       : 'WHERE'  ;
UPDATE      : 'UPDATE' ;
SET         : 'SET'    ;
DELETE      : 'DELETE' ;
AND         : 'AND'    ;
OR          : 'OR'     ;
NOT         : 'NOT'    ;
NULL        : 'NULL'   ;
BOOL        : 'true' | 'false' ;

// Comparación
EQ          : '==' ;
NEQ         : '!=' ;
LTE         : '<=' ;
GTE         : '>=' ;
LT          : '<'  ;
GT          : '>'  ;

// Asignación (SET campo = valor)
ASSIGN      : '='  ;

// Aritméticos
PLUS        : '+'  ;
MINUS       : '-'  ;
MULT        : '*'  ;
DIV        : '/'  ;

// Delimitadores
LBRACE      : '{' ;
RBRACE      : '}' ;
LPAREN      : '(' ;
RPAREN      : ')' ;
SEMICOLON   : ';' ;
COLON       : ':' ;
COMMA       : ',' ;

// Literales
FLOAT       : [0-9]+ '.' [0-9]+ ;
INT         : [0-9]+ ;
STRING      : '"' (~["\r\n])* '"' ;
ID          : [a-zA-Z_][a-zA-Z0-9_]* ;

WS          : [ \t\r\n]+ -> skip ;
COMMENT     : '//' ~[\r\n]* -> skip ;


