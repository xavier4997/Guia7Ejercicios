/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eggfullstack.ejerguia7;

import java.util.Scanner;

/**
 *
 * @author xavier
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se 
 * muestre su equivalente en romano.
 */
public class Guia7Ext04NumRomanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num;
        System.out.println("Ingrese numero entre 1 -10");
        
        Scanner leer = new Scanner(System.in);
        num = leer.nextInt();
        
        

        
        switch (num){
            case 1:
                System.out.println("1 equivale a I");
                break;
            case 2:
                System.out.println("2 equivale a II");
                break;    
            case 3:
                System.out.println("3 equivale a III");
                break;   
            case 4:
                System.out.println("4 equivale a IV");
                break;    
            case 5:
                System.out.println("5 equivale a V");
                break;
            case 6:
                System.out.println("6 equivale a VI");
                break;    
            case 7:
                System.out.println("7 equivale a VII");
                break;    
            case 8:
                System.out.println("8 equivale a VIII");
                break;    
            case 9:
                System.out.println("9 equivale a IX");
                break;    
            case 10:
                System.out.println("10 equivale a X");
                break;    
                       
        }
                
    } 
    
    
}
