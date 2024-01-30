package edu.emiliano_anaya.reto1.ui;

import edu.emiliano_anaya.reto1.process.CalculadoraMasa;

import java.util.Scanner;

public class CLI {
    /**
     * Este metodo sirve para crear y mostrar el menu
     */
    public static void mostrarMenu() {
            System.out.println("**************** Bienvenido ****************");
            System.out.println("Elige un numero de las opciones a calcular");
            System.out.println("1-Calcular IMC(indice de masa corpora)");
            System.out.println("2-Calcular masa corporal magra");
            System.out.println("3-Calcular metabolismo basal");
            System.out.println("4-salir");
            System.out.println("********************************************");
    }

    /**
     * Este metodo muestra el menu y deja interactuar al usuario con las opciones
     * tambien esta Thread.sleep para descansar el programa ciertos segundos y milisegundos...
     * para que no se vea todo muy rapido
     * tambien se incluye una opcion extra con System.exit(0) para cerrar el programa
     * @throws InterruptedException para dar error y no mostrar al usuario donde estan los errores
     */
    public static  void LaunchAPP() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        do {
            mostrarMenu();
            int opciones = sc.nextInt();
            if (opciones == 1) {
                System.out.println("Ingresa tu altura en centimetros");
                int altura = sc.nextInt();
                System.out.println("Ingresa tu peso en Kg");
                double peso = sc.nextDouble();
                Thread.sleep(1*1000);
                double imc = CalculadoraMasa.calcularIndiceMasaCorporal(altura, peso);
                Thread.sleep(7*100);
                System.out.println("Imc " + imc);
                System.out.println("Volviendo al menu de opciones");
                Thread.sleep(3*1000);
            } else if (opciones == 2) {
                System.out.println("Ingresa tu altura en centimetros");
                double altura = sc.nextInt();
                System.out.println("Ingresa tu peso en Kg");
                double peso = sc.nextDouble();
                System.out.println("Ingresa tu sexo m/f");
                char sexo = sc.next().charAt(0);
                Thread.sleep(1*1000);
                double magra = CalculadoraMasa.calcularMasaCorporalMagra(peso, altura, sexo);
                Thread.sleep(7*100);
                System.out.println("Tu masa magra es de " + magra);
                System.out.println("Volviendo al menu de opciones");
                Thread.sleep(3*1000);
            } else if (opciones == 3) {
                System.out.println("Ingresa tu altura en centimetros");
                double altura = sc.nextInt();
                System.out.println("Ingresa tu peso en Kg");
                double peso = sc.nextDouble();
                System.out.println("Ingresa tu sexo m/f");
                char sexo = sc.next().charAt(0);
                System.out.println("Ingresa tu edad");
                int edad = sc.nextInt();
                Thread.sleep(1*1000);
                double basal = CalculadoraMasa.calcularMetabolismoBasal(peso, altura, sexo, edad);
                Thread.sleep(7*100);
                System.out.println("Tu metabolismo basal es: " + basal);
                System.out.println("Volviendo al menu de opciones");
                Thread.sleep(3*1000);
            } else if (opciones == 4) {
                System.exit(0);
            } else {
                System.out.println("Esta opcion no existe");
                Thread.sleep(3*1000);
            }
        }while(true);
    }
}
