package mx.com.rl.ventas;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int conrtadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    public Orden(){
        this.idOrden =  ++this.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto){
        if (this.conrtadorProductos < Orden.MAX_PRODUCTOS) {
            this.productos[this.conrtadorProductos++] = producto;
        }else {
            System.out.println("Se supero el máximo de productos " + Orden.MAX_PRODUCTOS + ".");
        }
    }

        public double calcularTotal(){
        double total = 0;
            for (int i = 0; i < this.conrtadorProductos; i++) {
             /*   Producto producto = this.productos[i];
                total += producto.getPrecio();*/
                total += this.productos[i].getPrecio();
            }
            return total;
        }

        public void mostartOrden(){
            System.out.println("ID Orden: " + this.idOrden);
            System.out.println("Productos de la Orden: ");

            for (int i = 0; i < this.conrtadorProductos; i++) {
                System.out.println(this.productos[i]);
            }

            double totalOrden = this.calcularTotal();
            System.out.println("Total de la Orden: " + totalOrden +".\n");
        }


}
