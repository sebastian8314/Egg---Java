/*

 */
package Entidad;

/**
 *
 * @author sebas
 */
public class Lavadora extends Electrodomestico {

    private double carga;

    public Lavadora() {
        super();
        this.carga = 0;
    }

    public Lavadora(double precio, String color, char consumoEnergetico, double peso, double carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        super.crearElectrodomestico();

        // ATRIBUTOS DEL LAVARROPA(CARGA)
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();

        if (carga > 30) {
            precioFinal += 500;
        }

        return precioFinal;
    }
}
