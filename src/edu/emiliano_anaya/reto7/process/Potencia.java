package edu.emiliano_anaya.reto7.process;

import java.util.Scanner;

public class Potencia {
    /**
     * Solicita al usuario ingresar un número y un exponente,
     * y luego calcula la potencia del número elevado al exponente utilizando solo la suma.
     * Imprime el resultado.
     */
    public static void pedirNumeros(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la el numero:");
        int numero = sc.nextInt();
        System.out.println("Ingresa la potecia a la que se elevara:");
        int exponente = sc.nextInt();
        int resultado = darPotencia(numero, exponente);
        System.out.println("El resultado es: " + resultado);

    }
    /**
     * Calcula la potencia de un número elevado a un exponente utilizando solo la suma.
     *
     * @param base      El número base.
     * @param exponente El exponente al que se elevará el número.
     * @return El resultado de la potencia.
     */
    public static int darPotencia(int base, int exponente) {
        int resultado = 1;

        for (int i = 0; i < exponente; i++) {
            resultado = sumaParaPotencia(resultado, base);
        }

        return resultado;
    }
    /**
     * Realiza la suma de dos números utilizando solo la suma recursiva.
     *
     * @param a El primer número.
     * @param b El segundo número.
     * @return La suma de los dos números.
     */
    public static int sumaParaPotencia(int a, int b) {
        if (b == 0) return a;
        else return sumaParaPotencia(a + 1, b - 1);
    }
}
