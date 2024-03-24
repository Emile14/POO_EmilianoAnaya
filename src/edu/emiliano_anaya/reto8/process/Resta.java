package edu.emiliano_anaya.reto8.process;

public class Resta extends OperacionAritmetica{
    /**
     * Resta los numeros proporcionados
     * @param numero1 numero entero
     * @param numero2 numero entero
     * @return la resta de ambos numeros
     */
    @Override
    public int calcular(int numero1, int numero2) {
        return numero1-numero2;
    }
}
