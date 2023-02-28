/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eggfullstack.ejerguia7;

import java.util.Scanner;

/**
 *
 * @author xavier
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
 * después toda en minúsculas. 
 * Nota: investigar la función toUpperCase() y toLowerCase() en Java
 */
public class Guia7Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase, mayusc, minusc;
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese una frase: ");
        frase = leer.nextLine();
        
        mayusc = frase.toUpperCase();
        minusc = frase.toLowerCase();
        
        System.out.println(mayusc);
        System.out.println(minusc);
    }
    
}
