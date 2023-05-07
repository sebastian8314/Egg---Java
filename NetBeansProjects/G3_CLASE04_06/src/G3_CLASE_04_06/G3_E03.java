/**
 * Realizar un programa que solo permita introducir solo frases o palabras
 * de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
 * deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
 * caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
 * función Lenght() en Java.
 */
package G3_CLASE_04_06;

import java.util.Scanner;

public class G3_E03 {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.println(" Ingrese una frase de (08) caracteres ");
        String frase = Scan.nextLine();

        if (frase.length() == 8) {
            System.out.println("Es correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }

}
