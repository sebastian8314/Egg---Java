package g9_e005;

import Entidad.Persona;
import Servicio.PersonaService;
import java.util.Scanner;

public class G9_E005 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        PersonaService p2 = new PersonaService();

        Persona p1 = p2.crearPersona();

        int calcularEdad = p2.calcularEdad(p1);
        System.out.println(p1);
        System.out.println(" =====================================");
        System.out.println("");
        System.out.println(" Su edad es " + calcularEdad);
        System.out.println("");
        System.out.print(" Consultar edad mayor o menor => ");
        int edadConsultada = scan.nextInt();
        p2.menorQue(p1, edadConsultada);
        System.out.println(p2.menorQue(p1, edadConsultada));
        p2.mostrarPersona(p1);

    }

}
