package edu.emiliano_anaya.reto5.reto53;

import java.util.ArrayList;
import java.util.List;

public class ListaCompras {
    private List<Producto> productos;

    public ListaCompras() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.obtenerImporte();
        }
        return total;
    }

    public void mostrarLista() {
        System.out.println("Lista de compras:");
        for (Producto producto : productos) {
            System.out.println("- " + producto.obtenerNombre() + ": $" + producto.obtenerImporte());
        }
    }
}
