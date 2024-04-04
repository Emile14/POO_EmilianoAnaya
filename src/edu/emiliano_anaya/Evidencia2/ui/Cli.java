package edu.emiliano_anaya.Evidencia2.ui;

import edu.emiliano_anaya.Evidencia2.process.*;

import java.util.Scanner;

public class Cli {
    private static final Scanner sc = new Scanner(System.in);
    private static Idioma idiomas = new Esp();

    /**
     * menu de seleccion de idioma
     */
    public  static void ShowMenuTextos(){
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
    public static void LaunchApp(){
        ShowMenuTextos();
        while (true) {
            String nombreUsuario = "admin";
            String contra = "12345";
            System.out.println(idiomas.INICIAR_SESION);
            System.out.println(idiomas.USUARIO);
            String user = sc.next();
            System.out.println(idiomas.CONTRASENA);
            String contrasena = sc.next();
            if (user.equals(nombreUsuario) && contrasena.equals(contra)) {
                showOptions();
            } else {
                System.out.println(idiomas.ERROR);
            }
        }
    }
    public static void showOptions() {
        System.out.println(idiomas.BIENVENIDA);
        calculateTotalCost();
    }

    public static void calculateTotalCost() {
        int playMusica = getRandomNumber(10);
        int playPelicula = getRandomNumber(10);
        int readLibro = getRandomNumber(10);
        int playVideojuego = getRandomNumber(10);

        Producto[] productos = {
                new Musica("Musica 1", "Musica", 0.5, "Pop", false),
                new Peliculas("Pelicula 1", "Pelicula", 7, "Accion", false),
                new Libros("Libro 1", "libro", 5, "Novela", false),
                new Videojuegos("Juego 1", "Videojuego", 10, "Accion", false)
        };
        double totalCost = 0;
        for (Producto producto : productos) {
            totalCost += producto.CalcularCosto();
        }
        while (true) {
            System.out.println(idiomas.COSTO + totalCost);
            System.out.println(idiomas.SALIR);
            int salir = sc.nextInt();
            if (salir == 0) {
                System.exit(0);
            } else {
                System.out.println(idiomas.ERROR);
            }
        }
    }
    public static int getRandomNumber(int bound){
        return (int) (Math.random() *bound);
    }

}
