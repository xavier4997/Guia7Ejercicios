/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eggfullstack.ejerguia7;

import java.util.Scanner;

/**
 *
 * @author xavier
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
 * cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class Guia7Ejer17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N;
        
        
        do{
            System.out.println("Ingrese dimension de vector \n(digite '0' para salir): ");

            Scanner leer = new Scanner(System.in);
            N = leer.nextInt();
            int[] arreglo = new int[N];

            crearVector(arreglo,N);
            mostrarVector(arreglo,N);
            conteoDigitos(arreglo,N);
            
        } while (N != 0);
        
        //crearVector(arreglo,N);
        //mostrarVector(arreglo,N);
        
    }
    
    
    //FUNCION RELLENAR VECTOR
    public static void crearVector(int[] vector, int dimension){
        for (int i = 0; i < dimension; i++) {
            int x =  (int) (Math.random() * 100000);     
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
    
    // FUNCION CONTEO DIGITOS
    public static void conteoDigitos(int[] vector, int dimension){  
        int s1 = 0, s2 = 0, s3 = 0, s4 = 0, s5 = 0;       
        for (int i = 0; i < dimension; i++) {
            int digitos = Integer.toString(vector[i]).length();
            if (digitos == 1){
                s1 = s1 + 1;
            }
            if (digitos == 2){
                s2 = s2 + 1;
            }
            if (digitos == 3){
                s3 = s3 + 1;
            }
            if (digitos == 4){
                s4 = s4 + 1;
            }
            if (digitos == 5){
                s5 = s5 + 1;
            }
        }
        System.out.println("Existen "+s1+" de un digito");
        System.out.println("Existen "+s2+" de dos digito");
        System.out.println("Existen "+s3+" de tres digito");
        System.out.println("Existen "+s4+" de cuatro digito");
        System.out.println("Existen "+s5+" de cinco digito");
    }
}
