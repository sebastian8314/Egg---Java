/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).
 */
package G5_CLASE_09_11;

/**
 *
 * @author sebas
 */
public class G5_CLASE_09_11_E04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        //int trasnp[][] = new int[4][4]; se puede usar de otra forma

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                matriz[i][j] = (int) (Math.random() * 9);
                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println("");
        }

        System.out.println("La matriz transpuesta es ");

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {

                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");

        }
    }
}
