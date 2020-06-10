package Carlos;

import static Carlos.Token.*;
%%
%class LexerFlex
%type Token

//A = [""]
L = [a-zA-Z_]
D = [0-9]

WHITE=[ \t\r\n]
%{
public String lexeme;
%}
%%

{WHITE} {/*Ignore*/}

"=" { lexeme=yytext();return ASSIGN;}
"+" { lexeme=yytext();return SUMA;}
"*" { lexeme=yytext();return MULT;}
"-" { lexeme=yytext();return RESTA;}
"/" { lexeme=yytext();return DIV;}
"ยก"|"!" { lexeme=yytext(); return EXCLAMACION;}
"#" { lexeme=yytext(); return NUMERAL;}



"include" { lexeme=yytext(); return INCLUDE;}
"<iostream.h>" { lexeme=yytext(); return IOSTREAM;}
"<conio.h>" {lexeme=yytext(); return CONIO;}
"int" {lexeme=yytext(); return INT;}
"MAIN" { lexeme=yytext(); return MAIN;}
"("|")" { lexeme=yytext(); return PARENTESIS;}
"{"|"}" { lexeme=yytext(); return LLAVE;}
"cout" { lexeme=yytext(); return COUT;}
"<<"|">>" { lexeme=yytext(); return OPERACIONALES;}
"'" { lexeme=yytext(); return COMILLAS;}
"endl" { lexeme=yytext(); return ENDL;}
";" { lexeme=yytext(); return PUNTO_COMA;}
"getch" { lexeme=yytext(); return GETCH;}
   
//{A} { lexeme=yytext(); return COMILLAS;}
{L}({L}|{D})* { lexeme=yytext(); return CADENA;}
 ("(-"{D}+")")|{D}+ { lexeme=yytext(); return NUM;}
. {lexeme=yytext(); return ERROR;}
