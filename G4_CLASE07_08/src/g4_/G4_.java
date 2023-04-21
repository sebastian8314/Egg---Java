/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4_;

import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class G4_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer.parseInt(JOptionPane.showInputDialog(""));
        int un=0,dec=0,cent=0,mil=0,diezmil=0;
        int[] vector = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            vector[i] = (int) (Math.random() * 100000);
        }
        
        for (int i = 0; i < tamaño; i++) {
            System.out.println(vector[i]);
        }
        
        for (int i = 0; i < tamaño; i++) {
           switch(contardigitos(vector[i])){
               case 1:un++; break;
               case 2:dec++; break;
               case 3:cent++; break;
               case 4:mil++; break;
               case 5:diezmil++; break;
           }
        }
       JOptionPane.showMessageDialog ( null,"hay "+un+ " numeros de 1 digito");
        JOptionPane.showMessageDialog ( null,"hay "+dec+ " numeros de 2 digito");
        JOptionPane.showMessageDialog ( null,"hay "+cent+ " numeros de 3 digito");
        JOptionPane.showMessageDialog ( null,"hay "+mil+ " numeros de 4 digito");
        JOptionPane.showMessageDialog ( null,"hay "+diezmil+ " numeros de 5 digito");
     JOptionPane.showMessageDialog ( null,"son "+(un+dec+cent+mil+diezmil)+ " numeros");
    }
 static int contardigitos(int numero) {
     int longitud=(int)((Integer. toString(numero)).length());
   return longitud;   
}
 }
public static void main(String[] args) {
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog("ingrese tamaño del vector"));
        
        int[] vector = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            vector[i] = (int) (Math.random() * 100000);
        }
        int un = 0, dec = 0, cent = 0, mil = 0, diezmil = 0;
        
        for (int i = 0; i < tamaño; i++) {
            System.out.println(vector[i]);
        }
        
        for (int i = 0; i < tamaño; i++) {
            if ((vector[i] > 0) && (vector[i] < 10)) {
                un++;
            }
            if ((vector[i] > 9) && (vector[i] < 100)) {
                dec++;
            }
            if ((vector[i] > 99) && (vector[i] < 1000)) {
                cent++;
            }
            if ((vector[i] > 999) && (vector[i] < 10000)) {
                mil++;
            }
            if ((vector[i] > 9999) && (vector[i] < 100000)) {
                diezmil++;
            }
        }
        JOptionPane.showMessageDialog ( null,"hay "+un+ " numeros de 1 digito");
        JOptionPane.showMessageDialog ( null,"hay "+dec+ " numeros de 2 digito");
        JOptionPane.showMessageDialog ( null,"hay "+cent+ " numeros de 3 digito");
        JOptionPane.showMessageDialog ( null,"hay "+mil+ " numeros de 4 digito");
        JOptionPane.showMessageDialog ( null,"hay "+diezmil+ " numeros de 5 digito");
        
    }
}
