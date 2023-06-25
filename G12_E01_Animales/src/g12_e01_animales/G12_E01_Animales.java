/**
 * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
 * La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
 * Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
 * mensaje por pantalla informando de que se alimenta.
 */
package g12_e01_animales;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;

public class G12_E01_Animales {

    public static void main(String[] args) {

        System.out.println(" =================================== ");
        Animal p1 = new Perro("Mono", "ucanuba", "caniche", 12);
        p1.alimentarse();
        System.out.println(p1);

        System.out.println(" \n=================================== ");
        Animal g1 = new Gato("Miel", "GGG", "Gatuna", 11);
        g1.alimentarse();
        System.out.println(g1);

        System.out.println(" \n=================================== ");
        Animal c1 = new Caballo("Vayo", "Pasto", "Pura sangre", 150);
        c1.alimentarse();
        System.out.println(c1);

    }

}
