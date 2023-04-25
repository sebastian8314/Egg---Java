package EJER_GUIA;
import java.util.Scanner;

/**
Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.
 */

/**
 * 
 * @author sebas
 */

public class G3_CLASE04_06_EJER_06 {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("");
        System.out.println("****Ingrese números enteros mayores a 25 **** ");
        System.out.println("");
        System.out.print("Ingrese un número entero   => ");
        int num1 = Scan.nextInt();
        
        System.out.println("");
        System.out.print("Ingrese otro número entero => ");
        int num2 = Scan.nextInt();
        
        if (num1 > 25 && num2 > 25){
            System.out.println("");
            System.out.println("Ambos números son mayores que 25");
        } else if (num1 >25){
                System.out.println("");
                System.out.println("El primer número es mayor =>  " + num1);
                } else {
                System.out.println("");
                System.out.println("El segundo número es mayor => " + num2);
        }
    }

}