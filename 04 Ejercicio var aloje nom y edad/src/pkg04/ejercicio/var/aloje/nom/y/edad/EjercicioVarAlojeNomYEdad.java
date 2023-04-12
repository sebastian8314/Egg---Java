/*
 *Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime ambas variables por 
pantalla.
Recomendamos que hagan el siguiente experimento: tipear en minúsculas la palabra sout y apenas 
terminamos de escribirla tocar el botón tab o mejor dicho tabular.
Esto nos va a generar un System.out.println() para poder escribir lo que queramos.

 */
package pkg04.ejercicio.var.aloje.nom.y.edad;

/**
 *
 * @author sebas
 */
public class EjercicioVarAlojeNomYEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nom = "Sebastian";
          int edad = 39;
                
        System.out.println("Mi nombre es " + nom);
        System.out.println("Edad => " + edad);
    }
    
}
