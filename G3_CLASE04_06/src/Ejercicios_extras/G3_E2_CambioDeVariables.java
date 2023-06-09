/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor 
diferente a cada una. A continuación, realizar las instrucciones necesarias 
para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D 
tome el valor de B. Mostrar los valores iniciales y los valores finales de cada
variable. Utilizar sólo una variable auxiliar
 */
package Ejercicios_extras;

/**
 *
 * @author sebas
 */
public class G3_E2_CambioDeVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int A = 5, B = 10, C = 15, D = 20;
        
        System.out.println("Valores iniciales: ");
        System.out.println("A: " + A + ", B: " + B + ", C: " + C + ", D:" + D);
        
        int aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        
        System.out.println("");
        System.out.println("Valores finales:");
        System.out.println("A: " + A + " , B: " + B + ", C: " + C + ", D: " + D);
        
        
    }
    
}
