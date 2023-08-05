
package servicio;

import entidades.Autor;
import java.util.Scanner;
import persistencia.AutorDAO;

/**
 *
 * @author sebas
 */
public class AutorServicio {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    AutorDAO dao = new AutorDAO();
    
    public Autor crearAutor(){
        Autor autor = new Autor();
        System.out.print(" Ingrese el nombre del autor => ");
        String nombre = scan.next();
        autor.setNombre(nombre);
        autor.setAlta(true);
        
        dao.persistirEntidad(autor);
        System.out.println(" --- Autor guardado exitosamente ---");
        
        return autor;
    }
    
    public void  darBaja(){
         System.out.print(" Ingrese el id del autor que desea dar de baja => ");
         Integer id = scan.nextInt();
         Autor autor = dao.buscarAutorId(id);        
         autor.setAlta(false);
         dao.actualizarEntidad(autor);
     }
}
