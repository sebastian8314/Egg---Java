/**
 *
 */
package g12_e02_v2;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

public class G12_E02_V2 {

    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();

        int opcion = 0;
        while (opcion != 3) {
            System.out.println("----- MENU -----");
            System.out.println("1. ELIJA UNA LAVADORA");
            System.out.println("2. ELIJA UN TELEVISOR");
            System.out.println("3. SALIR");
            System.out.print("SELECCIONE UNA OPCION: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    crearLavadora(scanner, electrodomesticos);
                    break;
                case 2:
                    crearTelevisor(scanner, electrodomesticos);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción invalida. Por favor, seleccione una opcion valida.");
                    break;
            }

            System.out.println();
        }

        double precioTotalElectrodomesticos = 0;
        double precioTotalLavadoras = 0;
        double precioTotalTelevisores = 0;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            double precioFinal = electrodomestico.precioFinal();
            precioTotalElectrodomesticos += precioFinal;

            if (electrodomestico instanceof Lavadora) {
                precioTotalLavadoras += precioFinal;
            } else if (electrodomestico instanceof Televisor) {
                precioTotalTelevisores += precioFinal;
            }

            System.out.println("Precio final del electrodomestico: $" + precioFinal);
        }

        System.out.println("Precio total de las lavadoras: $" + precioTotalLavadoras);
        System.out.println("Precio total de los televisores: $" + precioTotalTelevisores);
        System.out.println("Precio total de todos los electrodomesticos: $" + precioTotalElectrodomesticos);

        scanner.close();
    }

    public static void crearLavadora(Scanner scanner, ArrayList<Electrodomestico> electrodomesticos) {
        System.out.print("Ingrese el precio de la lavadora: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Ingrese el color de la lavadora: ");
        String color = scanner.nextLine();

        System.out.print("Ingrese el consumo energetico de la lavadora (A-F): ");
        char consumoEnergetico = scanner.nextLine().charAt(0);

        System.out.print("Ingrese el peso de la lavadora: ");
        double peso = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Ingrese la carga de la lavadora: ");
        double carga = scanner.nextDouble();
        scanner.nextLine();

        Lavadora lavadora = new Lavadora(precio, color, consumoEnergetico, peso, carga);
        electrodomesticos.add(lavadora);

        System.out.println("Lavadora creada exitosamente:");
        System.out.println("Precio final: $" + lavadora.precioFinal());
        System.out.println();
        System.out.println("       \r\n"
        		+ "             "
        		+ "                     \r\n"
        		+ "    [----------------] \r\n"
        		+ "    | |'''''''''''|  |  \r\n"
        		+ "    | |    000    |  |  \r\n"
        		+ "    | |    000    |  |        \r\n"
        		+ "    | '-----------'  |      \r\n"
        		+ "    |=============== |      \r\n"
        		+ "    |    whirlpool   |      \r\n"
        		+ "    '================'     ");
       
           
        
        System.out.println();
        
    }

    public static void crearTelevisor(Scanner scanner, ArrayList<Electrodomestico> electrodomesticos) {
        System.out.print("Ingrese el precio del televisor: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Ingrese el color del televisor: ");
        String color = scanner.nextLine();

        System.out.print("Ingrese el consumo energético del televisor (A-F): ");
        char consumoEnergetico = scanner.nextLine().charAt(0);

        System.out.print("Ingrese el peso del televisor: ");
        double peso = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Ingrese la resolucion del televisor: ");
        double resolucion = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("¿El televisor tiene sintonizador TDT? (true/false): ");
        boolean sintonizadorTDT = scanner.nextBoolean();
        scanner.nextLine();

        Televisor televisor = new Televisor(precio, color, consumoEnergetico, peso, resolucion, sintonizadorTDT);
        electrodomesticos.add(televisor);

       
        System.out.println("Televisor creado exitosamente:");
        System.out.println("Precio final: $" + televisor.precioFinal());
        System.out.println();
        System.out.println("         \r\n"
        		+ "              \\/\r\n"
        		+ "    .===============.\r\n"
        		+ "    | .-----------. |\r\n"
        		+ "    | |           | |\r\n"
        		+ "    | |           | |\r\n"
        		+ "    | |           | |   __\r\n"
        		+ "    | '-----------'o|  |o.|\r\n"
        		+ "    |====philips====|  |::|\r\n"
        		+ "    |###############|  |::|\r\n"
        		+ "    '==============='  '--' _______");
       
        System.out.println();
    }
}
