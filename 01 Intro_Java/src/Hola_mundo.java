
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sebas
 */
public class Hola_mundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // se crea variable Scanner que se utiliza para leer los datos del ususario
        Scanner leer = new Scanner(System.in);
        
        //se crea una variable cadena (String) que se utiliza para leer los datos del ususario
        String nombre;
        
        //muestra un mensaje por pantalla
        System.out.println("Ingresa tu nombre => ");
        
        //leemos el nombre de la persona en la variable nombre
        nombre = leer.next();
        
        //mostramos por consola un saludo personalizado
        System.out.println("Hola Mundo! soy " + nombre + " y estoy programando Java!");
    }
    
  
}
