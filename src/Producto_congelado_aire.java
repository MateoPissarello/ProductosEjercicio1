public class Producto_congelado_aire extends Producto_congelado {
    private double porcentaje_nitrogeno;
    private double porcentaje_oxigeno;
    private double porcentaje_dioxido;
    private double porcentaje_vapor;
    Producto_congelado_aire(String descripcion, int numero_lote, double temperatura, double porcentaje_nitrogeno, double porcentaje_oxigeno, double porcentaje_dioxido, double porcentaje_vapor) {
        super(descripcion, numero_lote, temperatura);
        this.porcentaje_nitrogeno = porcentaje_nitrogeno;
        this.porcentaje_oxigeno = porcentaje_oxigeno;
        this.porcentaje_dioxido = porcentaje_dioxido;
        this.porcentaje_vapor = porcentaje_vapor;
    }

    @Override
    public String toString() {
        return super.toString() + " Porcentaje nitrogeno: " + this.porcentaje_nitrogeno + "," + " Porcentaje oxigeno: " + this.porcentaje_oxigeno + "," + " Porcentaje dioxido: " + this.porcentaje_dioxido + "," + " Porcentaje vapor: " + this.porcentaje_vapor;
    }
}
