/*
Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia 
   (Area=(π*radio)^2).
e) Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio).

 */
package Entidad;

import java.util.Scanner;

public class Circunsferencia {
    
  private int radio;
  private double area, perimetro;  

    public Circunsferencia() {
    }

    public Circunsferencia(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.print(" Ingrese el radio => ");
        this.radio = scan.nextInt();
    }
    
    public void area() {
        
    area = Math.PI * ( Math.pow  (this.radio, 2 )); 
    System.out.print(" El  area  calculada  es    => " + area);
    }
    
    public void perimetro() {
        
    perimetro = 2 * Math.PI * this.radio;
    System.out.println(" El perimetro calculado es => " + perimetro);    
        
    }
     
 }
    
    
    

