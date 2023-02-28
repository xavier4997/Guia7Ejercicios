/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eggfullstack.ejerguia7;

import java.util.Scanner;

/**
 *
 * @author xavier
 * Realice un programa para que el usuario adivine el resultado de una multiplicación 
 * entre dos números generados aleatoriamente entre 0 y 10. El programa debe indicar 
 * al usuario si su respuesta es o no correcta. En caso que la respuesta sea incorrecta 
 * se debe permitir al usuario ingresar su respuesta nuevamente. Para realizar este 
 * ejercicio investigue como utilizar la función Math.random() de Java
 */
public class Guia7Ext10AdivinarRes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1 = (int) (Math.random()*10);
        System.out.println("Numero1 = " +num1);
        int num2 = (int) (Math.random()*10);
        System.out.println("Numero1 = " +num2);
        int mul = (num1 * num2);
        int valor;
        System.out.println("Multiplicacion = " +mul);
        Scanner leer = new Scanner(System.in);
        
        do{
            System.out.println("Adivine el valor de la multiplicacion maximo valor 100");
            valor = leer.nextInt();
            if (valor == mul){
                System.out.println("FELICIDADES ADIVINO");  
            } else System.out.println("ERROR siga intentando");
        } while (valor != mul);
        
        
        
    }
    
}
