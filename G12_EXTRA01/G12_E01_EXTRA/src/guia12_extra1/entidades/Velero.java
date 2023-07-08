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
public class Velero extends Barco {
    private Integer mastil;

    public Velero() {
    }

    public Velero(Integer mastil) {
        this.mastil = mastil;
    }

    public Velero(Integer mastil,String matricula,Integer eslora,Date fabricacion){
        this.mastil=mastil;
        this.matricula=matricula;
        this.eslora=eslora;
        this.fabricacion=fabricacion;
    }

    public Integer getMastil() {
        return mastil;
    }

    public void setMastil(Integer mastil) {
        this.mastil = mastil;
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
        return "Velero{" + "mastil=" + mastil + '}';
    }

}
