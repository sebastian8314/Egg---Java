/*
Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().

 */
package g1_e05.num_entero_doble;

import static java.lang.Math.abs;
import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class G1_E05NUM_ENTERO_DOBLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        
        int num_doble, num_triple = 0;
        double num_raiz = 0;
        
        double num_cuadrada = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero => ");
               
        int num = scan.nextInt();
        
        num_doble = num * 2;
        num_triple = num * 3;
        num_raiz = Math.sqrt(num);
        
        System.out.println("");
        System.out.print("El doble de "+num+" es => "+num_doble);
        System.out.println("");
        System.out.print("El triple de "+num+" es => "+num_triple);
        System.out.println("");
        System.out.print("La raiz cuadrada de "+num+" es => "+num_raiz);
        System.out.println("");
        
    }

    private static double sqrt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
