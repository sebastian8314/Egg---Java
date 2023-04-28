

package Entidad;

import java.util.Scanner;

public class Libro {

/**
Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.
 */
    
private String ISBN;
private String titulo;
private String autor;
private String numPag;

//inicializamos los atributos con el constructor vacio
public Libro() {
    }

public Libro(String ISBN, String titulo, String autor, String numPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }

public void llenarLibro(){
    Scanner Scan = new Scanner(System.in);
    System.out.println(" Ingrese el ISBN"); Scan.next();
    System.out.println(" Ingrese el Titulo"); Scan.next();
    System.out.println(" Ingrese el Autor"); Scan.next();
    System.out.println(" Ingrese el número de Pagina"); Scan.next();
    
}

@Override
public String toString() {
 
return  ("ISBN=" + ISBN + ", Titulo=" + titulo + ", Autor=" + autor + ", NumPagina=" + numPag );
}


}