import static codigo.Tokens.*;
%%
%class Lexer
%char
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
DN="-"[0-9]+
espacio=[ ,\t,\r,#]+
%{
    public String lexeme;
    String cadena="";
    PintarPalabras pintar = new PintarPalabras();
%}
%%

Entero {pintar.pintaNara(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return PalabrasR;}
Si {pintar.pintaAzul(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return PalabrasR;}
Sino {pintar.pintaAzul(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return PalabrasR;}
Mientras {pintar.pintaAzul(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return PalabrasR;}
Declarar {pintar.pintaAzul(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return PalabrasR;}
Booleano {pintar.pintaNara(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return PalabrasR;}
Verdadero {pintar.pintaNara(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return PalabrasR;}
Falso {pintar.pintaNara(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return PalabrasR;}
Cadena {pintar.pintaAzul(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return PalabrasR;}
Clase {pintar.pintaAzul(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return PalabrasR;}
Flotante {pintar.pintaNara(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return PalabrasR;}
Doble {pintar.pintaNara(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return PalabrasR;}
Retornar {pintar.pintaAzul(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return PalabrasR;}
Imagen {pintar.pintaAzul(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return PalabrasR;}
Tamaño {pintar.pintaNara(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return PalabrasR;}
Largo {pintar.pintaNara(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return PalabrasR;}
Ancho {pintar.pintaNara(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return PalabrasR;}
Funcion {pintar.pintaAzul(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return PalabrasR;}
Posicion {pintar.pintaAzul(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return PalabrasR;}
Ruta {pintar.pintaNara(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return PalabrasR;}
Ingresa {pintar.pintaAzul(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return PalabrasR;}
Imprime {pintar.pintaAzul(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return PalabrasR;}


{espacio} {/*Ignore*/}
"$".*"$" {pintar.pintaVerCla(yychar,yylength());/*Ignore*/}
"=" {lexeme=yytext(); return OpAritmetico;}
"+" {lexeme=yytext(); return OpAritmetico;}
"-" {lexeme=yytext(); return OpAritmetico;}
"*" {lexeme=yytext(); return OpAritmetico;}
"/" {lexeme=yytext(); return OpAritmetico;}
"&" {lexeme=yytext(); return OpLogico;}
"%" {lexeme=yytext(); return OpLogico;}
"!" {lexeme=yytext(); return No;}
">" {lexeme=yytext(); return OpRelacional;}
"<" {lexeme=yytext(); return OpRelacional;}
"==" {lexeme=yytext(); return OpRelacional;}
"!=" {lexeme=yytext(); return OpRelacional;}
">=" {lexeme=yytext(); return OpRelacional;}
"<=" {lexeme=yytext(); return OpRelacional;}
"\n" {lexeme=yytext(); return Salto;}
";" {lexeme=yytext(); return finSentencia;}
"(" {lexeme=yytext(); return agrupacionIzquierda;}
")" {lexeme=yytext(); return agrupacionDerecha;}
":" {lexeme=yytext(); return DosPuntos;}
"{" {lexeme=yytext(); return abreLlave;}
"}" {lexeme=yytext(); return cierraLlave;}
"[" {lexeme=yytext(); return abreCorchete;}
"]" {lexeme=yytext(); return cierraCorchete;}
"Inicio" {pintar.pintaAzul(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return PalabrasR;}
"Fin" {pintar.pintaAzul(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return PalabrasR;}

{L}({L}|{D}|"_")* {lexeme=yytext(); return Identificador;}
"\"".*"\"" {lexeme=yytext(); return C_Cadena;}
{D} {lexeme=yytext(); return Numero;}
{D}"."{D}|"("{D}")"|"("{D}"."{D}")"|"("{DN}"."{D}")" {lexeme=yytext(); return NumeroFlotante;}
{D}{L}|"("{D}{L}")" {pintar.pintaRojo(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return ErrorIdentificador;}
({D}".")+{D}* | {D}"."+ {pintar.pintaRojo(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return ErrorNumero;}
 . {pintar.pintaRojo(yychar,yylength()); pintar.pintaDef(yychar+yylength(),1); lexeme=yytext(); return ERROR;}
