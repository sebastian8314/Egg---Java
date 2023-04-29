/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 * //Crea una clase "Juego" que tenga un método "iniciar_juego" que permita //a
 * dos jugadores jugar un juego de adivinanza de números. El primer //jugador
 * elige un número y el segundo jugador intenta adivinarlo. El //segundo jugador
 * tiene un número limitado de intentos y recibe una pista //de "más alto" o
 * "más bajo" después de cada intento. El juego termina //cuando el segundo
 * jugador adivina el número o se queda sin intentos. //Registra el número de
 * intentos necesarios para adivinar el número y el //número de veces que cada
 * jugador ha ganado.
 */
public class Juego {

    private int num;
    private int numadivina;
    private int numIntento;

    public Juego() {
    }

    public Juego(int num, int numadivina, int numIntento) {
        this.num = num;
        this.numadivina = numadivina;
        this.numIntento = numIntento;
    }

    public void iniciar_juego() {
        Scanner scan = new Scanner(System.in);
        int cont = 0;
        System.out.println(" Ingrese Jugador 1 un Nro ");
        this.num = scan.nextInt();
        System.out.println(" Ingrese la cantidad de intentos");
        this.numIntento = scan.nextInt();

        do {
            System.out.println(" Ingrese jugador 2 un Nro");
            this.numadivina = scan.nextInt();
            if (this.numadivina == this.num) {
                System.out.println("Ud adivino :)");
                break;

            } else {
                cont++;
                if (cont == this.numIntento) {
                    System.out.println(" Te quedaste sin intento");
                } else {
                    if (this.numadivina > this.num) {
                        System.out.println("El numero es mayor al numero adivinar \n te quedan " + (this.numIntento - cont) + " intentos");
                    } else {
                        System.out.println("El numero es menor al numero adivinar \n te quedan " + (this.numIntento - cont) + " intentos");
                    }
                }
            }

        } while (cont < this.numIntento && this.numadivina != this.num);

    }

}

