/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eggfullstack.ejerguia7;

import java.util.Scanner;

/**
 *
 * @author xavier
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo 
 * muestre por pantalla.
 */
public class Guia7Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        nombre = leer.nextLine();
        
        System.out.println("Mi nombre es "+nombre);
        
    }
    
}
