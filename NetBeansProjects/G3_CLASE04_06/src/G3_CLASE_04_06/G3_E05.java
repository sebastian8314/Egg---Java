/**
 * Escriba un programa en el cual se ingrese un valor limite positivo, y a
 * continuacion solicite numeros al usuario hasta que la suma de los
 * numeros introducidos supere el limite inicial.
 */
package G3_CLASE_04_06;

import java.util.Scanner;

public class G3_E05 {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int limite;
        do {
            System.out.println(" Ingrese un limite psitivo");
            limite = Scan.nextInt();

        } while (limite <= 0);

        System.out.println(" A continuacion ingrese números enteros ");

        int suma = 0;

        while (suma < limite) {

            int num = Scan.nextInt();
            suma = suma + num;

            System.out.print(" La suma es: " + suma);
            System.out.println(" Ingrese otro numero");
        }
    }

}
