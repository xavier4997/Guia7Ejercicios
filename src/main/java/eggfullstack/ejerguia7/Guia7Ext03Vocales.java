/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eggfullstack.ejerguia7;

import java.util.Scanner;

/**
 *
 * @author xavier
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata 
 * de una vocal. Caso contrario mostrar un mensaje. 
 * Nota: investigar la función equals() de la clase String.
 */
public class Guia7Ext03Vocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String letra;
        
        do{
            
            System.out.println("Ingrese una letra. La 'x' para salir");
            
            Scanner leer = new Scanner(System.in);
            letra = leer.nextLine();

            if ((letra.equalsIgnoreCase("a"))
                    ||(letra.equalsIgnoreCase("e"))
                    ||(letra.equalsIgnoreCase("i"))
                    ||(letra.equalsIgnoreCase("o"))
                    ||(letra.equalsIgnoreCase("u"))){
                System.out.println("VOCAL");

            } else System.out.println("No es una vocal");
        
        } while (!"x".equals(letra));
    }
    
}
