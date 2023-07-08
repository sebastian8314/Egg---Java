/**
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
 * programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
 * después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
 * salir, se mostrará todos los perros guardados en el ArrayList.
 */
package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class G10_E01_RazasPerros {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> razaPerros = new ArrayList();

        System.out.println(" ===== Programa Raza Perros =====");
        boolean opc = true;
        do {
            System.out.print(" Ingrese la raza del perro      => ");
            razaPerros.add(scan.next().toUpperCase());
            System.out.println("");
            System.out.println(" =================================");
            System.out.print(" ¿Desea agregar otro perro? S/N => ");

        } while (!(scan.next().equalsIgnoreCase("N")));

        for (String razaPerro : razaPerros) {
            System.out.println("");
            System.out.println(razaPerro);

        }
        System.out.println("");
        System.out.println(" Ingrese el perro que dese ELIMINAR");
        String perroEliminar = scan.next().toUpperCase();
        boolean noEncontrado = true;
        Iterator it = razaPerros.iterator();

        while (it.hasNext()) {
            if (it.next().equals(perroEliminar)) {
                it.remove();
                noEncontrado = false;

            }
        }
        if (noEncontrado) {
            System.out.println("");
            System.out.println(" No se encontro el perro a eliminar ");
        }
        
        System.out.println("");
        System.out.println(" ==== Lista de Perros ====");
        Collections.sort(razaPerros);
        for (String razaPerro : razaPerros) {
            System.out.println("");
            System.out.println(razaPerro);
        }

    }
    
    /* Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá 
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro 
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista 
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará 
la lista ordenada.*/
    
    
    
}