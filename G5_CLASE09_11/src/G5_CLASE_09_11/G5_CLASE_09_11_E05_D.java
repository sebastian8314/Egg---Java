package G5_CLASE_09_11;
import java.util.Scanner;

public class G5_CLASE_09_11_E05_D {

   public static void main(String[] args) {
       /*Realice un programa que compruebe si una matriz dada es antisimétrica.*/
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la dimension de la matriz: ");
        int max = leer.nextInt();

        int[][] matriz = new int[max][max];

        System.out.println("Ingrese los valores de la matriz: ");
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        //Mostrar matriz
        System.out.println("Matriz 1");
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println("");
        }
        //Mostrar traspuesta
        System.out.println("Matriz 2");
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                System.out.print(" " + matriz[j][i]);
            }
            System.out.println("");
        }

        boolean esAntisimetrica = true;

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    esAntisimetrica = false;
                    break;
                }
            }
        }

        if (esAntisimetrica) {
            System.out.println("La matriz ES antisimetrica");
        } else {
            System.out.println("La matriz NO es antisimetrica");
        }
    }
}