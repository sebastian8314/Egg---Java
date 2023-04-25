
/**
 Escriba un programa que valide si una nota está entre 0 y 10, sino está
 entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */


package EJER_GUIA;

import java.util.Scanner;

public class G3_CLASE04_06_EJER_08 {

    public static void main(String[] args) {
        
        Scanner Scan = new Scanner(System.in);
        System.out.println("");
        System.out.println("------------------------------------------");
        System.out.print(" Ingrese una nota entre (0) y (10) => ");
        int nota = Scan.nextInt();
        while (nota < 0 || nota > 10){
            System.out.println("");
            System.out.print(" Nota no valida, vuelva a ingresar => ");
            nota = Scan.nextInt();
        }
        System.out.println("");
        System.out.println(" La nota es => " + nota);
        System.out.println("");
    }

}