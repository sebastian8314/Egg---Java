/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03.ejercicio.definir.variables.alorjar.resultados;

/**
 *
 * @author sebas
 */
public class EjercicioDefinirVariablesAlorjarResultados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int num1 = 5;
	int num2 = 5;
    
	int suma = num1 + num2;
        
        int resta = num1 - num2;
    
	double division = num1 / num2;
    
	boolean logico = num2 < num1;
    
	num1++;
        
        num1--;
        
        num2++;
        
        num2--;
        
        System.out.println("El resultado de sumar Num 1 + 2 es el valor de: " + suma);
        System.out.println("El resultado de restar Num 1 + 2 es el valor de: " + resta);
        System.out.println("El resultado de dividir Num 1 + 2 es el valor de: " + division);
        System.out.println("El resultado de comparar Num 2 < 1 es el valor de: " + logico);
        System.out.println("El resultado de incrementar Num 1 es valor de: " + (num1++));
              
               
        
	}
}