/**
 *
 */
package g8_e003;

import Entidad.Persona;
import Servicio.personaServicio;
import java.util.Scanner;

public class G8_E003 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Instanciamos el servicio (creamos el servicio en el main)
        personaServicio n1 = new personaServicio();

        // Creamos un array para almacenar los atributos de persona (array de tipo objeto)
        int cantidad = 2;
        int imc = 0;
        Persona p1[] = new Persona[cantidad];
        // Creamos un bucle for para asignar el valor a cada array
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese los datos de la persona " + (i + 1));
            p1[i] = n1.crearPersona();
        }
        for (int i = 0; i < cantidad; i++) {
            System.out.println(p1[i]);

        }
        System.out.println(" ");
        for (int i = 0; i < cantidad; i++) {
            if (n1.esMayorDeEdad(p1[i])) {
                System.out.println("La persona " + (i + 1) + " Es mayor de edad");
            } else {
                System.out.println("La persona " + (i + 1) + " Es menor de edad");
            }
            imc = n1.calcularPeso(p1[i]);

            switch (imc) {
                case -1:
                    System.out.println("Esta bajo de su peso ideal ");
                    System.out.println("");
                    break;
                case 0:
                    System.out.println("Esta en su peso ideal ");
                    break;
                case 1:
                    System.out.println("Esta por encima de su peso ideal");
            }

        }

    }

}


