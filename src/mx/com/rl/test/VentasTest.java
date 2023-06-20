package mx.com.rl.test;

import mx.com.rl.ventas.Orden;
import mx.com.rl.ventas.Producto;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Zapatos", 1500.50);
        Producto producto2 = new Producto("Camisa", 500.99);
        Producto producto3 = new Producto("Pantalón", 1200);

        Orden orden1 =  new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.mostartOrden();

        Orden orden2 =  new Orden();
        orden2.agregarProducto(producto3);
        orden2.mostartOrden();
    }
}