/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
método "calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
de 4 y 6 y imprime el área del rectángulo.
 */
package Entidad;

import java.util.Scanner;

public class Rectangulo {
    private int lado1;
    private int lado2;
  
    
    Scanner scan = new Scanner(System.in);

    public Rectangulo() {
    }

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
    public void crear_rectangulo(){
        System.out.println(" -------------------------------------");
        System.out.println(" Crear rectangulo ");
        System.out.print(" Ingrese el valor del lado 1 => "); this.lado1 = scan.nextInt();
        System.out.println("");
        System.out.print(" Ingrese el valor del lado 2 => "); this.lado2 = scan.nextInt();
        System.out.println(" -------------------------------------");
    }
    
    public int calcular_area() {
        int area = this.lado1 * this.lado2;
        System.out.print(" El valor del area es => " + area);
        System.out.println("");
        return area;
    }
    
}
