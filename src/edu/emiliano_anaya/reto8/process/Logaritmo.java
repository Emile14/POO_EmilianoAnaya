package edu.emiliano_anaya.reto8.process;

public class Logaritmo extends Division {
    /**
     * Calcula el logaritmo de un número en una base dada.
     * @param valor1 el número del cual se calcula el logaritmo
     * @param valor2 la base del logaritmo
     * @return el logaritmo calculado del número dado en la base dada
     * @throws ArithmeticException si el número es menor o igual a 1 o si la base es menor o igual a 0
     */
    @Override
    public int calcular(int valor1, int valor2) {
        if (valor1 <= 1 || valor2 <= 0)
            throw new ArithmeticException("El logaritmo no está definido para los valores proporcionados");

        int logaritmo = 0;
        int argumento = valor1;
        while (argumento > 1) {
            argumento = super.calcular(argumento, valor2);
            logaritmo++;
        }

        return logaritmo;
    }
}
