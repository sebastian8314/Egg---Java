
package servicio;

import entidades.Editorial;
import java.util.Scanner;
import persistencia.EditorialDAO;

/**
 *
 * @author sebas
 */
public class EditorialServicio {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");   
    EditorialDAO dao = new EditorialDAO();
   
   public Editorial crearEditorial(){
       Editorial editorial = new Editorial();
       System.out.print(" Ingrese el nombre de editorial => ");
       String nombre = scan.next();
       editorial.setNombre(nombre);
       editorial.setAlta(true);
       dao.persistirEntidad(editorial);
       
       return editorial;
   }
   
   public void  darBaja(){
         System.out.print(" Ingrese el id de la editorial que desea dar de baja => ");
         Integer id = scan.nextInt();
         Editorial editorial = dao.buscarEditorialId(id);
         editorial.setAlta(false);
         dao.actualizarEntidad(editorial);
     }
   
    
    
}
