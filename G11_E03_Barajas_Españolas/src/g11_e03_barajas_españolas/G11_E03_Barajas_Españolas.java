/**
 * Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
 * y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
 * contener un método toString() que retorne el número de carta y el palo. La baraja estará
 * compuesta por un conjunto de cartas, 40 exactamente.
 * Las operaciones que podrá realizar la baraja son:
 * • barajar(): cambia de posición todas las cartas aleatoriamente.
 * • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
 * se haya llegado al final, se indica al usuario que no hay más cartas.
 * • cartasDisponibles(): indica el número de cartas que aún se puede repartir.
 * • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
 * cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
 * debemos indicárselo al usuario.
 * • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
 * indicárselo al usuario
 * • mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
 * luego se llama al método, este no mostrara esa primera carta.
 */
package g11_e03_barajas_españolas;

import Servicios.CartaServicio;
import java.util.Scanner;

public class G11_E03_Barajas_Españolas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Bienvenidos al juego de Cartas !!" + "\n" + " Vamos a Jugar" + "\n");
        CartaServicio cs = new CartaServicio();

        int menu = 0;
        do {
            System.out.println(" Menu de Cartas ");
            System.out.println(" -------------- ");
            System.out.println("");
            System.out.println("1. Crear Baraja");
            System.out.println("2. Mezclar Baraja");
            System.out.println("3. Dar Cartas");
            System.out.println("4. Mostrar Cartas Barajas");
            System.out.println("5. Cartas Disponibles");
            System.out.println("6. Mostrar Baraja");
            System.out.println("7. Salir");

            menu = scan.nextInt();

            switch (menu) {
                case 1:
                    System.out.println(" ----------");
                    cs.crearMazo();
                    break;

                case 2:
                    System.out.println(" ----------");
                    cs.barajar();
                    break;

                case 3:
                    System.out.println(" ----------");
                    cs.darCartas(menu);
                    break;

                case 4:
                    System.out.println(" ----------");
                    cs.mostrarBaraja();
                    break;

                case 5:
                    System.out.println(" ----------");
                    cs.cartasDisponibles();
                    break;

                case 6:
                    System.out.println(" ----------");
                    cs.mostrarBaraja();
                    break;

                case 7:
                    System.out.println(" ----------");
                    System.out.println(" => Saliendo del Juego");
                    break;

                default:
                    System.out.println(" ----------");
                    System.out.println(" => Opcion no valida ");
            }

        } while (menu != 7);

    }

}
