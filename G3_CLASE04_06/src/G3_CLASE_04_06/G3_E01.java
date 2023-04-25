/**
 * Crear un programa que dado un número determine si es par o impar.
 */
package G3_CLASE_04_06;

import java.util.Scanner;

public class G3_E01 {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print(" Ingrese un número = > ");
        int num = Scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("");
            System.out.println(" El número " + num + " es par");
        } else {
            System.out.println("");
            System.out.println(" El numero " + num + " es impar");
        }
        System.out.println("");
    }
}
