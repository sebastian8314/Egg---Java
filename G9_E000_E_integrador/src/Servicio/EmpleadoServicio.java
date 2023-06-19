/*
La empresa cuenta con solamente 6 empleados, por lo que deberás crear los 6 
objetos Empleados con sus respectivos salarios.
Una vez creados los empleados, deberás guardalos en un arreglo de objeto 
tipo Empleado. Utilizandoese arreglo, tendras que realizar las dos tareas que 
te píden:

1. Calcular y mostrar el salario promedio de todos los empleados.
2. Retornar otro arreglo con los nombres de los empleados que tienen un salario 
mayor al promedio.

Finalmente, debes mostrar todos los empleados con un  salario superior al promedio.
 */
package Servicio;

import Entidad.Empleado;
import java.util.Scanner;

public class EmpleadoServicio {

    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    Empleado[] empleados = new Empleado[6];

    public void crearEmpleado() {

        for (int i = 0; i < empleados.length; i++) {
            System.out.println("");
            System.out.println(" ================== Cargar Empleado (" + (i + 1) + ") ======================== ");
            System.out.print(" Ingrese el nombre  => ");
            String nombre = scan.next();
            System.out.print(" Ingrese el Salario => ");
            double salario = scan.nextDouble();
            empleados[i] = new Empleado(nombre, salario);
        }
    }

    double promedioSalario;

    public void calcularSalarioProm() {
        double sumaSalario = 0;
        for (int i = 0; i < empleados.length; i++) {
            sumaSalario += empleados[i].getSalario();

            promedioSalario = sumaSalario / empleados.length;

        }
            System.out.println("");
            System.out.println(" =========================================================== ");
            System.out.println(" El promedio de todos los salarios es de: " + promedioSalario);
            System.out.println("");
    }

    public void salarioMayor() {
        int contador = 0;

        for (int i = 0; i < empleados.length; i++) {

            if (empleados[i].getSalario() > promedioSalario) {
                contador++;
            }
        }

        String[] nombresEmpleados = new String[contador];
        contador = 0;
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].getSalario() > promedioSalario) {
                nombresEmpleados[contador] = empleados[i].getNombre();
                contador++;
            }
        }
        for (int i = 0; i < nombresEmpleados.length; i++) {
            System.out.println(" -------------------------------------------------------------------------- ");
            System.out.println(" El empleado " + nombresEmpleados[i]+ " supera el promedio del salario. ");
            System.out.println("");
        }
    
    }
}


        


