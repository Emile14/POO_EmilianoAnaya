package edu.emiliano_anaya.reto8.process;

public class Division extends Resta {
    /**
     * Calcula la división de dos enteros.
     * @param numero1 el dividendo
     * @param numero2 el divisor
     * @return el cociente de la división
     */
    @Override
    public int calcular(int numero1, int numero2) {
        int resta = super.calcular(numero1, numero2);
        int cociente = 1;

        while (resta >= numero2) {
            resta = super.calcular(resta, numero2);
            cociente++;
        }
        return cociente;
    }
}
