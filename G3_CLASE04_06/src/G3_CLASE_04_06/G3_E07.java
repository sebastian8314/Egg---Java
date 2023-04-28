/**
 * Realizar un programa que simule el funcionamiento de un dispositivo
 * RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
 * cadenas deben llegar con un formato fijo: tienen que ser de un máximo
 * de 5 caracteres de largo, el primer carácter tiene que ser X y el último
 * tiene que ser una O.
 * Las secuencias leídas que respeten el formato se consideran correctas,
 * la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
 * FDE), y toda secuencia distinta de FDE, que no respete el formato se
 * considera incorrecta.
 * Al finalizar el proceso, se imprime un informe indicando la cantidad de
 * lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
 * deberá investigar cómo se utilizan las siguientes funciones de Java
 * Substring(), Length(), equals().
 */
package G3_CLASE_04_06;

import java.util.Scanner;

public class G3_E07 {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        String frase = "";
        String FDE = "&&&&&";
        int contadorcorrectas = 0;
        int contadorincorrectas = 0;

        do {
            do {
                System.out.println("Ingrese una frase de 5 caracteres");
                frase = Scan.next();

            } while (frase.length() != 5);
            {

                String primerLetra = frase.substring(0, 1);
                String ultimaLetra = frase.substring(4, 5);

                if (primerLetra.equalsIgnoreCase("X") && ultimaLetra.equalsIgnoreCase("O"));
                {
                    //system.out.println("correcto");
                    contadorcorrectas++;

                }
                if (!frase.equals(FDE));
                {
                    //System.out.println("Incorrecto");
                    contadorincorrectas++;

                }
            }

        } while (!frase.equals(FDE));
        {
            System.out.println("");

            System.out.println("LECTURAS CORRECTAS:" + contadorcorrectas);
            System.out.println("LECTURAS INCORRECTAS:" + contadorincorrectas);

        }
    }
}
