/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carlos;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Carlos Bautista
 */

public class GenerarCodigo 
{
     public static void main(String[] args) throws Exception 
    {
        
        String ruta1="C:/Users/TeamIT/Documents/NetBeansProjects/AnalizadorSintactico/src/Carlos/SintacticLexer.flex";
            String ruta2="C:/Users/TeamIT/Documents/NetBeansProjects/AnalizadorSintactico/src/Carlos/Lexer.flex";
                
                
             generarDatos(ruta1, ruta2);
    }
    
    
     
     //--------------------Generamos codigo------------------------
     public static void generarDatos(String ruta1, String ruta2) throws IOException, Exception
    {
        File archivo;
        
        archivo = new File(ruta1);
        JFlex.Main.generate(archivo);
        
        archivo =new File(ruta2);
        JFlex.Main.generate(archivo);
		
        
    }
    
}
