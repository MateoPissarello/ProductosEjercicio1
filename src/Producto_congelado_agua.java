public class Producto_congelado_agua extends Producto_congelado {
    private double salinidad;

    Producto_congelado_agua(String descripcion, int numero_lote, double temperatura, double salinidad) {
        super(descripcion, numero_lote, temperatura);
        this.salinidad = salinidad;
    }

    public double getSalinidad() {
        return salinidad;
    }

    public void setSalinidad(double salinidad) {
        this.salinidad = salinidad;
    }

    @Override
    public String toString() {
        return super.toString() + "," + " Salinidad: " + this.salinidad;
    }
}
