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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que pida una frase y la 
        muestre toda en mayúsculas y después toda en minúsculas.*/
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        String mayus = frase.toUpperCase();
        System.out.println("La frase en mayusculas es: "+mayus);
            String minus = frase.toLowerCase();
        System.out.println("La frase en minusculas es: "+minus);
    }
    
}
