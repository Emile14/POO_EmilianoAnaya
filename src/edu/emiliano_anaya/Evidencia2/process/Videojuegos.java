package edu.emiliano_anaya.Evidencia2.process;

public class Videojuegos extends Producto{
    public Videojuegos(String name, String type, double costPerUse, String genre, boolean isNewRelease) {
        super(name, type, costPerUse, genre, isNewRelease);
    }

    @Override
    public double CalcularCosto() {
        return costPorUso+10;
    }

}
