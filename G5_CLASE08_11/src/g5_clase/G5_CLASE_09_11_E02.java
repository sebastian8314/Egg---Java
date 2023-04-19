/*
Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido

 */
package g5_clase;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class G5_CLASE_09_11_E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int contador = 0;
        System.out.println("Ingrese tamaño del vector");
        int n = Scan.nextInt();
        System.out.println("Ingrese el número a buscar");
        int buscar = Scan.nextInt();
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * (11 - 1) - 1);

        }
        
        for (int i = 0; i < n; i++){
            System.out.println("[" + vector[i] + "]");
        }
        
        
        
        for (int i = 0; i < n; i++) {            
            if(vector[i] == buscar){
                System.out.println("su numero se encuentra en la posicion "+i);
                contador++;
            } 
            if(contador > 0){
            System.out.println("su numero se repite"+ contador + " veces");
        }else{
              System.out.println(" su numero no se encuentra");
            }
    }

    }
}
