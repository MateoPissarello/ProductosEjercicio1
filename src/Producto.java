public class Producto {
    private String descripcion;
    private Fecha fecha_caducidad;
    private int numero_lote;
    private Fecha fecha_envasado;
    private Pais pais;

    Producto(String descripcion, int numero_lote){
        super();
        this.descripcion = descripcion;
        this.fecha_caducidad = new Fecha(30,10,2023);
        this.numero_lote = numero_lote;
        this.fecha_envasado = new Fecha(18,3,2023);
        this.pais = new Pais(69, "Colombia");

    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Fecha getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(Fecha fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

    public int getNumero_lote() {
        return numero_lote;
    }

    public void setNumero_lote(int numero_lote) {
        this.numero_lote = numero_lote;
    }

    public Fecha getFecha_envasado() {
        return fecha_envasado;
    }

    public void setFecha_envasado(Fecha fecha_envasado) {
        this.fecha_envasado = fecha_envasado;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Descripcion: " + this.descripcion + "," + " Fecha caducidad: " + this.fecha_caducidad + "," + " Numero lote: " + this.numero_lote + "," + " Fecha envasado: " + this.fecha_envasado + "," + " Pais: " + this.pais;
    }
}
