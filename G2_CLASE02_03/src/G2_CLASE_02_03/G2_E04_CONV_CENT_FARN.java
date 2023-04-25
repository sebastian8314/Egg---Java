/*
Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: 
F = 32 + (9 * C / 5).

 */
package G2_CLASE_02_03;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class G2_E04_CONV_CENT_FARN {

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
