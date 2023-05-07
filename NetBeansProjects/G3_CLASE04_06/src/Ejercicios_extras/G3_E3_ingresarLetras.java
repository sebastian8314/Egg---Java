/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata 
de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la 
función equals() de la clase String.
 */
package Ejercicios_extras;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class G3_E3_ingresarLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Ingrese una letra => ");
      
      char letra = scan.next().charAt(0);
      
      if (letra == 'a' || letra == 'e' || letra == 'i' || letra == '0' || letra == 'u'){
          System.out.println("");
          System.out.println("La letra "+letra+" ingresada es una vocal");
      }else {
          System.out.println("");
          System.out.println("La letra "+letra+" no es una vocal");
          
      }
      
        
        
        
    }
    
}
