package edu.emiliano_anaya.reto7.ui;

import edu.emiliano_anaya.reto7.process.*;

import java.util.Scanner;

public class Cli {
    /**
     * Menu de la calculadora
     */
    public static void showMenu(){
        System.out.println("**************** Bienvenido ****************");
        System.out.println("Elige un numero de las opciones a calcular");
        System.out.println("1-Calcular una Suma");
        System.out.println("2-Calcular una Resta");
        System.out.println("3-Calcular una Division");
        System.out.println("4-Calcular una Multiplicacion");
        System.out.println("5-Calcular un Logaritmo");
        System.out.println("6- Calcular una Potencia");
        System.out.println("7-Salir");
        System.out.println("********************************************");
    }

    /**
     * Sirve para darte y seleccionar las opciones dispopnibles de la calculadora
     */
    public static void launchApp(){
        Scanner sc = new Scanner(System.in);
        int opcion;
        while (true){
            showMenu();
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese números para sumar (presione 0 para terminar):");
                    Suma.sumar();
                    break;
                case 2:
                    System.out.println("Ingrese números para restar (presione 0 para terminar):");
                    Resta.resta();
                    break;
                case 3:
                    System.out.println("Ingrese el dividendo y el divisor para realizar la división:");
                    Division.dividir();
                    break;
                case 4:
                    System.out.println("Ingrese los dos números para realizar la multiplicación:");
                    Multiplicacion.multiplicar();
                    break;
                case 5:
                    System.out.println("Ingrese el numero del que desea saber su logaritmo:");
                    break;
                case 6:
                    System.out.println("Ingresa el numero que deseas elevar:");
                    Potencia.pedirNumeros();
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        }
    }
}
