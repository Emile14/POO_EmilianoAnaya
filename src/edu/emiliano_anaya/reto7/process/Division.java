package edu.emiliano_anaya.reto7.process;

import java.util.Scanner;

public class Division {
    /**
     * Solicita al usuario el dividendo y el divisor y saca el cociente y el residuo por medyio
     * de la resta repetida.
     */
    public static void dividir(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Dividendo: ");
        int dividendo = sc.nextInt();

        System.out.print("Divisor: ");
        int divisor = sc.nextInt();

        int cociente = 0;

        while (dividendo >= divisor) {
            dividendo -= divisor;
            cociente++;
        }

        System.out.println("El cociente de la división es: " + cociente);
        System.out.println("El residuo o modulo de la división es: " + dividendo);
    }
}
