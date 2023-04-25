
/**
 Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.
 */


package EJER_GUIA;

import java.util.Scanner;

public class G3_CLASE04_06_EJER_09 {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        
        
        int contador = 0;
        int numero;
        int suma = 0;
        
        do {
        System.out.println("");
        System.out.println("---------------------");
        System.out.print("Escriba un número = > ");
        numero = Scan.nextInt();
        
        if (numero == 0){
            System.out.println(" Se capturo el número (0)");
            break;
            
        }  else if (numero > 0) {
            suma += numero;
            contador++;
            System.out.println(contador);
        }
        } while (contador < 20);
        
        System.out.println("");
        System.out.println(" La suma de los números ingresados es : " + suma);
        System.out.println("");
        
        
    }

    }