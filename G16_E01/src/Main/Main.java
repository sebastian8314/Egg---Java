
package Main;

import java.util.Scanner;
import servicio.AutorServicio;
import servicio.EditorialServicio;
import servicio.LibroServicio;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
      AutorServicio as = new AutorServicio();
      EditorialServicio es = new EditorialServicio();
      LibroServicio ls = new LibroServicio();
      
   
     // ls.crearLibro();
     ls.darBaja();
     as.darBaja();
     es.darBaja();
        
    }

}