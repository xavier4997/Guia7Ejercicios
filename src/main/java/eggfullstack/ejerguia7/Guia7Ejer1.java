/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eggfullstack.ejerguia7;

import java.util.Scanner;

/**
 *
 * @author xavier
 * Escribir un programa que pida dos números enteros por teclado y calcule 
 * la suma de los dos. El programa deberá después mostrar el resultado de 
 * la suma
 */
public class Guia7Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, sum;
        sum = 0;
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese el numero n("+i+")");
            num = leer.nextInt();
            sum = sum + num;
            
        }
        System.out.println("La suma es: "+sum);
    }
    
}
