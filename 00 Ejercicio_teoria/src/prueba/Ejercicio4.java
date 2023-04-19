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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dada una cantidad de grados centígrados se debe mostrar
        su equivalente en grados Fahrenheit. La fórmula correspondiente
        es: F = 32 + (9 * C / 5).*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados centigrados: ");
        float gradosC = leer.nextInt();
        float gradosF = 32+(9*gradosC/5);
        System.out.println("Los grados "+gradosC+"ºC equivalentes sos: "+gradosF+"ºF");
        
    }
    
}
