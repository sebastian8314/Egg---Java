/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Egg;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que pida tu nombre, lo guarde
        en una variable y lo muestre por pantalla.*/
        System.out.println("Escriba su nombre:");
        Scanner leer = new Scanner(System.in);
        String name = leer.next();
        System.out.println("Su nombre es: "+name);
    
    }
    
}
