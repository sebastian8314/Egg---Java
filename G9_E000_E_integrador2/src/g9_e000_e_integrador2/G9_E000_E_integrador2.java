package g9_e000_e_integrador2;

import Entidad.Estudiante;
import Servicio.EstudianteServicio;
import java.util.Arrays;

public class G9_E000_E_integrador2 {

    public static void main(String[] args) {

        EstudianteServicio Es = new EstudianteServicio();
        
        
        Estudiante[] E1 = Es.crearAlumno();
        Es.calcularNotasProm(E1);
        
        
    }

}
