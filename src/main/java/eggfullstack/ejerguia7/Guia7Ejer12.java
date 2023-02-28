/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eggfullstack.ejerguia7;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author xavier
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
 * este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas 
 * deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres 
 * de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
 * Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
 * especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia 
 * distinta de FDE, que no respete el formato se considera incorrecta.
 * Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
 * correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar 
 * cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
public class Guia7Ejer12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String cadena ;
        String bandera = "N";
        int suma = 0;
        int suma1 = 0;
        
        do {
            System.out.println("Ingrese una cadena de 5 caracteres, el primero 'X' el ultimo 'O'");
            cadena = leer.nextLine();
            if (cadena.length()==5){
                if (cadena.substring(0, 1).equalsIgnoreCase("X")) {
                    if (cadena.substring(4).equalsIgnoreCase("O")){
                    suma = suma + 1; 
                    } else { suma1 = suma1 + 1;
                    
                    }
                } 
                       
            } else { suma1 = suma +1;
            
            }
            
            if (cadena.equals("&&&&&")){
                bandera = "S";
            }
          
        } while (bandera.equals("N"));
         
        System.out.println("Cadenas CORRECTAS: " + suma);
        System.out.println("Cadenas INCORRECTAS: " + suma1);
    }
    
}
