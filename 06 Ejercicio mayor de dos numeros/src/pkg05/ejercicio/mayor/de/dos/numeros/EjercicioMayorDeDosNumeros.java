/*
Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.

 */
package pkg05.ejercicio.mayor.de.dos.numeros;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class EjercicioMayorDeDosNumeros {

  public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero");  
        int num1 = leer.nextInt();
        System.out.println("Ingrese un segundo numero");
        int num2 = leer.nextInt();
        
        if (num1 > 25) {
            System.out.println("El num1 es mayor a 25");
            
        }else if (num2>25) {
              System.out.println("El num2 es mayor a 25");
              
        } else{
            System.out.println("Nunguno de los dos es mayor a 25");
        
        }   
        
       
       
               }

}
        
        
        
        
        
        
       
