/**
 * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno.
 * Se pide toda la información al usuario y ese Alumno se guarda en una lista de
 * tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no.
 * Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
 * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere
 * calcular su nota final y se lo busca en la lista de Alumnos. Si está en la
 * lista, se llama al método. Dentro del método se usará la lista notas para
 * calcular el promedio final de alumno. Siendo este promedio final, devuelto
 * por el método y mostrado en el main.
 */

package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;


public class AlumnoServicio {
    

    public ArrayList<Alumno> crearaListaAlumnos() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Alumno> alumnos = new ArrayList();

        boolean opc = true;
        do {
            Alumno alumno = new Alumno();
            System.out.println("");
            System.out.println(" === Datos del Alumno === ");
            System.out.println("");
            System.out.println(" Ingrese el nombre => ");
            alumno.setNombre(scan.next());
            System.out.println(" Ingrese las notas"); 
            ArrayList<Integer>notas =new ArrayList();
            for (int i = 0; i < 3; i++) {   
            notas.add(scan.nextInt());
            }
            alumno.setNotas(notas);
            alumnos.add(alumno);
            System.out.println("");
            System.out.println(" ¿Desea ingresar a otro alumno? S/N");
            if (scan.next().equalsIgnoreCase("N")) {
                
            }
            
        } while (opc);
        return alumnos; 
    }
    }



