/*
 En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario 
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere 
crear otra Pelicula o no.
 */
package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class PeliculaServicio {

    public ArrayList<Pelicula> crearListaPelicula() {
        ArrayList<Pelicula> peliculas = new ArrayList();
        boolean opc = true;
        do {
            Pelicula pelicula = new Pelicula();
            Scanner scan = new Scanner(System.in).useDelimiter("\n");
            System.out.println(" Ingrese el nombre del Director ");
            pelicula.setDirector(scan.next());

            System.out.println(" Ingrese el titulo de la pelicula ");
            pelicula.setTitulo(scan.next());

            System.out.println(" Ingrese la durancion de la peliculas");
            pelicula.setDuracion(scan.nextDouble());

            peliculas.add(pelicula);

            System.out.println(" ¿Desea ingresar otra pelicula? S/N");
            if (scan.next().equalsIgnoreCase("N")) {
                opc = false;
            }

        } while (opc);
        return peliculas;
    }

//    Después de ese bucle realizaremos las siguientes acciones:
//• Mostrar en pantalla todas las películas.
//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla.
//• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
//pantalla.
//• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    
    public void mostrarPeliculas(ArrayList<Pelicula> peliculas) {
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);

        }

    }

    public void mostrarPeliculasDuracion(ArrayList<Pelicula> peliculas) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }
        }
    }

    public void ordenarDuracionMayor(ArrayList<Pelicula> peliculas) {
        peliculas.sort(Pelicula.CompararDuracion);
        mostrarPeliculas(peliculas);
    }

    public void mostrarDuracionMenor(ArrayList<Pelicula> peliculas) {
        peliculas.sort(Pelicula.CompararDuracion);
        Collections.reverse(peliculas);
        mostrarPeliculas(peliculas);
    }

    public void mostrarTitulo(ArrayList<Pelicula> peliculas) {
        peliculas.sort(Pelicula.CompararTitulo);
        mostrarPeliculas(peliculas);
    }

    public void mostrarDirector(ArrayList<Pelicula> peliculas) {
        peliculas.sort(Pelicula.CompararDirector);
        mostrarPeliculas(peliculas);
    }


     
     
     
     
     
     
     
     
    
}
