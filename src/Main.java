public class Main {
    public static void main(String[] args) {
        Producto[] listaProductos = new Producto[7];
        listaProductos[0] = new Producto_fresco("Mango", 260);
        listaProductos[1] = new Producto_fresco("Banano" , 43);
        listaProductos[2] = new Producto_refrigerado("Leche",125,809,3);
        listaProductos[3] = new Producto_refrigerado("Queso",70,432,2);
        listaProductos[4] = new Producto_congelado_agua("Chuleta",89,-4,6);
        listaProductos[5] = new Producto_congelado_aire("Salchichas", 632,-5,3.8,32.1,5.1,39);
        listaProductos[6] = new Producto_congelado_nitrogeno("Chorizo",42,-10,"Congelamiento mediante nitrogeno",3600);

        for (Producto producto : listaProductos){
            System.out.println(producto);
        }
    }
}