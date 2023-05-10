
package g8_e01_guia;

import Entidad.Persona;
import Servicio.PersonaServicio;


public class G8_E01_guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //llamar metodo void mostrar de la clase persona servicio
        
        PersonaServicio p1 = new PersonaServicio();
        
        //
        //se puede instanciar de otra forma como new persona()
        
        p1.mostrarAtributo(new Persona());
        
        
    }
    
}
