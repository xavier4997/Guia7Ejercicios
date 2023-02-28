/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eggfullstack.ejerguia7;

import java.util.Scanner;

/**
 *
 * @author xavier
 * Escriba un programa que pida una frase o palabra y valide si la primera letra 
 * de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir 
 * un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá 
 * imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
public class Guia7Ejer9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase, frase1;
        
        System.out.println("Ingresa una palabra o frase");
        Scanner leer = new Scanner(System.in);
        frase = leer.nextLine();
        //frase1 = frase.substring(0, 1);
        //System.out.println("frase1 = "+frase1);
        if ((frase.substring(0, 1)).equals("A")){
            System.out.println("CORRECTO");
        }else System.out.println("INCORRECTO");
    }
    
}
