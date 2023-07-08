package Servicios;

import Interfaces.calculoFormas;
import entidades.Circulo;
import java.util.Scanner;

public class CirculoService implements calculoFormas {

    Scanner leer = new Scanner(System.in);

    Circulo circulo = new Circulo();

    public void CrearCirculo() {

        System.out.print(" Ingrese el radio => ");
        circulo.setRadio(leer.nextDouble());

    }

    @Override
    public void CalculaPerimetro() {

        double resultado = PEPE * (circulo.getRadio() * 2);

        System.out.println(" El perimetro es " + resultado);

    }

    @Override
    public void CalculaArea() {

        double resultado = PEPE * (circulo.getRadio() * circulo.getRadio());

        System.out.println(" El Area es " + resultado);

    }

}
