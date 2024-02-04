package edu.emiliano_anaya.reto2.promedio.ui;

import edu.emiliano_anaya.reto2.promedio.process.CalificacionesPromedio;

import java.util.Scanner;

public class CLI {
    public static void LaunchApp(){
        /**
         *El metodo launchApp Le pide al usuario que ingrese el numero de calificaciones que quiere calcular
         * @param numerocalificaciones cuantas calificaciones calculara
         * @param calificaciones Es un arreglo de  y va a tener la longitud que se ponga en numerocalificaciones
         * @param i es un contador
         * dentro del do se dice que se le asignara el valor de calificaciones a un espacio del arreglo y pasara al...
         *  siguiente
         * @param promedio va a dar el promedio de tus calificaciones
         */
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("******** Bienvenido ********");
        System.out.println("Ingresa la cantidad de calificaciones que deseas introducir:");
        int numerocalificaciones = sc.nextInt();
        System.out.printf("Se capturaran %d calificaciones", numerocalificaciones);
        System.out.println("Introduce la calificacion");
        double [] calificaciones = new double[numerocalificaciones];
        do{
            System.out.println("Introduce la calificacion");
            calificaciones[i] = sc.nextDouble();
            i++;
        }while(i < numerocalificaciones);
        double promedio = CalificacionesPromedio.promedioCalificaciones(calificaciones, numerocalificaciones);
        System.out.printf("Tu promedio es de: %.2f",promedio);
    }
}
