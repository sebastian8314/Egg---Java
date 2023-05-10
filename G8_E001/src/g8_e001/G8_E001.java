package g8_e001;

import Entidad.CuentaBancaria;
import Servicio.CuentaBancariaServicio;
import java.util.Scanner;

public class G8_E001 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        double dinero;
        

        // Instansacion del Servicio
        CuentaBancariaServicio cuentaService = new CuentaBancariaServicio();

        System.out.println("=================INICIAR PARAMETROS==============================================================");
        // Carga de informacion para nuestra cuenta, iniciacion de atributos
        CuentaBancaria Cuenta = cuentaService.crearCuenta();
        System.out.println(Cuenta);  // muestra cambios

        System.out.println("=================METODO INGRESAR==================================================================");
        // Agregar dinero a la cuenta
        System.out.print("Cuanto dinero agrega a su cuenta $ ");
        dinero = scan.nextDouble();
        cuentaService.Ingresar(Cuenta, dinero);
        System.out.println(Cuenta);  // muestra cambios

        System.out.println("=================METODO RETIRAR===================================================================");
        // Retirar dinero a la cuenta
        System.out.print("Cuanto dinero retira de su cuenta $ ");
        dinero = scan.nextDouble();
        cuentaService.Retirar(Cuenta, dinero);
        System.out.println(Cuenta);  // muestra cambios

        System.out.println("=================METODO EXTRACCION RAPIDA=========================================================");
        // Retirar dinero a la cuenta solo un 20%
        cuentaService.ExtraccionRapida(Cuenta);
        System.out.println(Cuenta);  // muestra cambios
        
        System.out.println("=================METODO CONSULTAR SALDO =========================================================");
        // MUESTRA SALDO ACTUAL DE LA CUENTA
        cuentaService.MostrarSaldo(Cuenta);
        System.out.println(Cuenta);  // muestra cambios
        
        System.out.println("=================METODO CONSULTAR DATOS =========================================================");
        // MUESTRA TODOS LOS DATOS DE LA CUENTA
        cuentaService.MostrarDatos(Cuenta);
        System.out.println(Cuenta);  // muestra cambios
        
        
        
    }

}
