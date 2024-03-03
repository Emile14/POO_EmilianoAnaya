package edu.emiliano_anaya.Evidencia1.ui;

import edu.emiliano_anaya.Evidencia1.data.Medicamentos;
import edu.emiliano_anaya.Evidencia1.process.ControlDeMedicamentos;

import java.util.Scanner;

/**
 * Esta clase proporciona la interfaz de línea de comandos (CLI) para interactuar con el sistema de gestión de medicamentos.
 */
public class Cli {
    private static final String USUARIO = "admin";
    private static final String CONTRASEÑA = "12345";

    /**
     * Método principal para iniciar la aplicación de gestión de medicamentos.
     * Se solicita al usuario que ingrese un usuario y contraseña para acceder al sistema.
     * Una vez autenticado, permite al usuario registrar nuevos medicamentos en el sistema y generar un reporte.
     */
    public static void launchApp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese usuario:");
        String usuario = scanner.nextLine();
        System.out.println("Ingrese contraseña:");
        String contraseña = scanner.nextLine();

        if (usuario.equals(USUARIO) && contraseña.equals(CONTRASEÑA)) {
            ControlDeMedicamentos control = new ControlDeMedicamentos();
            boolean continuar = true;
            while (continuar) {
                System.out.println("Ingrese nombre químico del medicamento (o 'salir' para salir del registro):");
                String nombreQuimico = scanner.next();
                if (nombreQuimico.equalsIgnoreCase("salir")) {
                    continuar = false;
                } else {
                    System.out.println("Ingrese nombre genérico:");
                    String nombreGenerico = scanner.nextLine();
                    System.out.println("Ingrese nombre registrado:");
                    String nombreRegistrado = scanner.nextLine();
                    System.out.println("Ingrese precio al público:");
                    double precioPublico = Double.parseDouble(scanner.nextLine());
                    System.out.println("Ingrese forma farmacéutica (solido, semisolido, liquido):");
                    String formaFarmaceutica = scanner.nextLine();
                    Medicamentos medicamento = new Medicamentos(nombreQuimico, nombreGenerico, nombreRegistrado, precioPublico, 0, formaFarmaceutica);
                    control.agregarMedicamento(medicamento);
                }
            }
            control.generarReporte();
        } else {
            System.out.println("Usuario o contraseña incorrectos. Saliendo del programa.");
        }
    }
}
