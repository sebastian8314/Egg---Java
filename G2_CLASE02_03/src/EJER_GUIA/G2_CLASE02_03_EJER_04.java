package EJER_GUIA;
import java.util.Scanner;

public class G2_CLASE02_03_EJER_04 {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("");
        System.out.print("Ingrese su nombre => ");
        String nombre = Scan.nextLine();
        System.out.println("");
        System.out.print("Ingrese su edad   => ");
        int edad = Scan.nextInt();
        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("El nombre ingresado es => " + nombre);
        System.out.println("La edad ingresada es   => " + edad);
        System.out.println("");
    }

}