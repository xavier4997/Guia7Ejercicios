/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eggfullstack.ejerguia7;

import java.util.Scanner;

/**
 *
 * @author xavier
 * Crea una aplicación que a través de una función nos convierta una cantidad de 
 * euros introducida por teclado a otra moneda, estas pueden ser a dólares, 
 * yenes o libras. La función tendrá como parámetros, la cantidad de euros y la 
 * moneda a converir que será una cadena, este no devolverá ningún valor y 
 * mostrará un mensaje indicando el cambio (void).
 * El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */
public class Guia7Ejer14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        float euros;
        String moneda;
        
        System.out.println("Ingrese la cantidad de euros a convertir");
        euros = leer.nextFloat();
        System.out.println("Ingrese la moneda a convertir");
        moneda = leer.next();
        
        convierEuros(euros, moneda);
    }
    
    public static void convierEuros(float euros, String moneda){
        if (moneda.equals("libra")) {
            System.out.println(euros+"euros son " + (euros/0.86) + " libras");
        }
        if (moneda.equals("dolares")) {
            System.out.println(euros+"euros son " + (euros/1.28611) + " dolares");
        }
        if (moneda.equals("yenes")) {
            System.out.println(euros+"euros son " + (euros/129.852) + " yenes");
        }
    }
    
}
