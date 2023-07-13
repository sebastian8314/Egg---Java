package g10_e04;

import Entidad.Pelicula;
import Servicio.PeliculaServicio;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class G10_E04 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        ArrayList<Pelicula> ArrayPelicula = new ArrayList<>();

        PeliculaServicio pelis = new PeliculaServicio();

        pelis.CargarPelicula(ArrayPelicula);
        pelis.MostrarPeliculas(ArrayPelicula);
        pelis.DuracionMayor(ArrayPelicula);
        System.out.println(" =========================== ");
        System.out.println(" Ordernar por duracion Mayor ");
        Collections.sort(ArrayPelicula, Comparadores.ordenarPorDuracionMayor);

        pelis.MostrarPeliculas(ArrayPelicula);
        System.out.println(" =========================== ");
        System.out.println(" Ordernar por duracion Menor ");
        Collections.sort(ArrayPelicula, Comparadores.ordenarPorDuracionMenor);

        pelis.MostrarPeliculas(ArrayPelicula);

        System.out.println(" =========================== ");
        System.out.println(" Ordernar por Titulo ");
        Collections.sort(ArrayPelicula, Comparadores.ordenarPorTitulo);
        pelis.MostrarPeliculas(ArrayPelicula);

        System.out.println(" =========================== ");
        System.out.println(" Ordernar por Autor ");
        Collections.sort(ArrayPelicula, Comparadores.ordenarPorAutor);
        pelis.MostrarPeliculas(ArrayPelicula);

    }

}
