package edu.emiliano_anaya.Evidencia2.process;

public class Peliculas extends Producto{
    public Peliculas(String name, String type, double costPorUso, String genre, boolean newRelease) {
        super(name, type, costPorUso, genre, newRelease);
    }
    @Override
    public double CalcularCosto() {
        return newRelease ? costPorUso + 15 : costPorUso;
    }

}
