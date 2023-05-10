package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    public Cafetera cafe = new Cafetera();
    Scanner scan = new Scanner(System.in);

    public void llenarCafetera(Cafetera cafe, int cantidadLlenado) {

        int capacidadMaxima = cafe.getCapacidadMaxima();
        int cantidadActual = cafe.getCantidadActual();

        if (cantidadLlenado > capacidadMaxima) {
            System.out.println("No se puede llenar la cafetera con esa "
                    + "cantidad, sobrepasa la capacidad máxima.");
            return;
        }
        if (cantidadActual + cantidadLlenado > capacidadMaxima) {
            System.out.println("No se puede llenar la cafetera con esa cantidad, "
                    + "sobrepasa la capacidad máxima.");
            return;
        }
        cafe.setCantidadActual(cantidadActual + cantidadLlenado);
    }

    public void servirTaza(Cafetera cafe, int tamanoTaza) {
        if (cafe.getCantidadActual() >= tamanoTaza) {
            cafe.setCantidadActual(cafe.getCantidadActual() - tamanoTaza);
            System.out.println("Se ha servido la taza de " + tamanoTaza + " ml.");
        } else {
            System.out.println("No se ha podido servir la taza completa, se ha servido " + cafe.getCantidadActual() + " ml.");
            cafe.setCantidadActual(0);
        }
    }

    public void vaciarCafetera(Cafetera cafe) {
        cafe.setCantidadActual(0);
    }

    public void agregarCafe(Cafetera cafe, int cantidadCafe) {
        System.out.print("Ingrese la cantidad de café a agregar: ");
        int cantidad = scan.nextInt();
        if (cafe.getCantidadActual() + cantidad <= cafe.getCapacidadMaxima()) {
            cafe.setCantidadActual(cafe.getCantidadActual() + cantidad);
            System.out.println("Se ha agregado " + cantidad + " ml de café a la cafetera.");
        } else {
            int cantidadMaxima = cafe.getCapacidadMaxima() - cafe.getCantidadActual();
            cafe.setCantidadActual(cafe.getCapacidadMaxima());
            System.out.println("Se ha llenado la cafetera con " + cantidadMaxima + " ml de café, no se pudo agregar " + (cantidad - cantidadMaxima) + " ml.");
        }
    }
}



