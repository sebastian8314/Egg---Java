/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo
por parámetro. Después haremos otra función o procedimiento que imprima el vector
 */
package G5_CLASE_09_11_E03;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class G5_CLASE_09_11_E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tamaño = Scan.nextInt();
        int[] vector = new int[tamaño];
        int[] vector2 = new int[tamaño];

        System.out.println(" Ingrese los valores del vector 1");

        for (int i = 0; i < tamaño; i++) {

            vector[i] = Scan.nextInt();

        }

        System.out.println(" Ingrese los valores del vector 2");

        for (int i = 0; i < tamaño; i++) {

            vector2[i] = Scan.nextInt();
        }
        boolean soniguales = true;

        for (int i = 0; i < tamaño; i++) {

            if (vector[i] != vector2[i]) {

                soniguales = false;
                break;
            }

        }
        if (soniguales) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");

        }

    }
}

    
