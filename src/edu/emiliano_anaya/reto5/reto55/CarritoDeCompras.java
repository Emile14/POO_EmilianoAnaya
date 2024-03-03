package edu.emiliano_anaya.reto5.reto55;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private List<Articulo> articulos;

    public CarritoDeCompras() {
        articulos = new ArrayList<>();
    }

    public void agregarArticulo(Articulo articulo) {
        articulos.add(articulo);
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public double calcularTotal() {
        double total = 0;
        for (Articulo articulo : articulos) {
            total += articulo.calcularImporteNeto();
        }
        return total;
    }
}
