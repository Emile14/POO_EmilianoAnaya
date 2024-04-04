package edu.emiliano_anaya.Evidencia2.process;

public class Musica extends Producto{
    public Musica(String name, String type, double costPorUso, String genre, boolean newRelease) {
        super(name, type, costPorUso, genre, newRelease);
    }
    @Override
    public double CalcularCosto() {
        return newRelease ? costPorUso +1.5 :costPorUso;
    }

}
