
package Ejercicios_extras;

import java.util.Scanner;

public class G3_E6_estaturaP {

    /*
    Leer la altura de N personas y determinar el promedio de estaturas que se 
    encuentran por debajo de 1.60 mts y el promedio de estaturas en general. 
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       double estatura, promedioG;
       double aux = 0; double aux1 = 0; 
       double promedioM6;
       
        for (int i = 0; i < 5; i++) {
            System.out.println(" Ingrese su estatura");
            estatura = scan.nextInt();
            if (estatura < 1.60){
                aux++;
            }
            aux1 = aux1 + estatura;
        }
        
        System.out.println(aux);
        promedioM6 = (aux/5);
        promedioG = (aux1/5);
        System.out.println(" El promedio de estaturas que se encuentran por debajo de 1.60 mts son: " + promedioM6 + "\nE1 promedio de estaturas en general es : " + promedioG);
       
       
    }
    
}
