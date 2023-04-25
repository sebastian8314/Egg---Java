/**
 * Realizar un programa que pida dos números enteros positivos por
 * teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
 * una opción y el programa deberá mostrar el resultado por pantalla y
 * luego volver al menú. El programa deberá ejecutarse hasta que se elija la
 * opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
 * vez de salir del programa directamente, se debe mostrar el siguiente
 * mensaje de confirmación: ¿Está seguro que desea salir del programa
 * (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
 * contrario se vuelve a mostrar el menú.
 *
 */
package G3_CLASE_04_06;

import java.util.Scanner;

public class G3_E06 {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        int num1, num2, opcion;
        String respuesta = "";

        do {
            System.out.println(" A continuacion ingrese dos números enteros positivos ");
            num1 = Scan.nextInt();
            num2 = Scan.nextInt();

        } while (num1 <= 0 || num2 <= 0);

        do {

            System.out.println("-----------------------");
            System.out.println("|  MENU               |");
            System.out.println("|  1. Sumar           |");
            System.out.println("|  2. Restar          |");
            System.out.println("|  3. Multiplicar     |");
            System.out.println("|  4. Dividir         |");
            System.out.println("|  5. Salir           |");
            System.out.println("|  ELIJA UNA OPCION   |");
            System.out.println("----------------------");

            opcion = Scan.nextInt();

            switch (opcion) {
                case 1:
                    int suma = num1 + num2;
                    System.out.println(" La suma de" + num1 + " mas" + num2 + " es igual a " + suma);
                    break;

                case 2:
                    int resta = num1 - num2;
                    System.out.println(" La resta de " + num1 + " menos" + num2 + " es resta" + resta);
                    break;

                case 3:
                    int multi = num1 * num2;
                    System.out.println(" La multiplicacion de" + num1 + " por " + num2 + " es igual " + multi);
                    break;

                case 4:
                    double div = num1 / num2;
                    System.out.println(" La división de " + num1 + " por " + num2 + " es igual " + div);
                    break;

                case 5:
                    do {

                        System.out.println("¿Esta seguro que quiere salir del programa (S/N)?");
                        respuesta = Scan.next();

                    } while (!respuesta.equals("S") && !respuesta.equals("N"));
                    if (respuesta.equals("S")) {

                        break;
                    }
                    break;

                default:
                    System.out.println("OPCION INCORRECTA");
                    break;

            }

        } while (opcion != 5 || respuesta.equals("N"));
    }
}
