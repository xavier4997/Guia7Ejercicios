/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eggfullstack.ejerguia7;

/**
 *
 * @author xavier
 * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números 
 * del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 
 * lo sustituya por una E.
    Ejemplo:
    0-0-0
    0-0-1
    0-0-2
    0-0-E
    0-0-4
    0-1-2
    0-1-E
    Nota: investigar función equals() y como convertir números a String.
 */
public class Guia7Ext12Cont {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        int x;
        
        for (int i = 0; i < 1000; i++) {
            x = i;
            System.out.printf("%+05d %n", x);
        }
        
        
    }
    
}
