/*
Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: 
F = 32 + (9 * C / 5).

 */
package g1_e04.conv_cent_farn;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class G1_E04CONV_CENT_FARN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Scanner sc = new Scanner(System.in);
    
     
    System.out.print("Ingrese valor en C°   => ");
     
    int c = sc.nextInt();

    int F = 32 + (9 * c / 5); 
    
    System.out.print("Resultado valor en F° => "+ F);
    System.out.println("");   
    }
    
}
