


package Utilidades;

import Entidad.Pelicula;
import java.util.Comparator;

/**
 *
 * @author luceros
 */
public class Comparadores {
    
     public static Comparator<Pelicula> ordenarPorDuracionMayor= new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
        
    
      public static Comparator<Pelicula> ordenarPorDuracionMenor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };
    
        public static Comparator<Pelicula> ordenarPorTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
    
          public static Comparator<Pelicula> ordenarPorAutor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getAutor().compareTo(t1.getAutor());
        }
    };
}
    