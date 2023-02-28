/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eggfullstack.ejerguia7;

import java.util.Scanner;

/**
 *
 * @author xavier
 * Leer la altura de N personas y determinar el promedio de estaturas que se 
 * encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
public class Guia7Ext06Altura {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N;
        
        System.out.println("Ingrese numero de personas: ");
        Scanner leer = new Scanner(System.in);
        N = leer.nextInt();
        float[] arreglo = new float[N];
        
        crearVector(arreglo,N);
        mostrarVector(arreglo, N);
        promedio(arreglo,N);
    }
    
    public static void crearVector(float[] vector, int dimension){
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < dimension; i++) {
            System.out.println("Ingrese v["+i+"]");
            vector[i] = leer.nextFloat();
        }
    }
    
    public static void mostrarVector(float[] vector, int dimension){
        String aux = "";
        
        for (float elemento: vector){
            aux = aux + " " + elemento;  
        }
        System.out.println(aux);
    }
          
       
    public static void promedio(float[] vector, int dimension){    
        int cont = 0;
        int cont1 = 0;
        float sum, sum1, promedio, promedio1;
        sum = 0;
        sum1 = 0;
        promedio = 0;
        promedio1 = 0;
        for (int i = 0; i < dimension; i++) {
            sum = sum + vector[i];
            cont++;
            if (vector[i]<=1.60){
                sum1 = sum1 + vector[i];
                cont1++;
            }
        }
        promedio = sum / cont;
        promedio1 = sum1 / cont1;
    System.out.println("El promedio de estaturas menores a 1,60 = "+promedio1);
    System.out.println("El promedio total es = "+promedio);
    }
}
