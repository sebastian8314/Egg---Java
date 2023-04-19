/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo,
si el usuario ingresa 1600 minutos, 
el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package Ejercicios_extras;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class G3_E1_pasarTiempoDias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el tiempo en minutos: ");
        int minutos = sc.nextInt();
        int dias = minutos / 1440; //1440 minutos en un día
        int horas = (minutos % 1440)/60; // 60 minutos en una hora
        System.out.println("");
        System.out.println(minutos + " minutos equivalen a " + dias + " dias(s) y " + horas + " hora(s).");
        System.out.println("");
        sc.close();
        
        
    }
    
}
