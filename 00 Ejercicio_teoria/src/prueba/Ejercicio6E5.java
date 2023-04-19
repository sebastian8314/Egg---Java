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
public class Ejercicio6E5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa que pida dos números enteros positivos por teclado 
y muestre por pantalla el siguiente menú:
        El usuario deberá elegir una opción y el 
        programa deberá mostrar el resultado por pantalla y luego volver al menú. El programa 
        deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario
        selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar el 
        siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si el usuario
        selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.*/
        
        Scanner leer = new Scanner(System.in);
        int num1,num2;
        do
        {
        System.out.println("A continuacion ingrese 2 numeros enteros positivos");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
            
        }while(num1<=0 || num2<=0);
        System.out.println("------------------------");
        System.out.println("|  MENU                |");
        System.out.println("|  1.Sumar             |");
        System.out.println("|  2.Restar            |");
        System.out.println("|  3.Multiplicar       |");
        System.out.println("|  4.Dividir           |");
        System.out.println("|  5.Salir             |");
        System.out.println("|  Elija una opcion:   |");
        System.out.println("------------------------");
        
        int opcion;
        opcion = leer.nextInt();
        
        switch (opcion)
        {
            case 1:
                int suma;
                suma = (num1 + num2);
                System.out.println("La suma de "+num1+ " mas "+num2+" es: "+suma);
                break;
            case 2:
                int resta;
                resta = (num1-num2);
                System.out.println("La resta de "+num1+ " menos "+num2+ " es: "+resta);
                break;
            case 3:
                int multiplicar;
                multiplicar = (num1*num2);
                System.out.println("La multiplicacion de "+num1+" y "+num2+ " es: "+multiplicar);
                break;
            case 4:
                double dividir;
                dividir = (num1/num2);
                System.out.println("La division de "+num1+" y "+num2+ " es: "+dividir);
                break;
            case 5:
                break;
            default :
                System.out.println("Opcion incorrecta");
                break;
        }


    }
    
}
