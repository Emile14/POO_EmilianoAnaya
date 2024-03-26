package edu.emiliano_anaya.reto8.process;

public class Raiz extends Multiplicacion{
    /**
     * Calcula la raíz de un número elevado a un índice dado.
     * @param valor1 el número del cual se calcula la raíz
     * @param valor2 el índice de la raíz
     * @return la raíz calculada del número dado
     * @throws ArithmeticException si el número o el índice son negativos
     */
    @Override
    public int calcular(int valor1, int valor2) {
        if (valor1 < 0) throw new ArithmeticException("No se puede calcular la raíz de un número negativo");

        if (valor2 < 0) throw new ArithmeticException("No se puede calcular la raíz con un indice negativo");

        int raiz;
        int pruebaPotecncias = 0;
        int validacion = 0;
        int aproximacion = 1;

        while (pruebaPotecncias < valor1) {
            validacion = aproximacion;
            pruebaPotecncias = 1;
            for (int i = 0; i < valor2; i++) {
                pruebaPotecncias = super.calcular(pruebaPotecncias, aproximacion);
            }
            aproximacion++;
        }
        raiz = validacion;

        return raiz;
    }

}
