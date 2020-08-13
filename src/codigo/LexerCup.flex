import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
DN="-"[0-9]+
espacio=[ ,\t,\r,#,\n]+
%{
   private Symbol symbol(int type, Object value){
		return new Symbol (type, yyline, yycolumn, value);
	}
	private Symbol symbol(int type){
		return new Symbol (type, yyline, yycolumn);
	}
%}
%%
Entero {return new Symbol(sym.Entero,yychar, yyline, yytext());}
Si {return new Symbol(sym.Si,yychar, yyline, yytext());}
Sino {return new Symbol(sym.Sino,yychar, yyline, yytext());}
Mientras {return new Symbol(sym.Mientras,yychar, yyline, yytext());}
Declarar {return new Symbol(sym.Declarar,yychar, yyline, yytext());}
Fin {return new Symbol(sym.Fin,yychar, yyline, yytext());}
Flotante {return new Symbol(sym.Flotante,yychar, yyline, yytext());}
Doble {return new Symbol(sym.Doble,yychar, yyline, yytext());}
Booleano {return new Symbol(sym.Booleano,yychar, yyline, yytext());}
Verdadero {return new Symbol(sym.Verdadero,yychar, yyline, yytext());}
Falso {return new Symbol(sym.Falso,yychar, yyline, yytext());}
Cadena {return new Symbol(sym.Cadena,yychar, yyline, yytext());}
Clase {return new Symbol(sym.Clase,yychar, yyline, yytext());}
Retornar {return new Symbol(sym.Retornar,yychar, yyline, yytext());}
Imagen {return new Symbol(sym.Imagen,yychar, yyline, yytext());}
Largo {return new Symbol(sym.Largo,yychar, yyline, yytext());}
Ancho {return new Symbol(sym.Ancho,yychar, yyline, yytext());}
Funcion {return new Symbol(sym.Funcion,yychar, yyline, yytext());}
Posicion {return new Symbol(sym.Posicion,yychar, yyline, yytext());}
Ruta {return new Symbol(sym.Ruta,yychar, yyline, yytext());}
Ingresa {return new Symbol(sym.Ingresa,yychar, yyline, yytext());}
Imprime {return new Symbol(sym.Imprime,yychar, yyline, yytext());}

{espacio} {/*Ignore*/}
"$".*"$" {/*Ignore*/}
"=" {return new Symbol(sym.Igual,yychar, yyline, yytext());}
"+" {return new Symbol(sym.Suma,yychar, yyline, yytext());}
"-" {return new Symbol(sym.Resta,yychar, yyline, yytext());}
"*" {return new Symbol(sym.Multiplicacion,yychar, yyline, yytext());}
"/" {return new Symbol(sym.Division,yychar, yyline, yytext());}
"&" {return new Symbol(sym.Y,yychar, yyline, yytext());}
"%" {return new Symbol(sym.O,yychar, yyline, yytext());}
"!" {return new Symbol(sym.No,yychar, yyline, yytext());}
">" {return new Symbol(sym.Mayor,yychar, yyline, yytext());}
"<" {return new Symbol(sym.Menor,yychar, yyline, yytext());}
"==" {return new Symbol(sym.Equivale,yychar, yyline, yytext());}
"!=" {return new Symbol(sym.Diferente,yychar, yyline, yytext());}
">=" {return new Symbol(sym.MayorIgual,yychar, yyline, yytext());}
"<=" {return new Symbol(sym.MenorIgual,yychar, yyline, yytext());}
";" {return new Symbol(sym.finSentencia,yychar, yyline, yytext());}
"(" {return new Symbol(sym.agrupacionIzquierda,yychar, yyline, yytext());}
")" {return new Symbol(sym.agrupacionDerecha,yychar, yyline, yytext());}
":" {return new Symbol(sym.DosPuntos,yychar, yyline, yytext());}
"{" {return new Symbol(sym.abreLlave,yychar, yyline, yytext());}
"}" {return new Symbol(sym.cierraLlave,yychar, yyline, yytext());}
"[" {return new Symbol(sym.abreCorchete,yychar, yyline, yytext());}
"]" {return new Symbol(sym.cierraCorchete,yychar, yyline, yytext());}
"Inicio" {return new Symbol(sym.Inicio,yychar, yyline, yytext());}

{L}({L}|{D}|"_")* {return new Symbol(sym.Identificador,yychar, yyline, yytext());}
"\"".*"\"" {return new Symbol(sym.C_Cadena,yychar, yyline, yytext());}
{D} {return new Symbol(sym.Numero,yychar, yyline, yytext());}
{D}"."{D} {return new Symbol(sym.NumeroFlotante,yychar, yyline, yytext());}
{D}{L}|"("{D}{L}")" {return new Symbol(sym.ErrorIdentificador,yychar, yyline, yytext());}
({D}".")+{D}* | {D}"."+ {return new Symbol(sym.ErrorNumero,yychar, yyline, yytext());}
 . {return new Symbol(sym.ERROR,yychar, yyline, yytext());}
