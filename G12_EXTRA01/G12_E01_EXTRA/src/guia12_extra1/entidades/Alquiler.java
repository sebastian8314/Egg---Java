/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12_extra1.entidades;

import java.util.Date;

/**
 *
 * @author Ezequiel
 */
public class Alquiler {
    private String nombre;
    private String DNI;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private Integer amarre;
    private Barco bote;

    public Alquiler() {
    }

    public Alquiler(String nombre, String DNI, Date fechaAlquiler, Date fechaDevolucion, Integer amarre, Barco bote) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.amarre = amarre;
        this.bote = bote;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Integer getAmarre() {
        return amarre;
    }

    public void setAmarre(Integer amarre) {
        this.amarre = amarre;
    }

    public Barco getBote() {
        return bote;
    }

    public void setBote(Barco bote) {
        this.bote = bote;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", DNI=" + DNI + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", amarre=" + amarre + ", bote=" + bote.toString() + '}';
    }
    
    
}
