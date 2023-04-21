/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package G5_CLASE_09_11;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class G5_CLASE_09_11_E06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int  sumaC = 0;
        int sumaD = 0;
        int sumaF = 0;
        System.out.println("Ingrese 9 numeros del 1 al 9:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese posicion : " + i + "," + j);
                int n = leer.nextInt();

                if (n > 0 && n < 10) {
                    matriz[i][j] = n;
                } else {
                    System.out.println("Número no valido, ingrese nuevamente.");
                }
                while (n < 1 || n > 9) {
                    n = leer.nextInt();
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" [" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            sumaF=0;
            for (int j = 0; j < 3; j++) {
                sumaF = sumaF + matriz[i][j];
            }
            System.out.println("La suma de la fila " + i + " es: " + sumaF);
        }
        for (int j = 0; j < 3; j++) {
            sumaC = 0;
            for (int i = 0; i < 3; i++) {
                sumaC = sumaC + matriz[i][j];
            }
            System.out.println("La suma de columna " + j + " es: " + sumaC);
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sumaD = sumaD + matriz[i][j];
                }
            }

        }
        System.out.println("La suma de la diagonal es: " + sumaD);
        if (sumaF == sumaC && sumaC == sumaD) {
            System.out.println("");
            System.out.println("La matriz SI es magica :)");
        } else 
            System.out.println("");
            System.out.println("La matriz NO es magica :(");
    }
}
