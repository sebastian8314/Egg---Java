/*

d) Método cargarAlumnos(): este método le permitirá al usuario ingresar
los alumnos que asisten a las clases. Nosotros nos encargaremos de
almacenar esta información en un arreglo e iterar con un bucle,
solicitando en cada repetición que se ingrese el nombre de cada
alumno.
e) Método crearCurso(): el método crear curso, le pide los valores de
los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Curso. En este método invocamos al
método cargarAlumnos() para asignarle valor al atributo alumnos
f) Método calcularGananciaSemanal(): este método se encarga de
calcular la ganancia en una semana por curso. Para ello, se deben
multiplicar la cantidad de horas por día, el precio por hora, la
cantidad de alumnos y la cantidad de días a la semana que se repite
el encuentro.

 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

public class CursoServicio {

    private Scanner scan = new Scanner(System.in);

    public Curso crearCurso() {
        Curso ca = new Curso();

        System.out.println(" Ingrese Nombre curso");
        ca.setNombreCurso(scan.nextLine());
        System.out.println(" Ingrese Cant. Horas p/dias ");
        ca.setCantidadHorasPorDia(scan.nextDouble());
        System.out.println(" Ingrese cant. dias semana ");
        ca.setCantidadDiasPorSemana(scan.nextInt());
        System.out.println(" Ingrese el turno (M/T)");
        char l = scan.next().charAt(0);
        ca.setTurno(l);
        System.out.println(" Ingrese precio p/Hora");
        ca.setPrecioPorHora(scan.nextDouble());
        cargarAlumnos(ca);

        return ca;
    }

    public void cargarAlumnos(Curso a) {

        for (int i = 0; i < a.getAlumnos().length; i++) {
            System.out.println(" Ingrese alumno" + (i + 1));
            a.getAlumnos()[i] = scan.next();

        }
        //System.out.println(Arrays.toString(a.getAlumnos()));
        a.setAlumnos(a.getAlumnos());
    }

    public double calcularGanaciaSemanal(Curso c) {

        int dia = c.getCantidadDiasPorSemana();
        double hora = c.getCantidadHorasPorDia();
        double precio = c.getPrecioPorHora();
        int cantA = c.getAlumnos().length;

        return dia * hora * precio * cantA;
    }

}
