/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eggfullstack.ejerguia7;

import java.util.Scanner;

/**
 *
 * @author xavier
 * Realizar un programa que pida dos números enteros positivos por teclado y 
 * muestre por pantalla el siguiente menú:
    MENU
    1. Sumar
    2. Restar
    3. Multiplicar
    4. Dividir
    5. Salir
    Elija opción:
    El usuario deberá elegir una opción y el programa deberá mostrar el resultado 
    por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que 
    se elija la opción 5.
    Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
    programa directamente, se debe mostrar el siguiente mensaje de confirmación:
    ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el 
    carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
public class Guia7Ejer11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, opcion;
        String respuesta = "N";
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros positivos");
        System.out.print("Ingrese n1 = ");
        num1 = leer.nextInt();
        System.out.print("Ingrese n2 = ");
        num2 = leer.nextInt();
        do{
            System.out.println(" MENU ");
            System.out.println("1. SUMAR ");
            System.out.println("2. RESTAR ");
            System.out.println("3. MULTIPLICAR ");
            System.out.println("4. DIVIDIR ");
            System.out.println("5. SALIR ");
            System.out.println("ELIJA OPCION: ");
            opcion = leer.nextInt();
            
            if (opcion == 1){
                System.out.println("La suma de "+num1+" y "+num2+" es = "+ (num1+num2));
            }
            if (opcion == 2){
                System.out.println("La resta de "+num1+" y "+num2+" es = "+ (num1-num2));
            }
            if (opcion == 3){
                System.out.println("La multiplicacios de "+num1+" y "+num2+" es = "+ (num1*num2));
            }
            if (opcion == 4){
                System.out.println("La division de "+num1+" y "+num2+" es = "+ (num1/num2));
            }
            if (opcion == 5){
                System.out.println("Esta seguro que desea salir (S/N");
                respuesta = leer.next();
            }
        } while (respuesta.equalsIgnoreCase("N"));
    }
    
}
