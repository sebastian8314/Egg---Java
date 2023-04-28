/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego,
 * crea un método "retirar_dinero" que permita retirar una cantidad de dinero
 * del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después
 * de realizar una transacción de retiro.
 */
import com.sun.xml.internal.bind.v2.schemagen.Util;
import java.util.Scanner;

public class Cuenta {

    Scanner leer = new Scanner(System.in);
    private double saldo;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void ingresarSaldo() {

        System.out.println("Ingrese la cantidad de dinero inicial");
        this.saldo = leer.nextInt();

    }

    public void retirar_dinero() {
        int retiro;
        String tecla;
        do {
            System.out.println("Ingrese la cantidad de dinero a retirar");
            retiro = leer.nextInt();
            if (retiro > this.saldo) {
                System.out.println("Saldo insuficiente");
                System.out.println("Su saldo es de: " + saldo);
            } else {

                this.setSaldo(saldo - retiro);
                System.out.println("Su saldo es: " + (saldo));
            }
            System.out.println("Desea realizar otra operacion? S/N");
            tecla = leer.next();
        } while (this.saldo < retiro && Util.equalsIgnoreCase(tecla, "S"));

    }

}
