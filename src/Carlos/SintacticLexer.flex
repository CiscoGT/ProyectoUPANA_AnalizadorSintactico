package Carlos;
import java.io.*;

import static Carlos.SintacticTokens.*;
%%
%class LexerSintax
%type SintacticTokens

NUMERAL=[#]
INCLUDE="include"
LIBRERIA="<iostream.h>"
LIBRERIA2="<conio.h>"
INT="int"
MAIN="main"
SPACE=" "
PARENTI="()"
LLAVEI= "{"
LLAVED= "}"
ST= "std"
COU = "cout"
COMP="<"
HOLA=[a-zA-z]
NUM=[0-9]
ENDL="endl"
PUNTO_COMA=[;]
GETCH="getch"




WHITE=[ \t\r\n]
%{
public String lexeme;
%}
%%


{WHITE} {/* ignore */}
"//".* {/* ignore */}




{NUMERAL}{INCLUDE}{LIBRERIA} {lexeme=yytext(); return LINEA1_CORRECTO;}
{NUMERAL}{INCLUDE}{LIBRERIA2} {lexeme=yytext(); return LINEA2_CORRECTO;}
{INT}{SPACE}{MAIN}{PARENTI} {lexeme=yytext(); return LINEA3_CORRECTO;}
{LLAVEI} {lexeme=yytext(); return LINEA4_CORRECTO;}
{COU}{COMP}{COMP}{HOLA}{COMP}{COMP}{ENDL}{PUNTO_COMA} {lexeme=yytext(); return LINEA5_CORRECTO;}
{GETCH}{PARENTI}{PUNTO_COMA} {lexeme=yytext(); return LINEA6_CORRECTO;}
{LLAVED} {lexeme=yytext(); return LINEA7_CORRECTO;}

. {return ERROR;}

