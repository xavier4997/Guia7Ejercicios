/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eggfullstack.ejerguia7;

import java.util.Scanner;

/**
 *
 * @author xavier
 * Simular la división usando solamente restas. Dados dos números enteros mayores 
 * que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo 
 * restas. 
 * Método:
    Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, 
    este resultado es el residuo, y el número de restas realizadas es el cociente.
    Por ejemplo: 50 / 13:
    50 – 13 = 37 una resta realizada
    37 – 13 = 24 dos restas realizadas
    24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
 */
public class Guia7Ext09Div {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int divid, divis, aux, cont;
        cont = 0;
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el dividendo: ");
        divid = leer.nextInt();
        System.out.print("Ingrese el divisor: ");
        divis = leer.nextInt();
        
        do{
            aux = divid - divis;
            divid = aux;
            cont++;
        } while(aux > divis );
        
        System.out.println("El cosiente es: " +cont);
        System.out.println("El residuo es: " +aux);
        
    }
    
}
