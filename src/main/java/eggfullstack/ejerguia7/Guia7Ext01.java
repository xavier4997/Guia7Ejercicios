/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eggfullstack.ejerguia7;

import java.util.Scanner;

/**
 *
 * @author xavier
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. 
 * Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular 
 * su equivalente: 1 día, 2 horas.
 */
public class Guia7Ext01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tiempo;
        
        System.out.println("Ingrese le tiempo en minutos");
        Scanner leer = new Scanner(System.in);
        tiempo = leer.nextInt();
       
        int horasTotales = tiempo/60;
        int dias = horasTotales/24;
        int horas = horasTotales - (dias *24);
        
        
        System.out.println(tiempo+" tiene "+horas+" horas y "+dias+" dias");
        
                
        
    }
    
}
