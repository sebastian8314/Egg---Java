/**
 *
 */
package g7_ee04;

import Entidad.Cuenta;
import java.util.Scanner;

public class G7_EE04 {

    public static void main(String[] args) {

        /*Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un método "retirar_dinero"
que permita retirar una cantidad de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después
de realizar una transacción de retiro.*/
        Scanner leer = new Scanner(System.in);

        Cuenta c1 = new Cuenta();

        c1.ingresarSaldo();
        c1.retirar_dinero();
    }
}
