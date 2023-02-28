/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eggfullstack.ejerguia7;

import java.util.Scanner;

/**
 *
 * @author xavier
 * Realice un programa que calcule y visualice el valor máximo, el valor mínimo
 * y el promedio de n números (n>0). El valor de n se solicitará al principio 
 * del programa y los números serán introducidos por el usuario. 
 * Realice dos versiones del programa, una usando el bucle “while” y otra con el 
 * bucle “do - while”.
 */
public class Guia7Ext07MaxMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // BUCLE WHILE
        
        int n, num, max, min, cont, sum;
        max = 0;
        min = 1000;
        cont = 0;
        sum = 0;
        System.out.println("Ingrese la cantidad de numeros");
        Scanner leer = new Scanner(System.in);
        n = leer.nextInt();
        //String opcion = "N";
        
        while (cont < n){
            System.out.println("Ingrese un numero");
          
            num = leer.nextInt();
            //opcion = leer.next();
            cont++;
            if (max < num){
                max = num;  
            }
            if (min > num){
                min = num;
            }
            
            sum = sum + num;
        }
        System.out.println("El valor maximo es; "+max);
        System.out.println("El valor minimo es; "+min);
        System.out.println("El valor promedio es; "+sum/cont);
        
        
        
        // BUCLE DO-WHILE
        
        cont = 0;
        max: min: sum = 0;

        do{
            System.out.println("Ingrese un numero");
          
            num = leer.nextInt();
            cont++;
            if (max < num){
                max = num;  
            }
            if (min > num){
                min = num;
            }
            
            sum = sum + num;       
            
        } while (cont != n);
        
        System.out.println("El valor maximo es; "+max);
        System.out.println("El valor minimo es; "+min);
        System.out.println("El valor promedio es; "+sum/cont);
    }
    
}
