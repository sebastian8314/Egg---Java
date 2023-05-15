package g9_e002;

import Entidad.ParDeNumeros;
import Servicio.ParDeNumerosService;
import java.util.Scanner;

public class G9_E002 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("");
        System.out.println("===========================================");
        System.out.print(" Ingrese primer número   => ");
        double num1 = scan.nextDouble();

        System.out.print(" Ingrese segunddo número => ");
        double num2 = scan.nextDouble();

        ParDeNumeros par = new ParDeNumeros(num1, num2);
        ParDeNumerosService sv = new ParDeNumerosService(par);

        System.out.println("===========================================");
        System.out.println("");
        sv.mostrarValores();
        System.out.println("");
        System.out.println(" El número mayor es: " + sv.devolverMayor());
        System.out.println("");
        System.out.println(" La potencia del número mayor elevado al número menor es: " + sv.calcularPotencia());
        System.out.println("");
        System.out.println(" La raiz cuadrada del número menor es: " + sv.calcularRaiz(par));
        System.out.println("");
        System.out.println(sv.toString());
        scan.close();
    }

}
