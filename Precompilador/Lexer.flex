package analizador;
import static analizador.Token.*;
%%
%class Lexer
%type Token
WHITE=[ \t\r\n]
%{
public String lexeme;
%}
%%
{WHITE} {/*Ignore*/}
"#" {return EXISTE;}
"@" {return PARATODO;}
"¬"|"~" {return NEGACION;}
"|" {return DISYUNCION;}
"^"|"&" {return CONJUNCION;}
"="">" {return IMPLICACION;}
"(" {return PA;} 
")" {return PC;} 
"," {return COMA;} 
[a-z][a-z]* {lexeme=yytext(); return IDVAR; //Los nombres de las variables siempre estan escritos en Minuscula}
[A-Z][A-Z]* {lexeme=yytext(); return IDFUNC;//Los nombres de las funciones siempre estan escritos en Mayusculas}
[A-Z][a-zA-Z]* {lexeme=yytext(); return IDPRED;//Los nombres de los predicados Siempren comienzan con una Mayuscula y tienen al menos una letra en Minuscula}
. {return ERROR;}