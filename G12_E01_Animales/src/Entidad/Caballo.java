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
public class Caballo extends Animal {

    @Override
    public void alimentarse() {
        super.alimentarse();
        System.out.println(" El caballo se alimenta a base pastos");

    }

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, String raza, int edad) {
        super(nombre, alimento, raza, edad);
    }

}
