/**
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar
 * de dos clases.
 * Perro, que tendrá como atributos: nombre, raza, edad y tamaño;
 * y la clase Persona con
 * atributos: nombre, apellido, edad, documento y Perro.
 * Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
 * pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
 * la clase Persona, la información del Perro y de la Persona.
 */
package g11_e01_adoptar_perro;

import Entidad.Perro;
import Entidad.Persona;
import Servicio.PerroPersonaServicio;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class G11_E01_Adoptar_Perro {

    private static Scanner scan = new Scanner(System.in).useDelimiter("\n");
    private static PerroPersonaServicio pps = new PerroPersonaServicio();

    public static void main(String[] args) {

        List<Persona> personas = new ArrayList();
        List<Perro> perrosadoptables = new ArrayList();

        System.out.println(" * Se procede a cargar dos personas en el sistema ");
        System.out.println("");
        for (int i = 0; i < 2; i++) {
            personas.add(pps.crearPersona());

        }

        System.out.println(" * Se procede a cargar dos perros en el Sistema ");
        System.out.println("");
        for (int i = 0; i < 2; i++) {
            perrosadoptables.add(pps.crearPerro());
        }

        System.out.println("");
        for (Persona aux : personas) {
            System.out.println(" Para la persona " + aux.getNombre() + "" + aux.getApellido() + "\nSelecciones uno de los siguientes perros en adopción => ");

            for (Perro aux2 : perrosadoptables) {
                System.out.println(" Nombre " + aux2.getNombre() + "- Raza " + aux2.getRaza());
            }
            String adoptable = scan.next();

            int contador = 0;
            for (int i = 0; i < perrosadoptables.size(); i++) {
                if (adoptable.equalsIgnoreCase(perrosadoptables.get(i).getNombre())) {
                    aux.setPerro(perrosadoptables.get(i));
                    contador++;
                    perrosadoptables.remove(i);

                }

            }
            if (contador == 0) {
                System.out.println("No se ha adoptado un perro válido");
            }
        }
        
        System.out.println("");
        System.out.println("Las siguientes personas han adoptado: ");
        for (Persona aux : personas) {
            if (aux.getPerro() == null) {
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " no ha adoptado a ningun perro");
            } else {
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " a adoptado a " + aux.getPerro().getNombre() + " de raza " + aux.getPerro().getRaza());
            }
        }

    }
}
