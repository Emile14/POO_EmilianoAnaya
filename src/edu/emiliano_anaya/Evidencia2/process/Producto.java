package edu.emiliano_anaya.Evidencia2.process;

public abstract class Producto {
    protected String name;
    protected String type;
    protected double costPorUso;
    protected String genre;
    protected boolean newRelease;

    public Producto(String name, String type, double costPorUso, String genre, boolean newRelease){
        this.name = name;
        this.type = type;
        this.costPorUso = costPorUso;
        this.genre = genre;
        this.newRelease = newRelease;
    }
    public abstract double CalcularCosto();
}
