/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eggfullstack.ejerguia7;

import java.util.Scanner;

/**
 *
 * @author xavier
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
 * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar 
 * lo siguiente:
* * * *
*     *
*     *
* * * *
 */
public class Guia7Ejer13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int dimension;
        
        System.out.println("Ingrese la dimension del lado del cuadrado");
        dimension = leer.nextInt();
        
        for (int i = 0; i < (dimension); i++) {
            System.out.print("* ");           
        }
        System.out.println("");
        for (int i = 0; i < dimension -2; i++) {
            System.out.print("*");
            for (int j = 0; j < (dimension -2)+ (dimension -1); j++) {
                System.out.print(" ");
            }
        System.out.print("");
        System.out.println("*");
        }
        for (int i = 0; i < (dimension); i++) {
            System.out.print("* ");           
        }
    }
    
}
