
package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {
    Scanner scan = new Scanner(System.in);
 Scanner ServiceIn = new Scanner(System.in);
    
    public CuentaBancaria crearCuenta(){
    
        CuentaBancaria Cuenta = new CuentaBancaria();
        int number;
        
        
        System.out.print("Ingrese número de documento: ");
        Cuenta.setDniCliente(ServiceIn.nextLong());
        System.out.print("Ingrese monto inicial de su cuenta: $ ");
        Cuenta.setSaldoActual(ServiceIn.nextDouble());
        number = (int) (Math.random()*9000 + 1000);
        Cuenta.setNumeroCuenta(number);
        System.out.printf("Se le ha asignado el número de cuenta %d %n", Cuenta.getNumeroCuenta());

        return Cuenta;
    }
    
    public double Ingresar(CuentaBancaria cuenta, double acreditar){
        cuenta.setSaldoActual(cuenta.getSaldoActual()+acreditar);
        return cuenta.getSaldoActual();
    }
    
    public double Retirar(CuentaBancaria cuenta, double retiro){
        if(retiro > cuenta.getSaldoActual()){
            System.out.println("ERROR!! - No cuenta con ese dinero en su cuenta");
        } else{
            cuenta.setSaldoActual(cuenta.getSaldoActual()-retiro);
        }
        return cuenta.getSaldoActual();
    }

    public void ExtraccionRapida(CuentaBancaria cuenta){
        cuenta.setSaldoActual(cuenta.getSaldoActual()- (cuenta.getSaldoActual()*.2));
    }

    
    public void MostrarSaldo(CuentaBancaria cuenta){
        System.out.println("El saldo de su cuenta es $ " + cuenta.getSaldoActual());
    }
    
    public void MostrarDatos(CuentaBancaria cuenta){
        System.out.println("La cuenta N° "+cuenta.getNumeroCuenta());
        System.out.println("tiene registrado el DNI "+cuenta.getDniCliente());
        System.out.println("cuenta con un saldo de $ "+cuenta.getSaldoActual());
    }
    
}
