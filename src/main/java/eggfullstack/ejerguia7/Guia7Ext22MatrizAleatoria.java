/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eggfullstack.ejerguia7;

import java.util.Scanner;

/**
 *
 * @author xavier
 * Realizar un programa que rellene una matriz de tamaño NxM con valores 
 * aleatorios y muestre la suma de sus elementos.
 */
public class Guia7Ext22MatrizAleatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N,M;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese numero de filas: ");
        N = leer.nextInt();
        System.out.print("Ingrese numero de columnas: ");
        M = leer.nextInt();
        int[][] arreglo = new int[N][M];
        
        
        crearMatriz(arreglo,N,M);
        mostrarMatriz(arreglo,N,M);
        sumaMatriz(arreglo,N,M);
        
    }
    
    // FUNCION CREAR MATRIZ
    
    public static void crearMatriz(int[][] matriz, int fila, int columna){
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matriz[i][j] = (int) (Math.random()*10);
            
            }
            
        }
    }
    
    // FUNCION MOSTRAR MATRIZ
    
    public static void mostrarMatriz(int[][] matriz, int fila, int columna){
        String aux;
        for (int[] filamatriz: matriz){
            aux = "";
            for (int elemento: filamatriz){
                aux = aux + " " + elemento;
            }
            System.out.println(aux);
        }
        
    }
    
    // FUNCION SUMA
    
    public static void sumaMatriz(int[][] matriz, int fila, int columna){
        
        int sum = 0;
        for (int[] filamatriz: matriz){          
            for (int elemento: filamatriz){
                sum = sum + elemento;
            }
            //System.out.println(sum);
        }
        System.out.println(sum);
    }
}
