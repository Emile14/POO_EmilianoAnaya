package edu.emiliano_anaya.reto3.Diccionario.ui;

import edu.emiliano_anaya.reto3.Diccionario.process.DiccionarioDePalabras;

import java.util.Scanner;

public class CLI {
    public static void showMenu(){
        System.out.println("******* Bienvenido a su diccionario ***********");
        System.out.println("1-Enlistar palabras del diccionario");
        System.out.println("2-Buscar palabras en el diccionario");
        System.out.println("3-Detalle del diccionario");
        System.out.println("4-Finalizar programa");
        System.out.println("************************************************");
        System.out.println("Elija el numero de la opciion que desea seleccionar:");
    }
    public static void launchApp(DiccionarioDePalabras diccionario){
        Scanner sc = new Scanner(System.in);
        int opcion;
        while (true) {
            showMenu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    diccionario.imprimirArrays();
                    break;
                case 2:
                    System.out.println("Introduce la palabra que deseas buscar");
                    String palabra = sc.next();
                    String significado = diccionario.darBusqueda(palabra);
                    System.out.printf("%s: %s.\n", palabra, significado);
                    break;
                case 3:
                    System.out.println("Cantidad de palabras en el diccionario: 10");
                    diccionario.contadorCaracteres();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida, introduzca una opcion valida");
            }
        }
    }
}
