package edu.emiliano_anaya.reto5.reto55;

public class Main {
    public static void main(String[] args) {
        Articulo articulo1 = new Articulo("Camisa", 25.0, 2, 0.16);
        Articulo articulo2 = new Articulo("Pantalón", 40.0, 1, 0.16);
        Articulo articulo3 = new Articulo("Zapatos", 60.0, 1, 0.16);

        CarritoDeCompras carrito = new CarritoDeCompras();
        carrito.agregarArticulo(articulo1);
        carrito.agregarArticulo(articulo2);
        carrito.agregarArticulo(articulo3);

        System.out.println("Artículos en el carrito:");
        for (Articulo articulo : carrito.getArticulos()) {
            System.out.println("- " + articulo.getNombre() + ": $" + articulo.getPrecioUnitario() + " x " + articulo.getCantidad());
        }

        double total = carrito.calcularTotal();
        System.out.println("Total a pagar: $" + total);
    }
}
