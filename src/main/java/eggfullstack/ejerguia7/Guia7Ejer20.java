/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eggfullstack.ejerguia7;


import java.util.Scanner;

/**
 *
 * @author xavier
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
 * Crear un programa que permita introducir un cuadrado por teclado y determine 
 * si este cuadrado es mágico o no. El programa deberá comprobar que los números 
 * introducidos son correctos, es decir,están entre el 1 y el 9.
 */
public class Guia7Ejer20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, m;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el No. de filas");
        n = leer.nextInt();
        System.out.println("Ingrese el No. de columnas");
        m = leer.nextInt();
        
        int[][] arreglo = new int[n][m];
        
        crearMatriz(arreglo, m, n);
        presentarMatriz(arreglo, m, n);
        
    }
    
    
    
    // FUNCION CREAR DE LA MATRIZ
    public static void crearMatriz(int[][] matriz, int fila, int columna){
        Scanner leer = new Scanner(System.in);
        System.out.println("");
        System.out.println("Ingrese los datos");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                //int x = (int) (Math.random() * 10);
                //int x = leer.nextInt();
                matriz[i][j] = leer.nextInt();               
            }           
        }
    }
    
    // FUNCION PRESENTACION DE LA MATRIZ
    public static void presentarMatriz(int[][] matriz, int fila, int columna){
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++){
                System.out.printf("% 4d", matriz[i][j]);
            }
            System.out.println("");
        }        
    }
    
    // FUNCION SUMAS
    
}
