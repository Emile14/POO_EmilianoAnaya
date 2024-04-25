package edu.emiliano_anaya.reto11.ui;

import edu.emiliano_anaya.reto11.process.AnalizadorDeLibros;

import java.util.Scanner;

public class Cli {
    private static final Scanner sc = new Scanner(System.in);
    private static Idiomas texto = new Esp();

    /**
     * Menu de idiomas
     */
    public  static void menuIdiomas(){
        System.out.println("Selecciona el idioma del programa");
        System.out.println("1-Espanol");
        System.out.println("2-English");
        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                 texto = new Esp();
                break;
            case 2:
                texto = new Eng();
                break;
            default:
                System.out.println("Opcion no disponible");
        }
    }

    /**
     * Menu de opciones
     */
    public static void launchApp(){
        menuIdiomas();
        int opcion;
        while (true){
            System.out.println("****************************");
            System.out.println(texto.BIENVENIDO);
            System.out.println("1-El arbol magico");
            System.out.println("2-El cohete de papel");
            System.out.println("3-El elefante fotografo");
            System.out.println("4-El pinguino y el canguro");
            System.out.println("5-Una playa con una sorpresa");
            System.out.println("6-"+texto.SALIDA);
            System.out.println("******************************");
            System.out.println(texto.SELECCION);
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    AnalizadorDeLibros.analizar(
                            "C:\\Users\\emili\\IdeaProjects\\POO_EmilianoAnaya2\\src" +
                                    "\\edu\\emiliano_anaya\\reto11\\resources\\ElArbol.txt");
                    break;
                case 2:
                    AnalizadorDeLibros.analizar(
                            "C:\\Users\\emili\\IdeaProjects\\POO_EmilianoAnaya2\\src" +
                                    "\\edu\\emiliano_anaya\\reto11\\resources\\ElCohete.txt");
                    break;
                case 3:
                    AnalizadorDeLibros.analizar(
                            "C:\\Users\\emili\\IdeaProjects\\POO_EmilianoAnaya2\\src" +
                                    "\\edu\\emiliano_anaya\\reto11\\resources\\ElElefante.txt");
                    break;
                case 4:
                    AnalizadorDeLibros.analizar(
                            "C:\\Users\\emili\\IdeaProjects\\POO_EmilianoAnaya2\\src" +
                                    "\\edu\\emiliano_anaya\\reto11\\resources\\ElPinguino.txt");
                    break;
                case 5:
                    AnalizadorDeLibros.analizar(
                            "C:\\Users\\emili\\IdeaProjects\\POO_EmilianoAnaya2\\src" +
                                    "\\edu\\emiliano_anaya\\reto11\\resources\\UnaPlaya.txt");
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println(texto.ERROR);
                    break;
            }
        }
    }
}
