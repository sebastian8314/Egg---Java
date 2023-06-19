/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o 
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de 
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero 
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna 
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y 
luego se llama al método, este no mostrara esa primera carta.
 */
package Servicios;

import Entidad.Carta;
import Entidad.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class CartaServicio {

    ArrayList<Palo> Palos = new ArrayList();
    ArrayList<Carta> Cartas = new ArrayList();

    ArrayList<Carta> repartirCartas = new ArrayList();
    Scanner scan = new Scanner(System.in);

    public void crearPalos() {
        Palos.add(new Palo("Espada"));
        Palos.add(new Palo("Oro"));
        Palos.add(new Palo("Basto"));
        Palos.add(new Palo("Copa"));
    }

    public void crearMazo() {
        crearPalos();
        if (Cartas.size() > 0) {
            System.out.println("");
            System.out.println(" => Ya existe un Mazo creado");
        } else {
            System.out.println(" => Creando baraja" + "\t");
            String[] numero = {"1", "2", "3", "4", "5", "6", "7", "10", "11", "12"};
            for (int i = 0; i < Palos.size(); i++) {
                for (int j = 0; j < numero.length; j++) {
                    Cartas.add(new Carta(numero[j], Palos.get(i)));
                }

            }
            System.out.println(" => Se creo la baraja exitosamente");
            System.out.println("");
        }

    }

    public void barajar() {
        System.out.println(" => Mezcalnado....");
        Collections.shuffle(Cartas);
        System.out.println(" => Cartas Barajadas");

    }

    public Carta siguienteCarta() {
        Carta c = new Carta();

        if (Cartas.isEmpty()) {
            System.out.println(" => No hay cartas");
        } else {
            c = Cartas.get(0);

        }
        return c;
    }

    public void cartasDisponibles() {

        System.out.println(" => Cartas restantes " + Cartas.size());
    }

    public void darCartas(int numcartas) {
        System.out.print(" ¿Cuantas cartas quiere? => ");
        int opc = scan.nextInt();
        System.out.println("");

        if (opc > Cartas.size()) {
            System.out.println("");
            System.out.println(" No hay, suficientes cartas..!!!");

        } else {
            int cont = 0;

            while (cont < opc) {
                System.out.println(" Te toco " + siguienteCarta());
                repartirCartas.add(Cartas.get(0));
                Cartas.remove(0);
                cont++;
            }
            System.out.println("");
        }
    }

    public void cartasMonton() {
        System.out.println(" Cartas que salieron : " + repartirCartas.size());
        for (Carta Carta : repartirCartas) {
            System.out.println(Carta);
        }
        System.out.println("");
    }

    public void mostrarBaraja() {
        System.out.println(" Cartas de la baraja: ");
        for (Carta Carta : Cartas) {
            System.out.println(Carta);
        }
        System.out.println("");
    }
}





