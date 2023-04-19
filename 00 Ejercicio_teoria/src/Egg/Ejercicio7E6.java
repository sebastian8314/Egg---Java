/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Egg;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio7E6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar 
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer 
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se 
utilizan las siguientes funciones de Java Substring(), Length(), equals().*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("A contiuacion infrese una frase de 5 caracteres");
        
        int cant;
        int cont1, cont2;
        cont1 = 0;
        cont2 = 0;
        String frase,caract1, caract2, FDE;
        do {
        caract1 = "x";
        caract2 = "o";
        FDE = "&&&&&";
        frase = leer.next();
        cant = frase.length();
        if  
               ((frase.substring(0,1).equals(caract1)) && (frase.substring(4,5).equals(caract2)))
        {
            cont1 = cont1+1;
         }else {
            if (frase.equals(FDE));
            cont2 = cont2+1;
        }
        
        }while (!frase.equals(FDE));
        System.out.println("La cantidad de secuencias correctas es de: "+cont1);
        System.out.println("La cantidad de secuencias incorrectas es de: "+cont2);
    }
    
}
