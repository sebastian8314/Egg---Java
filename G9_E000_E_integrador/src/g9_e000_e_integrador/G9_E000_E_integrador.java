package g9_e000_e_integrador;

import Entidad.Empleado;
import Servicio.EmpleadoServicio;


public class G9_E000_E_integrador {

    public static void main(String[] args) {

       Empleado e1 = new Empleado();
       EmpleadoServicio es = new EmpleadoServicio();
       
       es.crearEmpleado();
       es.calcularSalarioProm();
       es.salarioMayor();
       
       
        }
    
}
