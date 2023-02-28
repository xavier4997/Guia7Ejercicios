/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eggfullstack.ejerguia7;

/**
 *
 * @author xavier
 * Realizar un algoritmo que rellene un vector con los 100 primeros números 
 * enteros y los muestre por pantalla en orden descendente.
 */
public class Guia7Ejer15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[100];
      
        crearVector(vector);
        mostrarVector(vector);
        mostrarVectorInverso(vector);
    }
    
    public static void crearVector(int[] vector){
        for (int i = 0; i < 100; i++) {
            vector[i] = i;
            
        }       
    }
    
    public static void mostrarVector(int[] vector){
        System.out.print("[");
        for (int i = 0; i < 100; i++) {
            System.out.print(vector[i]+",");
        }
        System.out.println("]");
    }
    
    public static void mostrarVectorInverso(int[] vector){
        System.out.print("[");
        for (int i = 99; i > -1; i--) {
            System.out.print(vector[i]+",");
        }
        System.out.print("]");
    }
}
