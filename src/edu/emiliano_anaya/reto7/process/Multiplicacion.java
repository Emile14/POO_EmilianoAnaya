package edu.emiliano_anaya.reto7.process;

import java.util.Scanner;

public class Multiplicacion {
    /**
     * Hace la multiplicacion de dos numeros enteros solicitando el multiplicador y el multiplicando al usuario
     * Calcula el resultado mediante una repeticion de sumas y da el resultado.
     */
    public static void multiplicar(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Multiplicando: ");
        int multiplicando = sc.nextInt();

        System.out.print("Multiplicador: ");
        int multiplicador = sc.nextInt();

        int resultado = 0;

        for (int i = 0; i < multiplicador; i++) {
            resultado += multiplicando;
        }

        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}
