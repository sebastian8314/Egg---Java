/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar sus
nombres más adelante.
 */
package EJER_GUIA;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class G5_CLASE_09_11_EJER_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Ingrese Cantidad de compañeros: ");
        int n =  Scan.nextInt();
        n = n+1;
        
        String[] equipo = new String[n];
        System.out.println("Ingrese los nombres:");
        
        for (int i=0; i < n; i++ ){
            equipo[i] = Scan.nextLine();
        }
        for(int i = 0; i < n; i++){
            System.out.println(equipo[i]);
        }
    }
    
}
