
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sebas
 */
public class G3_E7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int n;
        double num, sum = 0, max = Double.NEGATIVE_INFINITY, min = Double.POSITIVE_INFINITY;
        
        System.out.print("Ingrese la cantidad de numeros: ");
        n = sc.nextInt();
        
        int i = 1;
        
        do {
            System.out.print("Ingrese el numero " + i + ": ");
            num = sc.nextDouble();
            sum += num;
            max = Math.max(max, num);
            min = Math.min(min, num);
            i++;
            
        } while (i <= n);
        
        double promedio = sum / n;
        
        System.out.println("El valor maxino es: " + max);
        System.out.println("El valor minimo es: " + min);
        System.out.println("El promedio es: " + promedio);
       
        sc.close();
            
            
        
    }
    
}
