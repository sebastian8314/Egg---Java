package Entidad;

import java.util.Scanner;

  /**
     * Crear una clase llamada Libro que contenga los siguientes atributos:
     * ISBN, Título, Autor, Número de páginas, y un constructor con todos los
     * atributos pasados por parámetro y un constructor vacío. Crear un método
     * para cargar un libro pidiendo los datos al usuario y luego informar
     * mediante otro método el número de ISBN, el título, el autor del libro y
     * el número de páginas.
     */

public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private String numPag;

//inicializamos los atributos con el constructor vacio
    public Libro() {
    }


   /**
    * Inicializamos el constructor con todos los atributos
    * @param ISBN
    * @param titulo
    * @param autor
    * @param numPag 
    */     
        
        
    public Libro(String ISBN, String titulo, String autor, String numPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }

    public String getISBN(){
        return ISBN;
    }
    
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    
    public String getAutor(){
        return autor;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getNumpag(){
     return numPag;
      }

    public void setNumPagina(String numPag) {
        this.numPag = numPag;
    
    }
    /**
     * Por el metodo scanner cargamos los datos en el metodo llenar libro
     */
    
    
    public void llenarLibro() {
        Scanner Scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println(" Ingrese el ISBN");
        ISBN = Scan.next();
        System.out.println(" Ingrese el Titulo");
        titulo = Scan.next();
        System.out.println(" Ingrese el Autor");
        autor = Scan.next();
        System.out.println(" Ingrese el número de Pagina");
        numPag = Scan.next();

    }

     
    /**
     * datos de salida
     * 
     */
  
   
    public void mostrarLibro() {
        System.out.println("ISBN= " + ISBN + ", titulo= " + titulo + ", autor= " + autor + ", numPag= " + numPag);  
    }
  }
