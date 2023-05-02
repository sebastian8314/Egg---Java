/*
Crear una clase llamada Operacion que tenga como atributos privados
numero1 y numero2. A continuación, se deben crear los siguientes
métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Método constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos
números y los guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el
resultado al main.
f) Método restar(): calcular la resta de los números y devolver el
resultado al main
g) Método multiplicar(): primero valida que no se haga una
multiplicación por cero, si fuera a multiplicar por cero, el método
devuelve 0 y se le informa al usuario el error. Si no, se hace la
multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero,
si fuera a pasar una división por cero, el método devuelve 0 y se le
informa al usuario el error se le informa al usuario. Si no, se hace la
división y se devuelve el resultado al main.
 */
package Entidad;

import java.util.Scanner;


public class Operacion {
    Scanner scan = new Scanner(System.in);
    private int numero1, numero2, suma, resta;
    private double multi, div;
    
    
    
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        System.out.print(" Ingrese un número => ");
        this.numero1 = scan.nextInt();
        System.out.print(" Ingrese un número => ");
        this.numero2 = scan.nextInt();  
    }
    
    public void sumar() {
        suma = this.numero1 + this.numero2;
             
        System.out.println(" La suma es => " + suma);
    }

    public void resta() {
        resta = this.numero1 - this.numero2;

        System.out.println(" La resta es => " + resta);
    }

    public void multi() {
        if (numero1 > 0 && numero2 > 0) {
            multi = this.numero1 * this.numero2;

            System.out.println(" La multiplicacion es => " + multi);

        } else {
            System.out.println(" Error");
        }

    }

    public void div(){
        if (numero1 > 0 && numero2 > 0) {
        div = this.numero1 / this.numero2;
        
        System.out.println(" La division es => " + div);
            
        } else{
            System.out.println(" Error");
        }
        
    }
}
