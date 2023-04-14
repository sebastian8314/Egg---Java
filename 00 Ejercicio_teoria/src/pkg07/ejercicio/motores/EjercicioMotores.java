/*
Considera que estás desarrollando una web para una empresa que fabrica
motores (suponemos que se trata del tipo de motor de una bomba para mover
fluidos). Definir una variable tipoMotor y permitir que el usuario ingrese un valor
entre 1 y 4. El programa debe mostrar lo siguiente:
o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es
una bomba de agua”.
o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es
una bomba de gasolina”.
o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es
una bomba de hormigón”.
o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es
una bomba de pasta alimenticia”.
o Si no se cumple ninguno de los valores anteriores mostrar el mensaje
“No existe un valor válido para tipo de bomba”

 */
package pkg07.ejercicio.motores;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class EjercicioMotores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int tipoMotor;
    
    System.out.println("Bienvenidos Programa motor de Bombas de fluidos");
    System.out.println("Ingrese (1) bomba de agua");
    System.out.println("Ingrese (2) bomba de gasolina");
    System.out.println("Ingrese (3) bomba de hormigón");
    System.out.println("Ingrese (4) bomba de pasta alimenticia");
    System.out.println("Ingrese una opción => ");
    
    tipoMotor = leer.nextInt();
    switch (tipoMotor) {
    case 1:
    System.out.println("opcion = 1 Ud selecciono bomba de Agua");
    break;
    case 2:
    System.out.println("opcion = 2 Ud selecciono bomba de gasolina");
    break;
    case 3:
    System.out.println("opcion = 3 Ud selecciono bomba de hormigon");
    break;
    case 4:
    System.out.println("opcion = 4 Ud selecciono bomba de pasta alimenticia");
    break;
    default:
    System.out.println("No existe un valor válido para tipo de bomba");
}


}
}