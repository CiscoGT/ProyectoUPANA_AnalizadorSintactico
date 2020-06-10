import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author cristian,victor 
 */
public class CodigoGenerado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        System.out.println("Ingrese el valor a ser evaluado");        StringBuffer bufferEntrada = new StringBuffer(new BufferedReader(new InputStreamReader(System.in)).readLine());
        String entradaIni = bufferEntrada.toString();
        int estadoInicial = 0;
        StringBuffer entradaActual = bufferEntrada;
        int estadoActual = estadoInicial;
        String alfabeto = "a";
        String erpRegular = "(a|b)*a+c?";
        int cantidadEstado = 5;
        int [] eFinales = {1,3,4};
        if(bufferEntrada.length()>0){
            while(true){
                switch(estadoActual){
                    case 0:
                        switch(entradaActual.charAt(0)){
                            case 'a' :
                                entradaActual.deleteCharAt(0);
                                estadoActual = 1;
                                break;
                            case 'b' :
                                entradaActual.deleteCharAt(0);
                                estadoActual = 2;
                                break;
                        default:
                                estadoActual = cantidadEstado +1;
                                break;                        
                        }
                      break;

                    case 1:
                        switch(entradaActual.charAt(0)){
                            case 'a' :
                                entradaActual.deleteCharAt(0);
                                estadoActual = 3;
                                break;
                            case 'b' :
                                entradaActual.deleteCharAt(0);
                                estadoActual = 2;
                                break;
                            case 'c' :
                                entradaActual.deleteCharAt(0);
                                estadoActual = 4;
                                break;
                        default:
                                estadoActual = cantidadEstado +1;
                                break;                        
                        }
                      break;

                    case 2:
                        switch(entradaActual.charAt(0)){
                            case 'a' :
                                entradaActual.deleteCharAt(0);
                                estadoActual = 1;
                                break;
                            case 'b' :
                                entradaActual.deleteCharAt(0);
                                estadoActual = 2;
                                break;
                        default:
                                estadoActual = cantidadEstado +1;
                                break;                        
                        }
                      break;

                    case 3:
                        switch(entradaActual.charAt(0)){
                            case 'a' :
                                entradaActual.deleteCharAt(0);
                                estadoActual = 3;
                                break;
                            case 'b' :
                                entradaActual.deleteCharAt(0);
                                estadoActual = 2;
                                break;
                            case 'c' :
                                entradaActual.deleteCharAt(0);
                                estadoActual = 4;
                                break;
                        default:
                                estadoActual = cantidadEstado +1;
                                break;                        
                        }
                      break;

                    case 4:
                        switch(entradaActual.charAt(0)){
                        default:
                                estadoActual = cantidadEstado +1;
                                break;                        
                        }
                      break;

                    default:
                        break;   
                }
                if(estadoActual>cantidadEstado || entradaActual.length() == 0){
                    int aux = 0;
    //                System.out.println(estadoActual);
                    for(int i = 0; i< eFinales.length; i++ )
                        if(eFinales[i] == estadoActual) aux = 1;

                    if(aux == 1)System.out.println("El Lenguaje: L( "+erpRegular+" )"+
                                                    " \nEl Alfabeto:" +alfabeto+
                                                    "\nACEPTA LA CADENA DE ENTRADA: "+entradaIni);
                    else  System.out.println("El Lenguaje: L\"( "+erpRegular+" )"+
                                                    " \nEl Alfabeto:" +alfabeto+
                                                    "\nNO ACEPTA LA CADENA DE ENTRADA: "+entradaIni+
                                                    "\nEntrada no consumida: "+entradaActual.toString());

                    break;
                }

            }
        }
    }
}
