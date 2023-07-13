package Servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio, 
//eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar 
//Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio. 
//Realizar un menú para lograr todas las acciones previamente mencionadas.
public class ProductoServicio {

    public void introducirProducto(HashMap<String, Double> productos, Scanner scan) {
        boolean opc = true;
        do {
            System.out.println(" Ingrese en enombre del producto ");
            String nombre = scan.next();
            System.out.println(" Ingrese el precio del producto ");
            double precio = scan.nextDouble();
            productos.put(nombre, precio);
            System.out.println(" Desea agregar otro elemento (S/N)");
            if (scan.next().equalsIgnoreCase("N")) {
                opc = false;
            }

        } while (opc);

    }

    public void modificarPrecio(HashMap<String, Double> productos, Scanner scan) {
        System.out.println(" Ingrese el producto que desea modificar ");
        String producto = scan.next();
        System.out.println(" Ingrese el valor del precio que desea modificar ");
        double precioActual = scan.nextDouble();

//key podemos modificar el precio a traves del metodo replace (llave - valor) 
        productos.replace(producto, precioActual);
    }

    public void eliminarProducto(HashMap<String, Double> productos, Scanner scan) {
        System.out.println(" Ingrese el producto que desea ELIMINAR");
        productos.remove(scan.next());
    }

    public void mostrarProductos(HashMap<String, Double> productos) {
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            System.out.println(" Producto: " + entry.getKey() + " precio " + entry.getValue());
        }

    }
}


