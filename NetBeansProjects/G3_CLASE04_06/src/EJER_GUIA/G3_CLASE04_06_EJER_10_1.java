
/**
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor.
 */


package EJER_GUIA;

import java.util.Scanner;

public class G3_CLASE04_06_EJER_10_1 {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println(" Ingrese 4 numeros entre 1 y 20");
        
        String asterisco = "*";
        
        for (int i= 0; i < 4; i++){
            int num = Scan.nextInt();
            if ((num > 0) && (num < 20)){
                System.out.print(num);
                
            for (int j = 0; j < num; j++){
                System.out.print(asterisco);
            }
            System.out.println("");
            }
        }
    }
}