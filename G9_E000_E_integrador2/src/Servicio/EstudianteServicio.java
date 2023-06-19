/*
La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8
estudiantes con sus respectivas notas.
Una vez creado los estudiantes deberemos guardar los estudiantes en un
arreglo de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las
dos tareas que nos ha pedido la escuela.

1. Calcular y mostrar el promedio de notas de todo el curso
2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
nota mayor al promedio del curso
3. Por último, deberemos mostrar todos los estudiantes con una nota
mayor al promedio.
 */
package Servicio;

import Entidad.Estudiante;
import java.util.Scanner;

public class EstudianteServicio {

    Scanner scan = new Scanner(System.in);

    public Estudiante[] crearAlumno() {
        Estudiante estudiantes[] = new Estudiante[1];
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("");
            System.out.println(" ============ Cargar Alumno " + (i + 1) + " ===========");
            System.out.println("");
            System.out.print(" Ingrese el nombre => ");
            String nombre = scan.next();
            System.out.print(" Ingrese la nota   => ");
            double nota = scan.nextDouble();
            System.out.println("");
            estudiantes[i] = new Estudiante(nombre, nota);
        }
        return estudiantes;
    }

    public double calcularNotasProm(Estudiante[] estudiante) {

        int suma = 0;
        for (int i = 0; i < estudiante.length; i++) {

            suma += estudiante[i].getNota();
        }
        double promedio = suma/ estudiante.length;
        System.out.println(" La nota promedio es:" + promedio);
        return promedio;
    
    }
    
    
    
}


