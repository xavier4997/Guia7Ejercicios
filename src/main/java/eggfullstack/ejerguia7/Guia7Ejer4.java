/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eggfullstack.ejerguia7;

import java.util.Scanner;

/**
 *
 * @author xavier
 *  Dada una cantidad de grados centígrados se debe mostrar su equivalente 
 * en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class Guia7Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float c, f;
        System.out.print("Ingrese los grados centigrados: ");
        Scanner leer = new Scanner(System.in);
        
        c = leer.nextFloat();
        
        f =  32 + (9 * c / 5);
        
        System.out.println(c + "grados centigrados es "+ f +" grados farenheit");
        
        
    }
    
}
