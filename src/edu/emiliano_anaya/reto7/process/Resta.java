package edu.emiliano_anaya.reto7.process;

import java.util.Scanner;

public class Resta {
    /**
     * Hace la resta de los numeros hasta que sea 0 para dar el resultado de la resta
     */
    public static void resta(){
        Scanner sc = new Scanner(System.in);
        int resultado = 0;
        int numero;
        boolean primerNumero = true;

        do {
            System.out.print("Ingrese un número: ");
            numero = sc.nextInt();

            if (primerNumero) {
                resultado = numero;
                primerNumero = false;
            } else {
                resultado -= numero;
            }
        } while(numero != 0);

        System.out.println("El resultado de la resta es: " + resultado);
    }
}
