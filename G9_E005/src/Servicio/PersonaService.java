/*
Crear una clase PersonaService,
en el paquete servicio, con los siguientes métodos:
a) Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.
b) Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.
c) Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.
d) Mmétodo mostrarPersona que muestra la información de la persona
deseada.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {

    Scanner scan = new Scanner(System.in);

    public Persona crearPersona() {
        Persona p1 = new Persona();
        
        System.out.println(" ============================================");
        System.out.println(" ========== Datos de la persona =============");
        System.out.println("");
        System.out.print(" Ingrese nombre => ");
        String nombre = scan.next();
        System.out.println("");
        System.out.println(" Fecha de nacimiento ");
        System.out.println("");
        System.out.print(" Ingrese dia => ");
        int dia = scan.nextInt();
        System.out.print(" Ingrese mes => ");
        int mes = scan.nextInt();
        System.out.print(" Ingrese año => ");
        int anio = scan.nextInt() - 1900;
        System.out.println("");

        Date fechaDeNacimiento = new Date(anio, mes, dia);
        p1.setFechaDeNacimiento(fechaDeNacimiento);
        p1.setNombre(nombre);
        return p1;
    }

    public int calcularEdad(Persona p1) {
        int fechaNac = p1.getFechaDeNacimiento().getYear();
        Date date = new Date();
        int fechaAct = date.getYear();
        // se realiza diferencia entre la fecha actual y la de nacimiento
        return fechaAct - fechaNac;

    }

    public boolean menorQue(Persona p1, int edad) {
        int edadUsuario = calcularEdad(p1);

        if (edadUsuario < edad) {
            return true;
        } else {
            return false;
        }
    }

    public void mostrarPersona(Persona p1) {
        System.out.println(" ============= Datos del Ususario ==================");
        System.out.println(" Nombre              : " + p1.getNombre());
        System.out.println(" Fecha de nacimiento : " + p1.getFechaDeNacimiento().getDay()
        + "/" + p1.getFechaDeNacimiento().getMonth() + "/" + p1.getFechaDeNacimiento().getYear());
        System.out.println(" Edad                : " + calcularEdad(p1));
    }

}
