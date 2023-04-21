/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma
 */
package g1_e01.suma_de_numeros_enteros;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class G1_E01SUMA_DE_NUMEROS_ENTEROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        int suma;

        // se crea variable Scanner que se utiliza para leer los datos del ususario
        Scanner scanner = new Scanner(System.in);

        //muestra un mensaje por pantalla
        System.out.print("Ingresa el primer número entero  => ");

        //leemos el nombre de la persona en la variable num1
        num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número entero => ");

        //leemos el nombre de la persona en la variable num2
        num2 = scanner.nextInt();

        suma = num1 + num2;

        System.out.println("El resultado de sumar " + num1 + "+" + num2 + " el valor es: " + suma);

    }

} 