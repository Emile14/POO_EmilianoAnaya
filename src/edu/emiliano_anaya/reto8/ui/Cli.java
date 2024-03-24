package edu.emiliano_anaya.reto8.ui;

import edu.emiliano_anaya.reto8.process.*;
import edu.emiliano_anaya.reto8.process.Division;
import edu.emiliano_anaya.reto8.process.Multiplicacion;
import edu.emiliano_anaya.reto8.process.Resta;
import edu.emiliano_anaya.reto8.process.Suma;

import java.util.Scanner;

public class Cli {
    private static final Scanner sc = new Scanner(System.in);
    private static Idioma idiomas = new Esp();



    /**
     * Menu de la seleccion del idioma de la calculadora
     */
    public static void showMenuIdioma(){
        System.out.println("Selecciona el idioma del programa");
        System.out.println("1-Espanol");
        System.out.println("2-English");
        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                idiomas = new Esp();
                break;
            case 2:
                idiomas = new Eng();
                break;
            default:
                System.out.println("Opcion no disponible");
        }
    }

    /**
     * Sirve para darte y seleccionar las opciones dispopnibles de la calculadora
     */
    public static void launchApp(){
        int opcion;
        int num1, num2;
        showMenuIdioma();
        while (true){
            System.out.println(idiomas.MENU);
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println(idiomas.INGRESE_PRIMERNUM);
                    num1 = sc.nextInt();
                    System.out.println(idiomas.INGRESE_SEGUNDONUM);
                    num2 = sc.nextInt();

                    OperacionAritmetica op = new Suma();
                    Resultados(op,num1,num2);
                    break;
                case 2:
                    System.out.println(idiomas.INGRESE_PRIMERNUM);
                    num1 = sc.nextInt();
                    System.out.println(idiomas.INGRESE_SEGUNDONUM);
                    num2 = sc.nextInt();

                    op = new Resta();
                    Resultados(op, num1, num2);
                    break;
                case 3:
                    System.out.println(idiomas.INGRESE_DIVIDENDO);
                    num1 = sc.nextInt();
                    System.out.println(idiomas.INGRESE_DIVISOR);
                    num2 = sc.nextInt();

                    op = new Division();
                    Resultados(op, num1, num2);
                    break;
                case 4:
                    System.out.println(idiomas.INGRESE_MULTIPLICADOR);
                    num1 = sc.nextInt();
                    System.out.println(idiomas.INGRESE_MULTIPLICANDO);
                    num2 = sc.nextInt();

                    op = new Multiplicacion();
                    Resultados(op, num1, num2);
                    break;
                case 5:
                    System.out.println(idiomas.INGRESE_PRIMERNUM);
                    num1 = sc.nextInt();
                    System.out.println(idiomas.INGRESE_SEGUNDONUM);
                    num2 = sc.nextInt();

                    op = new Logaritmo();
                    Resultados(op, num1, num2);
                    break;
                case 6:
                    System.out.println(idiomas.INGRESE_NUMERO);
                    num1 = sc.nextInt();
                    System.out.println(idiomas.INGRESE_EXPONENTE);
                    num2 = sc.nextInt();

                    op = new Potencia();
                    Resultados(op, num1, num2);
                    break;
                case 7:
                    System.out.println(idiomas.INGRESE_PRIMERNUM);
                    num1 = sc.nextInt();
                    System.out.println(idiomas.INGRESE_EXPONENTE);
                    num2 = sc.nextInt();

                    op = new Raiz();
                    Resultados(op, num1, num2);
                    break;
                case 8:
                    System.out.println(idiomas.DESPEDIDA);
                    System.exit(0);
            }
        }
    }

    /**
     *
     * @param op La operacion de la que se da el resultado
     * @param num1 El valor proporcionado por el usuario
     * @param num2 El valor proporcionado por el usuario
     */
    public static void Resultados(OperacionAritmetica op,int num1,int num2){
        System.out.println(idiomas.EL_RESULTADO + op.getClass().getSimpleName()+ idiomas.ES + op.calcular(num1, num2));
    }
}
