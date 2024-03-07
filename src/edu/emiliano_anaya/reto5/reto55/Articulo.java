package edu.emiliano_anaya.reto5.reto55;

public class Articulo {
    private String nombre;
    private double precioUnitario;
    private int cantidad;
    private double iva;
    public Articulo(String nombre, double precioUnitario, int cantidad, double iva) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.iva = iva;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getIVA() {
        return iva;
    }

    public double calcularImporteNeto() {
        return precioUnitario * cantidad * (1 + iva);
    }
}
