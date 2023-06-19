/*
Un profesor particular está dando cursos para grupos de cinco alumnos
y necesita un programa para organizar la información de cada curso.
Para ello, crearemos una clase entidad llamada Curso, cuyos atributos
serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana,
turno (mañana o tarde), precioPorHora y alumnos. Donde alumnos es un
arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los
siguientes métodos:
a) Un constructor por defecto.
b) Un constructor con todos los atributos como parámetro.
c) Métodos getters y setters de cada atributo.
 */
package Entidad;

import java.util.Arrays;

public class Curso {
    
        private String nombreCurso;

    /**
     * Get the value of nombreCurso
     *
     * @return the value of nombreCurso
     */
    public String getNombreCurso() {
        return nombreCurso;
    }

    /**
     * Set the value of nombreCurso
     *
     * @param nombreCurso new value of nombreCurso
     */
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

        private double cantidadHorasPorDia;

    /**
     * Get the value of cantidadHorasPorDia
     *
     * @return the value of cantidadHorasPorDia
     */
    public double getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    /**
     * Set the value of cantidadHorasPorDia
     *
     * @param cantidadHorasPorDia new value of cantidadHorasPorDia
     */
    public void setCantidadHorasPorDia(double cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

       private int cantidadDiasPorSemana;

    /**
     * Get the value of cantidadDiasPorSemana
     *
     * @return the value of cantidadDiasPorSemana
     */
    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    /**
     * Set the value of cantidadDiasPorSemana
     *
     * @param cantidadDiasPorSemana new value of cantidadDiasPorSemana
     */
    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }
 
    private char turno;

    /**
     * Get the value of turno
     *
     * @return the value of turno
     */
    public char getTurno() {
        return turno;
    }

    /**
     * Set the value of turno
     *
     * @param turno new value of turno
     */
    public void setTurno(char turno) {
        this.turno = turno;
    }

        private double precioPorHora;

    /**
     * Get the value of precioPorHora
     *
     * @return the value of precioPorHora
     */
    public double getPrecioPorHora() {
        return precioPorHora;
    }

    /**
     * Set the value of precioPorHora
     *
     * @param precioPorHora new value of precioPorHora
     */
    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

        private String[]alumnos = new String[5];

    /**
     * Get the value of alumnos
     * Este array retorna los alumnos del curso
     * @return the value of alumnos
     */
    public String[]getAlumnos() {
        return alumnos;
     }

    /**
     * Set the value of alumnos
     *
     * @param alumnos new value of alumnos
     */
    public void setAlumnos(String[]alumnos) {
        this.alumnos = alumnos;
    }

    public Curso() {
    }

    public Curso(String nombreCurso, double cantidadHorasPorDia, int cantidadDiasPorSemana, char turno, double precioPorHora, String[]alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombreCurso=" + nombreCurso + ", cantidadHorasPorDia=" + cantidadHorasPorDia + ", cantidadDiasPorSemana=" + cantidadDiasPorSemana + ", turno=" + turno + ", precioPorHora=" + precioPorHora + ", alumnos=" + Arrays.toString(alumnos) + '}';
    }
   
}
