package Servicio;

import Entidad.Vendedor;
import java.util.Date;
import java.util.Scanner;

public class VendedorServicio {
 
    public Vendedor altaVendedor(){
          
    //Instanciar un objeto del tipo vendedor
    Vendedor v1 = new Vendedor();
    Scanner scan = new Scanner(System.in);
    //lleno los atributos
        System.out.println(" =======================================");
        System.out.println("");
        System.out.print(" Ingrese el nombre del vendedor: ");
        v1.setNombre(scan.next());
        System.out.print(" Ingrese el DNI del vendedor: ");
        v1.setDni(scan.nextInt());
        System.out.print(" Ingrese el sueldo básico del vendedor: ");
        v1.setSueldoBasico(scan.nextDouble());
        System.out.print(" Ingrese el día que comenzo a trabajar: ");
        int dia = scan.nextInt();
        System.out.print(" Ingrese el mes que comenzo a trabajar: ");
        int mes = scan.nextInt();
        System.out.print(" Ingrese el año que empezo a trabajar: ");
        int año = scan.nextInt();
        
        Date fecha = new Date(año-1900, mes-1, dia);
                
        v1.setFechaInicio(fecha);
        return v1;
    }
    public void SueldoMensual(Vendedor v1){
        Scanner scan = new Scanner(System.in);
        System.out.println("");
        System.out.print(" Ingrese cuales fueron las ventas totales del vendedor: ");
        Double ventas = scan.nextDouble();
        v1.setComisiones(ventas*0.15);
        v1.setSueldoMensual(v1.getSueldoBasico() + v1.getComisiones());
        System.out.println("");
        System.out.println(" El sueldo basico mensual del vendedor: "
        + v1.getNombre() + " es de $ " +  v1.getSueldoMensual());
        }
    public void vacaciones (Vendedor v1){
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();
        
        if (antiguedad < 5){
            System.out.println("");
            System.out.println(" Le corresponde 14 días de vacaciones");
            System.out.println("");
         }else if (antiguedad <10){
             System.out.println("");
             System.out.println(" Le corresponde 21 días de vacaciones");
             System.out.println("");
         }else if (antiguedad < 20){
             System.out.println("");
             System.out.println(" Le corresponde 28 días de vacaciones");
             System.out.println("");
         }else if (antiguedad >20){
             System.out.println("");
             System.out.println(" Le corresponde 35 dias de vacaciones");
             System.out.println("");
         }else {
             System.out.println("");
             System.out.println(" El empleado tiene vacaciones proporcionales ");
             System.out.println("");
         }
    }
}
