/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eggfullstack.ejerguia7;

import java.util.Scanner;

/**
 *
 * @author xavier
 */
public class Guia7Ext24Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        System.out.println("Ingrese un numero entero: ");
        Scanner leer = new Scanner(System.in);
        n = leer.nextInt();
        int[] arreglo = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1){
                arreglo[i] = 1;               
            } else {            
                arreglo[i] = arreglo[i-1] + arreglo[i-2];
            }   
        }
        mostrarVector(arreglo,n);
    }       

    public static void mostrarVector(int[] vector, int dimension){
        String aux = "";
        for (int elemento: vector) {
            aux = aux + " " + elemento;           
        }
        System.out.println(aux);

    }
    
}
        
        

        
       
        