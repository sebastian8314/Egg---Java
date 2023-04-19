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
public class Ejercicio5E5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa en el cual se ingrese un valor límite positivo,
y a continuación solicite números al usuario hasta que la suma de los números
introducidos supere el límite inicial.*/
        
        Scanner leer = new Scanner(System.in);
        int limite;
        do {
        System.out.println("Ingrese un limite positivo");
            limite = leer.nextInt();
        }while(limite<=0);
        
        System.out.println("A continuacion ingrese numeros enteros");
        
        int suma = 0;
        while (suma<limite)
        {
           
            int num = leer.nextInt();
            suma=suma+num;
            System.out.println("La suma es: "+suma);
            System.out.println("Ingrese otro numero");
        }
        
        
    }
    
}
