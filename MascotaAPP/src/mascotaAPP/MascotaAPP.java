package mascotaAPP;

import java.util.Scanner;
import mascota.Entidades.Mascota;

public class MascotaAPP {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Mascota m1 = new Mascota("Fernando chiquito", scan.next(), "perro");

        m1.setNombre("Pepe chiquito");

        System.out.println(m1.toString());

        m1.pasear(100);

        System.out.println(m1.toString());

    }
}
