package edu.emiliano_anaya.Evidencia2.process;

public class Libros extends Producto {
    public Libros(String name, String type, double costPerUse, String genre, boolean isNewRelease) {
        super(name, type, costPerUse, genre, isNewRelease);
    }
    @Override
    public double CalcularCosto() {
        double extraCost = 0;
        if (newRelease) {
            extraCost += 0.5;
        }
        switch (genre) {
            case "Novela":
                extraCost += 2;
                break;
            case "Tecnologia":
                extraCost += 3;
                break;
            default:
                extraCost += 1;
                break;
        }
        return costPorUso + extraCost;
    }

}
