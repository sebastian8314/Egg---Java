
/**
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor.
 */


package EJER_GUIA;

import java.util.Scanner;

public class G3_CLASE04_06_EJER_10 {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        
        System.out.println("Ingrese 4 numeros ");
        System.out.println("");
        int n = Scan.nextInt();
        int n2 = Scan.nextInt();
        int n3 = Scan.nextInt();
        int n4 = Scan.nextInt();
        System.out.println("");
        
        if (n >= 1 && n <= 20) {
            System.out.print(n);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
        } else {
            System.out.println("");
            System.out.print("El numero ingresado en invalido");
        }

        System.out.println(" ");

        if (n2 >= 1 && n2 <= 20) {
            System.out.print(n2);
            for (int i = 0; i < n2; i++) {
                System.out.print("*");
            }
        } else {
            
            System.out.print("El numero ingresado en invalido");
        }

        System.out.println(" ");

        if (n3 >= 1 && n3 <= 20) {
            System.out.print(n3);
            for (int i = 0; i < n3; i++) {
                System.out.print("*");
            }
        } else {
           
            System.out.print("El numero ingresado en invalido");

        }
        System.out.println(" ");
        
        if (n4 >= 1 && n4 <= 20) {
            System.out.print(n4);
            for (int i = 0; i < n4; i++) {
                System.out.print("*");
            }
        } else {
            
            System.out.print("El numero ingresado en invalido");

        }

        System.out.println("");

        // TODO code application logic here
}
   
}