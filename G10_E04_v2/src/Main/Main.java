
/**
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto, 
tendremos una clase Pelicula con el título, director y duración de la película (en horas). 
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo 
que se pide a continuación:

 */


package Main;

import Entidad.Pelicula;
import Servicio.PeliculaServicio;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        
        
        PeliculaServicio pa = new PeliculaServicio(); 
        ArrayList<Pelicula> peliculas = pa.crearListaPelicula();
        
        System.out.println(" Mostrar peliculas ");
        pa.mostrarPeliculas(peliculas);
        System.out.println(" ----------------- ");
        System.out.println(" Mostrar duracion mayor a una hora ");
        pa.mostrarPeliculasDuracion(peliculas);
        System.out.println(" ------------------ ");
        System.out.println(" Mostrar mostrar de mayor a menor por duracion ");
        pa.ordenarDuracionMayor(peliculas);
        System.out.println(" ------------------ ");
        System.out.println(" Mostrar mostrar de menor a mayor por duracion ");
        pa.mostrarDuracionMenor(peliculas);
        System.out.println(" ----------------- ");
        System.out.println(" Mostrar por Titulo ");
        pa.mostrarTitulo(peliculas);
        System.out.println(" ----------------- ");
        System.out.println(" Mostrar por Director ");
        pa.mostrarDirector(peliculas);
        
        
    }

}