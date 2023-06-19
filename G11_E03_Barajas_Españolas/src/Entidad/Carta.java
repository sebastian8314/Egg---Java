/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author sebas
 */
public class Carta {
    
    private String numero;
    private Palo Palos;

    public Carta() {
    }

    public Carta(String numero, Palo Palos) {
        this.numero = numero;
        this.Palos = Palos;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Palo getPalos() {
        return Palos;
    }

    public void setPalos(Palo Palos) {
        this.Palos = Palos;
    }

    @Override
    public String toString() {
        return numero + " de " + Palos;
    }


    
    
    
}
