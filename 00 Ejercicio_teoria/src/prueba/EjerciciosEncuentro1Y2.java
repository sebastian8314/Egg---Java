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
public class EjerciciosEncuentro1Y2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
/*Escribir un programa que pida dos números enteros por teclado y 
calcule la suma de los dos. El programa deberá después mostrar el
resultado de la suma
*/
Scanner Leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num1 = Leer.nextInt();
        System.out.println("Ingrese otro numero entero");
        int num2 = Leer.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma es: "+suma);
        
    }
    
}
