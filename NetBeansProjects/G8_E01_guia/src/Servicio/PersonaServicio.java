/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;

/**
 *
 * @author Seba
 */
public class PersonaServicio {
   
    public void mostrarAtributo(Persona p) {
        p.getNombre();
        p.getApellido();
        p.getEdad();
        System.out.println(" El nombre es: " + p.getNombre() + " el apellido es: " + p.getApellido() + " la edad es: " + p.getEdad());
        /**
         * Otra forma es 
         */
        String Nom = p.getNombre();
        String Ape = p.getApellido();
        int edad = p.getEdad();
         
        System.out.println(" El nombre es: " + Nom + " el apellido es: " + Ape + " la edad es: " + edad);
   } 
}
