/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


/**
 *
 * @author Nova cara de cola
 */
public class Lexico {
    public static void main(String[] args) throws Exception {
        String ruta = "/Users/erick/Downloads/Descargas-Jun2020/Babel/src/codigo/Lexer.flex";
        String ruta2 = "/Users/erick/Downloads/Descargas-Jun2020/Babel/src/codigo/LexerCup.flex";
        String[] rutaS =
        {
            "-parser" , "Sintax" , "/Users/erick/Downloads/Descargas-Jun2020/Babel/src/codigo/Sintax.cup"
        };
		lexerGT(ruta, ruta2, rutaS);
    }
    
    public static void lexerGT(String ruta, String ruta2, String[] rutaS) throws IOException, Exception{
        File archivo; 
				archivo= new File(ruta);
        JFlex.Main.generate(archivo);
		
				archivo= new File(ruta2);
        JFlex.Main.generate(archivo);
		
		java_cup.Main.main( rutaS );
		
        Path rutaSym = Paths.get( "/Users/erick/Downloads/Descargas-Jun2020/Babel/src/codigo/sym.java" );
		if (Files.exists(rutaSym)){
			Files.delete( rutaSym );
		}
		Files.move(
                Paths.get( "/Users/erick/Downloads/Descargas-Jun2020/Babel/sym.java" ) ,
                Paths.get( "/Users/erick/Downloads/Descargas-Jun2020/Babel/src/codigo/sym.java" )
				);
        Path rutaSin = Paths.get( "/Users/erick/Downloads/Descargas-Jun2020/Babel/src/codigo/Sintax.java" );
		if (Files.exists(rutaSin)){
			Files.delete( rutaSin );
		}
		
		Files.move(
                Paths.get( "/Users/erick/Downloads/Descargas-Jun2020/Babel/Sintax.java" ) ,
                Paths.get( "/Users/erick/Downloads/Descargas-Jun2020/Babel/src/codigo/Sintax.java" )
				);
    }
}
