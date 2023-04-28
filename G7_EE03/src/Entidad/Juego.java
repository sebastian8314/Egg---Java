/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;
//Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
//a dos jugadores jugar un juego de adivinanza de números. El primer

import com.sun.xml.internal.bind.v2.schemagen.Util;
import java.util.Scanner;

/**
//jugador elige un número y el segundo jugador intenta adivinarlo. El
//segundo jugador tiene un número limitado de intentos y recibe una pista
//de "más alto" o "más bajo" después de cada intento. El juego termina
//cuando el segundo jugador adivina el número o se queda sin intentos.
//Registra el número de intentos necesarios para adivinar el número y el
//número de veces que cada jugador ha ganado.
 */
public class Juego {

    private int num1;
    private int num2;

    public Juego() {
    }

    public Juego(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void iniciar_juego() {

        Scanner leer = new Scanner(System.in);

        int c = 0, cj1 = 0, cj2 = 0,b ;
        String go;

        do {

            System.out.println("Que el Jugador 1 - ingrese un numero del 1 al 10 para ser adivinado");

            num1 = leer.nextInt();
            System.out.println("");
            int intentos = 3;
            b = 0;
            do {
                
                System.out.println(" Jugador 2: Ingrese un numero ");
                num2 = leer.nextInt();
                intentos--;
                

                if (num2 == num1) {
                    System.out.println("acerto ");
                    cj2++;
                    b = 1;

                } else {
                    System.out.println("Error, le quedan  " + intentos + " intentos");

                    if (num1 > num2) {

                        System.out.println(" Ingrese un numero mas ALTO");
                    } else {
                        System.out.println(" Ingrese un numero mas BAJO");

                    }
                }
            } while (intentos > 0 &&  b != 1 );
            if (intentos == 0 && num1 != num2) {
                cj1++;
            }

            System.out.println(" el jugador 1 tiene " + cj1 + " puntos");
            System.out.println(" el jugador 2 tiene " + cj2 + " puntos");

            System.out.println(" desea continuar s/n");
            go = leer.next();

        } while (Util.equalsIgnoreCase(go, "s"));

    }

}