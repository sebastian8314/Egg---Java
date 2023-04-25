package EJER_GUIA;

import java.util.Scanner;

/**
 * Considera que estás desarrollando una web para una empresa que fabrica
 * motores (suponemos que se trata del tipo de motor de una bomba para mover
 * fluidos). Definir una variable tipoMotor y permitir que el usuario ingrese un
 * valor entre 1 y 4. El programa debe mostrar lo siguiente: o Si el tipo de
 * motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”. o
 * Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba
 * de gasolina”. o Si el tipo de motor es 3, mostrar un mensaje indicando “La
 * bomba es una bomba de hormigón”. o Si el tipo de motor es 4, mostrar un
 * mensaje indicando “La bomba es una bomba de pasta alimenticia”. o Si no se
 * cumple ninguno de los valores anteriores mostrar el mensaje “No existe un
 * valor válido para tipo de bomba"
 */
public class G3_CLASE04_06_EJER_07 {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("-----------------------------------------------");
        System.out.println("Bienvenidos Programa motor de Bombas de fluidos");
        System.out.println("-----------------------------------------------");
        System.out.println("");
        System.out.println("Ingrese (1) bomba de agua");
        System.out.println("Ingrese (2) bomba de gasolina");
        System.out.println("Ingrese (3) bomba de hormigón");
        System.out.println("Ingrese (4) bomba de pasta alimenticia");
        System.out.println("");
        System.out.print("Ingrese una opción => ");
        
        int tipoMotor = Scan.nextInt();
        System.out.println("");
        
        switch (tipoMotor) {
            case 1:
                System.out.println(" => La bomba es una bomba de agua");
                break;

            case 2:
                System.out.println(" => La bomba es una de gasolina");
                break;

            case 3:
                System.out.println(" => La bomba es una bomba de hormigón");
                break;

            case 4:
                System.out.println(" => La bomba es de pasta alimenticia");
                break;

            default:
                System.out.println(" => No existe un valor válido para el tipo de bomba");
                break;

        }
    }

}
