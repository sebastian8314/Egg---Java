
package g7_ee01;

import Entidad.Cancion;
import java.util.Scanner;

public class G7_EE01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Cancion c1 = new Cancion();
        Cancion c2 = new Cancion("Merry Christmas Baby", "Elvis Presley");
        
        c1.setAutor("Rodrigo");
        c1.setTitulo("Lo mejor del Amor");
        System.out.println("El nombre de la primer canción es " + c1.getTitulo() + " y su autor es " + c1.getAutor());
        System.out.println("El nombre de la segunda canción es " + c2.getTitulo() + " y su autor es " + c2.getAutor());        
    }

}