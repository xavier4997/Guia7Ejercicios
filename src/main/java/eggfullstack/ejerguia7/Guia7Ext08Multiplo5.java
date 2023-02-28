/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eggfullstack.ejerguia7;

import java.util.Scanner;

/**
 *
 * @author xavier
 * Escriba un programa que lea números enteros. Si el número es múltiplo de cinco 
 * debe detener la lectura y mostrar la cantidad de números leídos, la cantidad 
 * de números pares y la cantidad de números impares. Al igual que en el ejercicio 
 * anterior los números negativos no deben sumarse. Nota: recordar el uso de la 
 * sentencia break.
 */
public class Guia7Ext08Multiplo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, pares, impares;
        pares = 0;
        impares = 0;
        Scanner leer = new Scanner(System.in);
        
        do{
            System.out.print("Ingrese un numero entero: ");
            num = leer.nextInt();
            if (num < 0){
                continue;
            }
            if (num%5 == 0){
                break;
            } else {
                if (num%2 == 0){
                    pares++;
                } else impares++;
            }
            
        } while ( num%5 != 0);
        System.out.println("Ingreso "+pares+" numeros pares");
        System.out.println("Ingreso "+impares+" numeros impares");
    }
    
}
