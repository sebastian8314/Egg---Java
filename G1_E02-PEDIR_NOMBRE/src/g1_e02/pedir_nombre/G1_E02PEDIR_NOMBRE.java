/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */
package g1_e02.pedir_nombre;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class G1_E02PEDIR_NOMBRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leerm = new Scanner(System.in); 
        
       String nom, ape;
                        
        System.out.print("Ingrese su nombre => ");
       
        nom = leerm.nextLine();
        
        System.out.print("Ingrese su Apellido => ");
       
        ape = leerm.nextLine();
        
        System.out.println("El nombre ingresado es => " + nom + " " + ape);
        
       
    }
    
}
