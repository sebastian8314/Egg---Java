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
public final class Yate extends BarcoAMotor{
    private Integer numCamarote;

    public Yate() {
    }

    public Yate(Integer numCamarote) {
        this.numCamarote = numCamarote;
    }

    public Yate(Integer numCamarote, Integer potenciaCV) {
        super(potenciaCV);
        this.numCamarote = numCamarote;
    }

    public Integer getNumCamarote() {
        return numCamarote;
    }

    public void setNumCamarote(Integer numCamarote) {
        this.numCamarote = numCamarote;
    }

    @Override
    public Integer getPotenciaCV() {
        return potenciaCV;
    }

    @Override
    public void setPotenciaCV(Integer potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Date getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(Date fabricacion) {
        this.fabricacion = fabricacion;
    }

    @Override
    public String toString() {
        return "Yate{" + "numCamarote=" + numCamarote + '}';
    }
    
    
}
