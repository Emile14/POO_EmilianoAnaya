package edu.emiliano_anaya.reto8.process;

public class Potencia extends Division{
    /**
     * Calcula la potencia de un número.
     * @param base el número base
     * @param exponente el exponente al que se eleva la base
     * @return el resultado de la potencia
     */
    @Override
    public int calcular(int base, int exponente) {
        // Verifica si el exponente es cero, en ese caso, la potencia es 1
        if (exponente == 0) {
            return 1;
        }

        int resultado = base;
        int potencia = 1;

        // Realiza la potencia utilizando sucesivas multiplicaciones
        while (potencia < exponente) {
            resultado = super.calcular(resultado, base); // Utiliza el método calcular de la clase padre
            potencia++;
        }

        return resultado;
    }
}
