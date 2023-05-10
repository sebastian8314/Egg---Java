package g8_e000_sueldos;

import Entidad.Vendedor;
import Servicio.VendedorServicio;




public class G8_E000_SUELDOS {

    public static void main(String[] args) {
        
    //Instanciar un objeto del tipo servicio
    
    VendedorServicio vs = new VendedorServicio();
     
    //Instanciar un objeto que vamos alojar el retorno de lo que construimos 
    // Alta vendedor  con todos sus atributos llenos en este caso v1 que tenemos
    // que alojar en el main para luego pasar al resto de los metodos cargados
    
    Vendedor v1 = vs.altaVendedor();
    // una vez que ya tengo en la clase principal el objeto que retorna a esta
    // funcion con todos sus atributos cargados puedo llamar a los otros metodos
    // que declaramos en la clase sercive pasando por parametro el objeto v1 que
    // creamos en el primer metodo para hacer los distintos calculos que habian 
    // determinado
    vs.toString();
    System.out.println("");
    System.out.println("");
    vs.SueldoMensual(v1);
    vs.vacaciones(v1);

    }
}
  
  