public class Producto_congelado extends Producto{
    private double temperatura;
    Producto_congelado(String descripcion, int numero_lote, double temperatura) {
        super(descripcion, numero_lote);
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return  super.toString() + "," + " Temperatura " + this.temperatura + "°C";
    }
}
