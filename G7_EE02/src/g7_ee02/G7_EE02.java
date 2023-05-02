
package g7_ee02;

import Entidad.Puntos;
import java.util.Scanner;

public class G7_EE02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        Puntos p1 = new Puntos();
        
        p1.crearPuntos();
        System.out.println("");
        p1.calcularDistancia();
        
     
    }

}