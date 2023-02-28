/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eggfullstack.ejerguia7;

import java.util.Scanner;

/**
 *
 * @author xavier
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios
 * y le pida al usuario un numero a buscar en el vector. El programa mostrará 
 * donde se encuentra el numero y si se encuentra repetido
 */
public class Guia7Ejer16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, num;
        
        System.out.println("Ingrese la longitud del vector");
        
        Scanner leer = new Scanner(System.in);
        n = leer.nextInt();
        int[] arreglo = new int[n];
        
        crearVector(arreglo,n);
        mostrarVector(arreglo,n);
        
        System.out.println("Ingrese el numero a buscar:" );
        num = leer.nextInt();
        busqueda(arreglo,n,num);      
    }
    
    //FUNCION RELLENAR VECTOR
    public static void crearVector(int[] vector, int dimension){
        for (int i = 0; i < dimension; i++) {
            int x =  (int) (Math.random() * 99);     
            vector[i] = x;  
        } 
    } 
    
    //FUNCION PRESENTAR EN PANTALLA VECTOR
    public static void mostrarVector(int[] vector, int dimension){
        System.out.print("[");
        for (int i = 0; i < dimension; i++) {
            System.out.print(vector[i]+",");
        }
        System.out.println("]");
    }
    
    // FUNCION BUSCAR NUMERO Y VERIFICAR SI ES REPETIDO
    public static void busqueda(int[] vector, int dimension, int numero){
        for (int i = 0; i < dimension; i++) {
            if (vector[i] == numero){
                System.out.println("El numero "+numero+" esta en posicion "+i);
            } 
            
        }
        System.out.println("No existe");
    }
}
