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
public class Ejercicio2E5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar la
función equals() en Java.*/
        
        Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese una frase");
        String frase = "eureka";
        String frase2 = leer.nextLine();
             if (frase2.equals(frase))
             {
                 System.out.println("La frase es correcta");   
             }else{
                 System.out.println("La frase es incorrecta");
             }

    }
    
}
