package edu.emiliano_anaya.reto8.process;

public class Suma extends OperacionAritmetica{
    /**
     * Hace la suma de ambos numeros
     * @param numero1 numero entero
     * @param numero2 numero entero
     * @return la suma de los dos numeros
     */
    @Override
    public int calcular(int numero1, int numero2) {
        return numero1 + numero2;
    }
}
