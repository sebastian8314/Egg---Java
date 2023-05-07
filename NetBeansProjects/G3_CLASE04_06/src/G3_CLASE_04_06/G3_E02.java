/**
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el
 * programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
 * Incorrecto. Nota: investigar la función equals() en Java.
 *
 */
package G3_CLASE_04_06;

import java.util.Scanner;

public class G3_E02 {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        String frase = "eureka";
        System.out.print(" Ingrese una frase => ");
        String frase2 = Scan.nextLine();

        if (frase2.equals(frase)) {
            System.out.println("");
            System.out.println(" La frase es correcta");
        } else {
            System.out.println("");
        }
        System.out.println(" La frase es incorrecta");

    }

}
