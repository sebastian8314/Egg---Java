/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color, 
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
 */
package Entidad;

/**
 *
 * @author sebas
 */
public class Electrodomestico {
    
    protected String color;
    protected char consumoenerg;
    protected double precio, peso;

    public Electrodomestico() {
    }

    public Electrodomestico(String color, char consumoenerg, double precio, double peso) {
        this.color = color;
        this.consumoenerg = consumoenerg;
        this.precio = precio;
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoenerg() {
        return consumoenerg;
    }

    public void setConsumoenerg(char consumoenerg) {
        this.consumoenerg = consumoenerg;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    
   public void  comprobarConsumoEnergetico(char letra){
       
   } 
    
    
}
