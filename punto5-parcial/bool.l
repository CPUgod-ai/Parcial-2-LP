%{
#include "bool.tab.h"
%}

%%
"TRUE"          { return TRUE; }
"FALSE"         { return FALSE; }
"AND"           { return AND; }
"OR"            { return OR; }
"NOT"           { return NOT; }
"("             { return LPAREN; }
")"             { return RPAREN; }
\n          { return '\n'; }  
[ \t\r]     { /* ignorar */ }  
.               { printf("Caracter desconocido: %s\n", yytext); }

%%

int yywrap() { return 1; }

