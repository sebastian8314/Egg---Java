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

        int cantidad = 3;
        int imc = 0;

        personaServicio n1 = new personaServicio();

        int[] resultadosIMC = new int[cantidad];
        boolean[] mayoresDeEdad = new boolean[cantidad];

        // Creamos un array para almacenar los atributos de persona (array de tipo objeto)
        Persona p1[] = new Persona[cantidad];

        // Creamos un bucle for para asignar el valor a cada array
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese los datos de la persona " + (i + 1));
            p1[i] = n1.crearPersona();
            resultadosIMC[i] = n1.calcularIMC(p1[i]);
            mayoresDeEdad[i] = n1.esMayorDeEdad(p1[i]);
        }
        for (int i = 0; i < cantidad; i++) {
            System.out.println(p1[i]);
            Persona[] personas;
        }
        System.out.println(" ");

        double contimc1 = 0;
        double contimc2 = 0;
        double contimc3 = 0;
        double cont1 = 0;
        double cont2 = 0;

        for (int i = 0; i < cantidad; i++) {
            if (n1.esMayorDeEdad(p1[i])) {
                System.out.println("===========================================");
                System.out.print("La persona " + (i + 1) + " es mayor de edad");
                cont1++;
            } else {
                System.out.println("===========================================");
                System.out.print("La persona " + (i + 1) + " es menor de edad");
                cont2++;
            }

            System.out.println("");
            System.out.println("=========================================");
            imc = n1.calcularIMC(p1[i]);

            switch (resultadosIMC[i]) {
                case -1:
                    System.out.println("Esta bajo de su peso ideal ");
                    System.out.print("====================================");
                    contimc1++;

                    break;
                case 0:
                    System.out.println("Esta en su peso ideal ");
                    System.out.println("==================================");
                    contimc2++;
                    break;
                case 1:
                    System.out.println("Esta por encima de su peso ideal");
                    System.out.println("==================================");
                    contimc3++;
                    break;
            }
        }
        System.out.println(contimc1);
        System.out.println(contimc2);
        System.out.println("===============================================================");
        System.out.println("=============== Estadisticas de Persona =======================");
        System.out.println("===============================================================");
        System.out.println("Porcentaje de personas que estan bajo su peso ideal: " + ((contimc1 / cantidad) * 100));
        System.out.println("===============================================================");
        System.out.println("Porcentaje de personas que esta en su peso ideal: " + ((contimc2 / cantidad) * 100));
        System.out.println("===============================================================");
        System.out.println("Porcentaje de personas que encima de su peso ideal: " + ((contimc3 / cantidad) * 100));
        System.out.println("===============================================================");
        System.out.println("Porcentaje de personas mayores de edad: " + (cont1 / cantidad) * 100);
        System.out.println("Porcentaje de personas menores de edad: " + (cont2 / cantidad) * 100);
        System.out.println("");
    }
}

