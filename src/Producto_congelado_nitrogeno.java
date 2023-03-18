public class Producto_congelado_nitrogeno extends Producto_congelado {
    private String informacion;
    private int exposicion;

    Producto_congelado_nitrogeno(String descripcion, int numero_lote, double temperatura, String informacion, int exposicion) {
        super(descripcion, numero_lote, temperatura);
        this.informacion = informacion;
        this.exposicion = exposicion;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public int getExposicion() {
        return exposicion;
    }

    public void setExposicion(int exposicion) {
        this.exposicion = exposicion;
    }

    @Override
    public String toString() {
        return super.toString() + "," + " Informacion del metodo de congelacion usado: " + this.informacion + "," + " tiempo de exposicion al nitrogeno en segundos: " + this.exposicion;
    }
}
