/**
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
 * productos que venderemos y el precio que tendrán. Además, se necesita que la
 * aplicación cuente con las funciones básicas.
 */
package Main;

import Servicio.ProductoServicio;
import java.util.Scanner;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashMap<String, Double> productos = new HashMap();

        ProductoServicio ps = new ProductoServicio();
        boolean opc = true;
        do {

            System.out.println(" 1- Introducir productos ");
            System.out.println(" 2- Modificar precio ");
            System.out.println(" 3- Eliminar producto ");
            System.out.println(" 4- Mostrar producto ");
            System.out.println(" 5- Desea SALIR (S/N)");
            switch (scan.nextInt()) {
                case 1:
                    ps.introducirProducto(productos, scan);
                    break;
                case 2:
                    ps.modificarPrecio(productos, scan);
                    break;
                case 3:
                    ps.eliminarProducto(productos, scan);
                    break;
                case 4:
                    ps.mostrarProductos(productos);
                    break;
                case 5:
                    System.out.println(" Desea SALIR (S/N) ");
                    if (scan.next().equalsIgnoreCase("N")) {
                        opc = false;
                    }
                    break;
                default:
                    System.out.println(" NO se reconoce la opción ingresada ");

            }

        } while (opc);
    }

}
