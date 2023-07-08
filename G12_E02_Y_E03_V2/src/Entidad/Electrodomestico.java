/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Electrodomestico {

    private double precio;
    private String color;
    private char consumoEnergetico;
    private double peso;

    public Electrodomestico() {
        this.precio = 1000;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = 0;
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = comprobarColor(color);
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private char comprobarConsumoEnergetico(char letra) {
        char[] letrasValidas = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (char c : letrasValidas) {
            if (Character.toUpperCase(letra) == c) {
                return Character.toUpperCase(letra);
            }
        }
        return 'F';
    }

    private String comprobarColor(String color) {
        String[] coloresValidos = {"blanco", "negro", "rojo", "azul", "gris"};
        for (String c : coloresValidos) {
            if (color.equalsIgnoreCase(c)) {
                return c;
            }
        }
        return "blanco";
    }

    public void crearElectrodomestico() {
        /*
    	Scanner scanner=new Scanner(System.in);
    	System.out.print("Ingrese el precio del electrodomestico: ");
    	double precio= scanner.nextDouble();
    	scanner.nextLine();
    	
    	setPrecio(precio);
    	scanner.close();
         */
        // PEDIR INFO AL USUARIO Y PONER LOS ATRIBUTOS DEL ELECTRODOMESTICO
    }

    public double precioFinal() {
        double precioFinal = this.precio;

        switch (consumoEnergetico) {
            case 'A':
                precioFinal += 1000;
                break;
            case 'B':
                precioFinal += 800;
                break;
            case 'C':
                precioFinal += 600;
                break;
            case 'D':
                precioFinal += 500;
                break;
            case 'E':
                precioFinal += 300;
                break;
            case 'F':
                precioFinal += 100;
                break;
        }

        if (peso >= 1 && peso <= 19) {
            precioFinal += 100;
        } else if (peso >= 20 && peso <= 49) {
            precioFinal += 500;
        } else if (peso >= 50 && peso <= 79) {
            precioFinal += 800;
        } else if (peso >= 80) {
            precioFinal += 1000;
        }

        return precioFinal;
    }
}





