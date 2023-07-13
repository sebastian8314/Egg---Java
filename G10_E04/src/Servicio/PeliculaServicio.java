//Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
//que se pide a continuación:
//En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
//todos sus datos y guardándolos en el objeto Pelicula.

package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaServicio {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pelicula CrearPelicula() {
        Pelicula pelis = new Pelicula();

        System.out.println(" Ingrese el titulo de la pelicula");
        pelis.setTitulo(leer.next());
        System.out.println(" Ingrese el autor");
        pelis.setAutor(leer.next());
        System.out.println(" Ingrese la duracion en horas de la pelicula");
        pelis.setDuracion(leer.nextInt());

        return pelis;
    }

    public void CargarPelicula(ArrayList<Pelicula> ArrayPelicula) {
        System.out.println(" Hola .. vamos a cargar peliculas \n");
        String op;
        do {
            ArrayPelicula.add(CrearPelicula());
            System.out.println(" Desea ingresar otra pelicula S/N  ");
            op = leer.next();

        } while (!op.equalsIgnoreCase("n"));
    }

    public void MostrarPeliculas(ArrayList<Pelicula> ArrayPelicula) {
        System.out.println(" Lista de peliculas ");
        for (Pelicula pelicula : ArrayPelicula) {

            System.out.println(pelicula.toString());
        }
        System.out.println("");
    }

    public void DuracionMayor(ArrayList<Pelicula> ArrayPelicula) {
        System.out.println("Las peliculas con duracion mayor a 1 hora son:\n");
        for (Pelicula aux : ArrayPelicula) {

            if (aux.getDuracion() > 1) {
                System.out.println(aux.getTitulo() + " con una duracion de " + aux.getDuracion() + " Horas");

            }
        }
    }

}
