public class Producto_refrigerado extends Producto{
    private int codigo_org;
    private double temperatura;
    Producto_refrigerado(String descripcion, int numero_lote, int codigo_org, double temperatura) {
        super(descripcion, numero_lote);
        this.codigo_org = codigo_org;
        this.temperatura = temperatura;
    }

    public int getCodigo_org() {
        return codigo_org;
    }

    public void setCodigo_org(int codigo_org) {
        this.codigo_org = codigo_org;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return super.toString() + "," + " Codigo del organismo de supervision alimentaria: " + this.codigo_org + "," + " Temperatura " + this.temperatura + "°C";
    }
}
