/*

 */
package Entidad;

/**
 *
 * @author sebas
 */
public class Televisor extends Electrodomestico {

    private double resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
        super();
        this.resolucion = 0;
        this.sintonizadorTDT = false;
    }

    public Televisor(double precio, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean hasSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public void crearTelevisor() {
        super.crearElectrodomestico();
        // ATRIBUTOS PROPIOS DEL TELEVISOR(SINTONIZADOR TDT)
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();

        if (resolucion > 40) {
            precioFinal *= 1.3;
        }

        if (sintonizadorTDT) {
            precioFinal += 500;
        }

        return precioFinal;
    }
}
