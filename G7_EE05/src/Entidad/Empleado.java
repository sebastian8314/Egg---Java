/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
"salario". Luego, crea un método "calcular_aumento" que calcule el
aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30
años o del 5% si tiene menos de 30 años.
 */
package Entidad;

import java.util.Scanner;


public class Empleado {
    Scanner scan = new Scanner(System.in);
     private String nombre;
     private int edad;
     private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void crear_empleado(){
        System.out.println("-------------------------");
        System.out.println(" Crear empleado");
        System.out.println("");
        System.out.print(" Ingrese nombre => "); this.nombre = scan.next();
        System.out.println("");
        System.out.print(" Ingrese edad => "); this.edad = scan.nextInt();
        System.out.println("");
        System.out.print(" Ingrese salario => "); this.salario = scan.nextInt();
    }
    
    public void calcular_aumento(){
        if (this.edad > 30) {
            this.salario = (int) ((this.salario) + this.salario*0.10);
            System.out.format("Felicidades %s, tiene un aumento del 10 porciento y empezara a ganar %.2f \n", this.nombre,this.salario); 
        } else{
            this.salario += (this.salario*0.05);
             System.out.printf("Felicidades %s, tiene un aumento del 5 porciento y empezara a ganar %.2f \n", this.nombre,this.salario); 
        }
    }    
    
    
}
