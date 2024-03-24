package edu.emiliano_anaya.reto8.process;

public class Multiplicacion extends Suma{
    /**
     * Multiplicacion de los numeros
     * @param numero1 numero entero
     * @param numero2 numero entero
     * @return La suma repetida de los numeros hasta llegar al resultado deseado
     */
    @Override
    public int calcular(int numero1, int numero2) {
        int resultado = 0;

        for (int i = 0; i < numero2; i++) {
            resultado = super.calcular(numero1, resultado);
        }
        return resultado;
    }
}
