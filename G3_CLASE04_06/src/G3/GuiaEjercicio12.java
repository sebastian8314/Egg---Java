/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados
por el usuario, validando que el primer número múltiplo del segundo e 
imprima si el primer número es múltiplo del segundo, sino informe que 
no lo son.
 */
package javaintro03_clase_7_8;

import java.util.Scanner;

public class GuiaEjercicio12 {

    public static void main(String[] args) {

        int num1, num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        num1 = scan.nextInt();
        num2 = scan.nextInt();

        //System.out.println("");
        esMultiplo(num1, num2);

    }

    public static void esMultiplo(int n1, int n2) {

        if (n1 % n2 == 0) {

            System.out.println(n1 + "(Numero 1) es multiplo de " + n2);
        } else {

            System.out.println(n1 + "(Numero 1) NO es multiplo de " + n2);
        }
    }

}
