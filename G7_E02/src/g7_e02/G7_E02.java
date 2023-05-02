
/**
 * 
 */


package g7_e02;

import Entidad.Circunsferencia;
import java.util.Scanner;

public class G7_E02 {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        
        Circunsferencia c1= new Circunsferencia();  
        
        c1.crearCircunferencia();
        System.out.println("");
        c1.area();
        System.out.println("");
        c1.perimetro();
    }

}