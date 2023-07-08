
package Servicios;

import Interfaces.calculoFormas;
import entidades.Rectangulo;
import java.util.Scanner;





public class RectanguloService implements calculoFormas{

      Scanner leer = new Scanner(System.in);
      
   Rectangulo rectangulo = new Rectangulo();
      
   public void CrearRectangulo(){
       
       System.out.print(" Ingrese la base   => ");
       
       rectangulo.setBase(leer.nextDouble());
       
        System.out.print(" Ingrese la altura => ");
       
       rectangulo.setAltura(leer.nextDouble());
       
   }
   
   
      
    @Override
    public void CalculaPerimetro() {

        
        double resultado = (rectangulo.getBase() + rectangulo.getAltura())*2;
        
        System.out.println(" El perimetro es "+resultado );
        
    }

    @Override
    public void CalculaArea() {
      
        
        double resultado = rectangulo.getBase() * rectangulo.getAltura();
        
        System.out.println(" El Area es "+resultado );
        
    }


}
