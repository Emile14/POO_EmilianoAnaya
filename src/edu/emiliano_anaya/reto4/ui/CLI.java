package edu.emiliano_anaya.reto4.ui;

import edu.emiliano_anaya.reto4.process.BoletosAutobuses;

import java.util.ArrayList;
import java.util.Scanner;

public class CLI {
    /**
     * Interfaz del menu
     */
    public static void showMenu(){
        System.out.println("********** Bienvenido **********");
        System.out.println("1-Realizar venta del boleto");
        System.out.println("2-Mostrar datos de la lista de venta");
        System.out.println("3-Salir del programa");
        System.out.println("*********************************");
        System.out.println("Selecciona el numero de la opcion a la que quieres ingresar: ");
    }

    /**
     * Lanza la aplicacion junto el menu
     */
    public static void launchAPP(){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (true){
            showMenu();
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    BoletosAutobuses.cantBoletos();
                    break;
                case 2:
                    BoletosAutobuses.mostrarResultado();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }
}
