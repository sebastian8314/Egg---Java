/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08.ejercicio.validar.nota;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class EjercicioValidarNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Ejercicio 8
        Escriba un programa que valide si una nota está entre 0 y 10, sino está
        entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba una nota");
        int nota = leer.nextInt();
        
        while ((nota < 0) || (nota > 10)) {
            System.out.println("Nota invalida, vuelva a igresarla");
            nota = leer.nextInt();
        }
        System.out.println("La nota es: " + nota);

    }
    
}
