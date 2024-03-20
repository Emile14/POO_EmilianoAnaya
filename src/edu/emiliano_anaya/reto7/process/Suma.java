package edu.emiliano_anaya.reto7.process;

import java.util.Scanner;

public class Suma {
    /**
     * solo suma los numeros proporcionados ppor el usuario hasta que ponga el 0 para terminar
     * y dar el resultado.
     */
    public static  void  sumar() {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int numero;

        do {
            System.out.print("Ingrese un número: ");
            numero = sc.nextInt();
            suma += numero;
        } while(numero != 0);

        System.out.println("La suma de los números ingresados es: " + suma);
    }
}
