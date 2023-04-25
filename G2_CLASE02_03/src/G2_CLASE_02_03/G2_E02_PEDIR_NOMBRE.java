/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */
package G2_CLASE_02_03;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class G2_E02_PEDIR_NOMBRE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       Scanner leerm = new Scanner(System.in); 
        
       String nom, ape;
                        
        System.out.print("Ingrese su nombre => ");
       
        nom = leerm.nextLine();
        
        System.out.print("Ingrese su Apellido => ");
       
        ape = leerm.nextLine();
        
        System.out.println("El nombre ingresado es => " + nom + " " + ape);
        
       
    }
    
}
