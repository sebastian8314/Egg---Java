/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package g1_e03.pedir_frase_mayus_minus;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class G1_E03PEDIR_FRASE_MAYUS_MINUS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        String frase1, frase2;
        
        System.out.print("Ingrese una frase => ");
        
        frase1 = sc.nextLine();
        
        frase2 = frase1.toUpperCase();
        
        System.out.println(frase2);
        
        frase2 = frase1.toLowerCase();
        
        System.out.println(frase2);                 
        
    }
    
}
