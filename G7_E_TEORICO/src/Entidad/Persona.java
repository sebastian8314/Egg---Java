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
public class Persona {
    private String Nombre;
    private int Edad;
    private double Peso;
    private int energia;
    
 public Persona(){
     energia = 1000;
 }
    
 public Persona(String Nombre, int Edad, double Peso){
     this.Nombre = Nombre;
     this.Edad = Edad;
     this.Peso = Peso;
     energia = 1000;
 }
 
 
 public static void main(String[] args){
     
 }
 
 public String getNombre(){
     retun Nombre;
 }
}
