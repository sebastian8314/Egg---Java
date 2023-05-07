/*
Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.
 */
package Ejercicios_extras;

import java.util.Scanner;

public class G3_E5_obraSocial {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String socio;
        int costo = 1500;
        
        System.out.print(" Ingrese el tipo de Socio (A,B,C) => ");
        socio = scan.next();
        
        switch (socio.toUpperCase()) {
            case "A":
                System.out.println(" Su tratamiento tiene un costo de : " + costo + "\ny tiene un descuento de 50% por lo que se debe pagar: " + (costo - (costo * 0.50)));
                break;

            case "B":
                System.out.println(" Su tratamiento tiene un costo de : " + costo + "\ny tiene un descuento de 35% por lo que se debe pagar: " + (costo - (costo * 0.35)));
                break;
            case "C":
                System.out.println(" Su tratamiento tiene un costo de : " + costo + " Ya que no posee descuentos" );
                break;
            default:
                System.out.println(" Clase inexistente");
        
        
        }
        
        
        
       
    }
    
}
