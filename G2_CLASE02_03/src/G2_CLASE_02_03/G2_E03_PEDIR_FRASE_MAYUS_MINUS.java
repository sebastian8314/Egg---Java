/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package G2_CLASE_02_03;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class G2_E03_PEDIR_FRASE_MAYUS_MINUS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String frase1, frase2;

        System.out.print("Ingrese una frase => ");

        frase1 = sc.nextLine();

        frase2 = frase1.toUpperCase();

        System.out.println("");
        System.out.println(frase2);

        frase2 = frase1.toLowerCase();

        System.out.println("");
        System.out.println(frase2);

    }

}
