
package g8_e002_nespresso;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;
import java.util.Scanner;

public class G8_E002_Nespresso {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Creamos una cafetera con capacidad máxima de 2000 ml        
        Cafetera cafe = new Cafetera(2000, 0);
        // Creamos un servicio de cafetera        
        CafeteraServicio servicio = new CafeteraServicio();
// Menú principal        
        int opcion = 0;
        while (opcion != 5) {

            System.out.println("=== MENÚ PRINCIPAL ===");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar café a la cafetera");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese cantidad de café para llenar la cafetera: ");
                    int cantidadLlenado = scan.nextInt();
                    if (cantidadLlenado > cafe.getCapacidadMaxima()) {
                        System.out.println("No se puede llenar la cafetera con más de " + cafe.getCapacidadMaxima() + " ml.");
                    } else {
                        servicio.llenarCafetera(cafe, cantidadLlenado);
                        System.out.println("Cafetera llena con " + cafe.getCantidadActual() + " ml.");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese tamaño de la taza: ");
                    int tamanoTaza = scan.nextInt();
                    servicio.servirTaza(cafe, tamanoTaza);
                    break;
                case 3:
                    servicio.vaciarCafetera(cafe);
                    System.out.println("Cafetera vaciada.");
                    break;
                case 4:
                    System.out.print("Ingrese cantidad de café a agregar:");
                    int cantidadCafe = scan.nextInt();
                    servicio.agregarCafe(cafe, cantidadCafe);
                    System.out.println("Café agregado a la cafetera.");
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
            System.out.println();
        }
    }
}

