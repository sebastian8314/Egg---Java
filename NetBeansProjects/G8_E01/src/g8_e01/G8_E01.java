
package g8_e01;

import Entidad.CuentaBancaria;
import Servicio.CuentaBancariaServicio;

public class G8_E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CuentaBancariaServicio c1 = new CuentaBancariaServicio();
        
        CuentaBancaria cb = c1.crearCuenta();
        
    }
    
}
