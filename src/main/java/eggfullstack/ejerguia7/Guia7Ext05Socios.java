/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eggfullstack.ejerguia7;

import java.util.Scanner;

/**
 *
 * @author xavier
 * 
 * Una obra social tiene tres clases de socios:
    o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de 
    * descuento en todos los tipos de tratamientos.
    o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento 
    * para los mismos tratamientos que los socios del tipo A.
    o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre 
    * dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
public class Guia7Ext05Socios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String socio;
        float tratamiento;
        
        
        do{
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese tipo socio (A<B<C) o 'S' para salir");
            socio = leer.next();
            System.out.println("Ingrese valor tratamiento");
            tratamiento = leer.nextFloat();
            if (socio.equalsIgnoreCase("A")){
                System.out.println("El valor a cancelar es: "+tratamiento*0.5);
            } else {
                if (socio.equalsIgnoreCase("B")){
                    System.out.println("El valor a cancelar es: "+(tratamiento - (tratamiento*0.35)));
                } else {
                    if (socio.equalsIgnoreCase("c")){
                        System.out.println("El valor a cancelar es: "+tratamiento);
                        
                    }
                }
            }
                       
        } while(!"S".equalsIgnoreCase(socio));
        
    }
    
}
