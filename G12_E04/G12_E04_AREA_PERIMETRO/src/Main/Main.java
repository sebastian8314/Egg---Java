package Main;

import static Interfaces.calculoFormas.PEPE;
import Servicios.CirculoService;
import Servicios.RectanguloService;
import java.util.Scanner;

public class Main {
//
// Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
//geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
//dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
//dos métodos para calcular el área, el perímetro y el valor de PI como constante.
//Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
//calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
//resultado final.
//Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
//Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        //System.out.println(PEPE);
        CirculoService c1 = new CirculoService();
        RectanguloService r1 = new RectanguloService();

        System.out.println(" ============================== ");
        System.out.println(" Calculo de figuras geometricas ");
        System.out.println(" ============================== ");
        
        System.out.println("");
        System.out.println("          == Circulo ==         ");
        System.out.println("");
        c1.CrearCirculo();
        c1.CalculaPerimetro();
        c1.CalculaArea();
        
        System.out.println(" ============================= ");
        System.out.println("");
        System.out.println("        == Rectangulo ==       ");
        System.out.println("");
        r1.CrearRectangulo();
        r1.CalculaPerimetro();
        r1.CalculaArea();

    }

}
                                                                                                                                                                                                                                                                                                                                                                