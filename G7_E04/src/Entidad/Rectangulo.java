/*
Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura. La clase incluirá un
método para crear el rectángulo con los datos del Rectángulo dados por
el usuario. También incluirá un método para calcular la superficie del
rectángulo y un método para calcular el perímetro del rectángulo. Por
último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.

 */
package Entidad;

import java.util.Scanner;

public class Rectangulo {
    Scanner scan = new Scanner(System.in);
    private int base, altura;
    private double superficie, perimetro;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void crearrectangulo(){
        System.out.println(" -- Crear rectangulo --");
        System.out.print(" Ingrese la base   => ");
        this.base = scan.nextInt();
        System.out.print(" Ingrese la altura => ");
        this.altura = scan.nextInt();
        System.out.println("");
        System.out.println(" ----------------------- ");
    }   
    
    public void calcsuperficie(){
       superficie = this.base * this.altura;
        System.out.println(" La superficie es => " + superficie);
    }
    
    public void calperimetro(){
        perimetro = (this.altura + this.base) * 2;
        System.out.println(" El perimetro  es => " + perimetro);
    }
    
    public void diburectangulo(){
       for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                if (i == 0 || i == this.altura-1 || j == 0 || j == this.base-1) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        } 
      
    }
}
