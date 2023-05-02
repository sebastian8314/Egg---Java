/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascota.Entidades;

/**
 *
 * @author sebas
 */
public class Mascota {

    private String nombre;
    private String apodo;
    // conejo, gato, perro, loro, carpincho;
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private String raza;
    private int energia;

    public Mascota() {
        this.energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;

        if (tipo.equals("Perro") || tipo.equals("Gato") || tipo.equals("Loro") || tipo.equals("Conejo") || tipo.equals("Carpincho")) {
            this.tipo = tipo;
        }
        this.energia = 1000;

    }

    public Mascota(String nombre, String apodo, String tipo, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.energia = 1000;

    }

    public void setNombre(String nombre) {
        if (nombre.length() > 0) {
            this.nombre = nombre;
        }
    }

    public void setApodo(String apodo) {
        if (apodo.length() > 0) {
            this.apodo = apodo;
        }
    }

    public void setTipo(String tipo) {
        if (tipo.length() > 0) {
            this.tipo = tipo;
        }
    }

    public void setColor(String color) {
        if (color.length() > 0) {
            this.color = color;
        }
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }

    public void setCola(boolean cola) {

    }

    public void setRaza(String raza) {
        if (raza.length() > 0) {
            this.raza = color;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getcolor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean getCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }

    /**
     * Funcion destinanda a pasear
     *
     * @param energiaRestar
     * @return energia
     */
    public int pasear(int energiaRestar) {

        energia -= energiaRestar;

        return energia;
    }

    /**
     * Funcion destinanda a pasear por vueltas
     *
     * @param energiaRestar
     * @param vueltas
     * @return energia
     */
    public int pasear(int energiaRestar, int vueltas) {

        for (int i = 0; i < vueltas; i++) {
            energia -= energiaRestar;
        }

        return energia;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }

}
