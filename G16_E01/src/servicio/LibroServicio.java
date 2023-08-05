
package servicio;

import entidades.Autor;
import entidades.Editorial;
import entidades.Libro;
import java.util.Scanner;
import persistencia.LibroDAO;

/**
 *
 * @author sebas
 */
public class LibroServicio {
    
    Scanner scan = new Scanner(System.in).useDelimiter("\n");   
    LibroDAO dao = new LibroDAO();
    
     public void crearLibro(){
         AutorServicio as = new AutorServicio();
         EditorialServicio es = new EditorialServicio();
         Libro libro = new Libro();
         System.out.print(" Ingrese el ISBN del libro => ");
         long ISBN = scan.nextLong();
         libro.setISBN(ISBN);
         System.out.print(" Ingrese el titulo del libro => ");
         String titulo = scan.next();
         libro.setTitulo(titulo);
         System.out.print(" Ingrese el año de edición => ");
         int anio = scan.nextInt();
         libro.setAnio(anio);
         System.out.print(" Ingrese la cantidad de ejemplares => ");
         int catidadEjemplares = scan.nextInt();
         libro.setEjemplares(catidadEjemplares);
         libro.setEjemplaresrestantes(catidadEjemplares);
         libro.setEjemplaresPrestados(0);
         libro.setAlta(true);
         
         Autor autor = as.crearAutor();
         libro.setAutor(autor);
    
         Editorial editorial = es.crearEditorial();
         libro.setEditorial(editorial);
         
         dao.persistirEntidad(libro);
       

   }
     
     public void  darBaja(){
         System.out.print(" Ingrese el ISBN del libro que desea dar de baja => ");
         Long ISBN = scan.nextLong();
         Libro libro = dao.buscarLibroId(ISBN);
         libro.setAlta(false);
         dao.actualizarEntidad(libro);
     }
    
}
