/*
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
package G5_CLASE_09_11;

import static java.lang.Math.random;



/**
 *
 * @author sebas
 */
public class G5_CLASE_09_11_E05 {

    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        //int trasnp[][] = new int[4][4]; se puede usar de otra forma

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                //matriz[i][j] = (int) random.nextInt(-4,4); revisar linea
                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println("");
        }

        System.out.println("La matriz transpuesta es ");

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {

                System.out.print("[" + ((matriz[i][j]) * -1) + "]");
            }
            System.out.println("");

        }
    }
}


 