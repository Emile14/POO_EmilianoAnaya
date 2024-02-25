package edu.emiliano_anaya.Evidencia1.data;

/**
 * Esta clase representa un medicamento con sus características y métodos asociados.
 */
public class Medicamentos {
    private String nombreQuimico;
    private String nombreGenerico;
    private String nombreRegistrado;
    private double precioPublico;
    private double precioVenta;
    private String formaFarmaceutica;

    /**
     * Constructor de la clase Medicamentos.
     * @param nombreQuimico El nombre químico del medicamento.
     * @param nombreGenerico El nombre genérico del medicamento.
     * @param nombreRegistrado El nombre registrado del medicamento.
     * @param precioPublico El precio al público del medicamento.
     * @param precioVenta El precio de venta del medicamento.
     * @param formaFarmaceutica La forma farmacéutica del medicamento.
     */
    public Medicamentos(String nombreQuimico, String nombreGenerico, String nombreRegistrado, double precioPublico, double precioVenta, String formaFarmaceutica) {
        this.nombreQuimico = nombreQuimico;
        this.nombreGenerico = nombreGenerico;
        this.nombreRegistrado = nombreRegistrado;
        this.precioPublico = precioPublico;
        this.precioVenta = precioVenta;
        this.formaFarmaceutica = formaFarmaceutica;
    }

    /**
     * Calcula el precio de venta del medicamento basado en su precio al público y forma farmacéutica.
     * @return El precio de venta del medicamento.
     */
    public double calcularPrecioVenta() {
        double porcentajeAdicional = 0;
        switch (formaFarmaceutica) {
            case "solido":
                porcentajeAdicional = 0.09;
                break;
            case "semisolido":
                porcentajeAdicional = 0.12;
                break;
            case "liquido":
                porcentajeAdicional = 0.13;
                break;
        }
        return precioPublico * (1 + porcentajeAdicional);
    }

    /**
     * Devuelve una representación en cadena del medicamento.
     * @return Una cadena que representa el medicamento y sus características.
     */
    @Override
    public String toString() {
        return "Nombre químico: " + nombreQuimico + "\n" +
                "Nombre genérico: " + nombreGenerico + "\n" +
                "Nombre registrado: " + nombreRegistrado + "\n" +
                "Precio al público: " + precioPublico + "\n" +
                "Precio de venta: " + calcularPrecioVenta() + "\n" +
                "Forma farmacéutica: " + formaFarmaceutica;
    }
}
