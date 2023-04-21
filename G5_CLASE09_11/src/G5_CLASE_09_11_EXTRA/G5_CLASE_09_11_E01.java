/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G5_CLASE_09_11_EXTRA;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class G5_CLASE_09_11_E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
       
        int tamaño;
        int num;
        int suma;
        suma=0;
        System.out.println("Ingrese el tamaño del vector");
        tamaño = leer.nextInt();
         int[] vector = new int[tamaño];
         
        System.out.println("Ingrese los valores del vector");
        
       for (int i = 0 ; i < tamaño; i++){
           
           vector[i] = leer.nextInt();
           suma = suma + vector[i];
       }
       
       for (int i = 0 ; i < tamaño; i++){
           System.out.println("[" + vector[i] + "]");
       }
       
        System.out.println("la suma es " +  suma);
    }
    
    
}
