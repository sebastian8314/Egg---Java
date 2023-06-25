/*
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package Servicio;

import Entidad.Perro;
import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class PerroPersonaServicio {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
   
    
    public Persona crearPersona(){
        
        Persona a = new Persona();
        System.out.println(" ========== ( Ingrese datos de la Persona ) ==================== ");
        System.out.println("");
        System.out.print(" Nombre   => ");
        a.setNombre(scan.next().toUpperCase());
        System.out.print(" Apellido => ");
        a.setApellido(scan.next().toUpperCase());  
        System.out.print(" D.N.I N° => ");
        a.setDocumento(scan.nextInt());
        System.out.print(" Edad     => ");
        a.setEdad(scan.nextInt());
        System.out.println("");
        
        return a;
    }
    
    public Perro crearPerro() {
        
        Perro b = new Perro();
        System.out.println(" ========== (  Ingrese  datos  del Perro  ) ==================== ");
        System.out.println("");
        System.out.print(" Nombre   => ");
        b.setNombre(scan.next().toUpperCase());
        System.out.print(" Raza     => ");
        b.setRaza(scan.next().toUpperCase());
        System.out.print(" Edad     => ");
        b.setEdad(scan.nextInt());
        System.out.print(" Tamaño   => ");
        b.setTamanio(scan.next().toUpperCase());
        System.out.println("");
        
        return b;
    }
    
    
}
