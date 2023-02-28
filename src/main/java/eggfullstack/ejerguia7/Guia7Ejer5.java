/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eggfullstack.ejerguia7;

import java.util.Scanner;

/**
 *
 * @author xavier
 * Escribir un programa que lea un número entero por teclado y muestre por 
 * pantalla el doble, el triple y la raíz cuadrada de ese número. 
 * Nota: investigar la función Math.sqrt()
 */
public class Guia7Ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        System.out.println("Ingresa un numero");
        
        Scanner leer = new Scanner(System.in);
        num = leer.nextInt();
        
        System.out.println("El doble de "+num+" es: "+ num*2);
        System.out.println("El triple de "+num+" es: "+ num*3);
        System.out.println("El cuadrado de "+num+" es: "+ Math.pow(num,2));
    }
    
}
