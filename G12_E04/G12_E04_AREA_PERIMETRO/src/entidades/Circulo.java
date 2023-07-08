
package entidades;

import Interfaces.calculoFormas;

public class  Circulo{

    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    
    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
    
    
}
