/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eggfullstack.ejerguia7;

import java.util.Scanner;

/**
 *
 * @author xavier
 * Realice un programa que compruebe si una matriz dada es anti simétrica. 
 * Se dice que una matriz A es anti simétrica cuando ésta es igual a su propia 
 * traspuesta, pero cambiada de signo. Es decir, A es anti simétrica si A = -AT. 
 * La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando 
 * sus filas por columnas (o viceversa).
 */
public class Guia7Ejer19 {

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
        int[][] transpuesta = new int[n][m];
        
        crearMatriz(arreglo,n,m);
        presentarMatriz(arreglo,n,m);
        System.out.println("");
        crearTranspuesta(arreglo,transpuesta, m, n);
        presentarMatriz(transpuesta,n,m);
         
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
    
    // FUNCION TRANSPUESTA
    public static void crearTranspuesta(int[][] matriz, int[][] matriz1, int fila, int columna){
        System.out.println("");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matriz1[j][i] = matriz[i][j];               
            }           
        }
    }
    
    
}
