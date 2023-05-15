/*
Crear una clase ParDeNumerosService, en el paquete
Servicios, que deberá además implementar los siguientes métodos:
a) Método mostrarValores que muestra cuáles son los dos números
guardados.
b) Método devolverMayor para retornar cuál de los dos atributos tiene
el mayor valor
c) Método calcularPotencia para calcular la potencia del mayor valor de
la clase elevado al menor número. Previamente se deben redondear
ambos valores.
d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
dos valores. Antes de calcular la raíz cuadrada se debe obtener el
valor absoluto del número.

 */
package Servicio;

import Entidad.ParDeNumeros;

public class ParDeNumerosService {

    private ParDeNumeros par;

    public ParDeNumerosService() {
        this.par = new ParDeNumeros();
    }

    public ParDeNumerosService(double numero1, double numero2) {
        this.par = new ParDeNumeros(numero1, numero2);
    }

    public void mostrarValores(){
        System.out.print(" Número N° 1 => " + par.getNum1());
        System.out.print(" Número N° 2 => " + par.getNum2());
    }

    public double devolverMayor() {
        if (par.getNum1() > par.getNum2()) {
            return par.getNum1();
        } else {
            return par.getNum2();
        }
    }
    
    public double calcularPotencia(){
        double mayor = devolverMayor();
        double menor = mayor == par.getNum1() ? par.getNum2() : par.getNum1();
        mayor = Math.round(mayor);
        menor = Math.round(menor);
        return Math.pow(mayor, menor);
    }
    
    public double calcularRaiz(ParDeNumeros par) {
        double menor = par.getNum1() < par.getNum2() ? par.getNum1() : par.getNum2();
        menor = Math.abs(menor);
        return Math.sqrt(menor);
    }

    public ParDeNumerosService(ParDeNumeros par) {
        this.par = par;
    }
}

    

