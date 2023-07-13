/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Comparator;

/**
 *
 * @author sebas
 */
public class Pelicula {

    private String titulo;
    private String director;
    private Double duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }
//    public static Comparator<Pelicula> CompararDuracion = new Comparator<Pelicula>() {
//        @Override
//        public int compare(Pelicula pelicula1, Pelicula pelicula2) {
//            return pelicula1.getDuracion().compareTo(pelicula2.getDuracion());
//        }
//
//    };

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "titulo=" + titulo + ", director=" + director + ", Duracion=" + duracion + '}';
    }

    public static Comparator<Pelicula> CompararDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula pelicula1, Pelicula pelicula2) {
            return pelicula2.getDuracion().compareTo(pelicula1.getDuracion());
        }

    };

    public static Comparator<Pelicula> CompararTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula pelicula1, Pelicula pelicula2) {
            return pelicula1.getTitulo().compareTo(pelicula2.getTitulo());
        }

    };

    public static Comparator<Pelicula> CompararDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula pelicula1, Pelicula pelicula2) {
            return pelicula1.getDirector().compareTo(pelicula2.getDirector());
        }

    };

}
