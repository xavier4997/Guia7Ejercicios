/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eggfullstack.ejerguia7;

import java.util.Scanner;

/**
 *
 * @author xavier
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” 
 * el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
 * Nota: investigar la función equals() en Java.
 */
public class Guia7Ejer7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase;
        System.out.println("Ingresa la palabra eureka");
        Scanner leer = new Scanner(System.in);
        frase = leer.next();
        if (frase.equalsIgnoreCase("eureka")){
            System.out.println("Correcto");
        } else System.out.println("Incorrecto");
                
    }
    
}
