
package g7_e04;

import Entidad.Rectangulo;
import java.util.Scanner;

public class G7_E04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Rectangulo r1 = new Rectangulo();
        
        r1.crearrectangulo();
        r1.calcsuperficie();
        r1.calperimetro();
        r1.diburectangulo();
    }

}