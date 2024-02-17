package edu.emiliano_anaya.reto4.process;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Se declara el arraylist, el precio fijo de venta, el scanner, el nombredepasajero y la cantidad de pasajeros
 */
public class BoletosAutobuses {
    static ArrayList<BoletosAutobuses> listaVentas = new ArrayList<>();
    static double precioBoleto = 1250.50;
    static Scanner scanner = new Scanner(System.in);
    private String nombrePasajero;
    private int cantidadpasajeros;

    /**
     *
     * @param nombrePasajero se les asigna a ala variable cantidadPasajeros
     * @param cantidadboletos se le asigna a la Variable a la cantidadpasajeros
     */
    public BoletosAutobuses(String nombrePasajero, int cantidadboletos) {
        this.nombrePasajero = nombrePasajero;
        this.cantidadpasajeros = cantidadboletos;
    }

    /**
     *
     * @return regresa el nombre escrito del pasajero
     */
    public String getNombrePasajero() {
        return nombrePasajero;
    }

    /**
     *
     * @return regresa la cantidad de pasajeros rejistrados
     */
    public int getCantidadBoletos() {
        return cantidadpasajeros;
    }

    /**
     *Este método solicita al usuario el nombre del comprador y la cantidad de boletos que desea comprar.
     *Luego, registra la venta asociada a ese comprador, solicitando los nombres de los pasajeros adicionales si los hay.
     *Finalmente, invoca el método registrarVenta() del objeto BoletosAutobuses para completar la operación.
     *
     *@return Un mensaje indicando que la operación se ha completado.
     **/
    public static String cantBoletos() {
        System.out.println("Ingrese el nombre del comprador: ");
        String nombrecomprador = scanner.next();
        System.out.print("Ingrese cantidad de boletos: ");
        Scanner scanner = new Scanner(System.in);
        int cantidadBoletos = scanner.nextInt();
        scanner.nextLine();

        String[] nombresPasajerosAdicionales = new String[cantidadBoletos - 1];
        if (cantidadBoletos > 1) {
            System.out.println("Ingrese nombre completo de los pasajeros adicionales:");
            for (int i = 0; i < cantidadBoletos - 1; i++) {
                System.out.print("Pasajero " + (i + 1) + ": ");
                nombresPasajerosAdicionales[i] = scanner.nextLine();
            }
        }
        BoletosAutobuses.registrarVenta(nombrecomprador, cantidadBoletos, nombresPasajerosAdicionales);
        return "Operación completada";
    }
    /**
     * Este método registra la venta de boletos, asociando el nombre del comprador, la cantidad de boletos
     * y los nombres de los pasajeros adicionales (si los hay) con un objeto BoletosAutobuses, que luego se agrega
     * a la lista de ventas. También muestra un ticket de venta con los detalles de la transacción.
     *
     * @param nombreComprador El nombre completo del comprador.
     * @param cantidadBoletos La cantidad de boletos comprados.
     * @param nombresPasajerosAdicionales Un arreglo que contiene los nombres completos de los pasajeros adicionales.
     */
    public static void registrarVenta(String nombreComprador, int cantidadBoletos, String[] nombresPasajerosAdicionales) {
        BoletosAutobuses boleto = new BoletosAutobuses(nombreComprador, cantidadBoletos);
        listaVentas.add(boleto);
        System.out.println("Venta de boleto realizada con éxito.");

        // Desplegar ticket de venta
        System.out.println("\nTicket de Venta:");
        System.out.println("Nombre del comprador: " + nombreComprador);
        System.out.println("Cantidad de boletos: " + cantidadBoletos);
        if (cantidadBoletos > 1) {
            System.out.println("Nombres de pasajeros adicionales:");
            for (int i = 0; i < cantidadBoletos - 1; i++) {
                System.out.println("- " + nombresPasajerosAdicionales[i]);
            }
        }
        System.out.println("Importe total: " + (precioBoleto * cantidadBoletos) + " MXN");
    }
    /**
     * Este método muestra los datos de la lista de ventas, incluyendo la lista de pasajeros registrados,
     * el importe total de la lista de boletos y la cantidad total de pasajeros registrados.
     * Si no hay ventas registradas, imprime un mensaje indicando que no hay ventas.
     */
    public static void mostrarResultado() {
        System.out.println("Datos de la lista de ventas:");
        if (listaVentas.isEmpty()) {
            System.out.println("No hay ventas registradas.");
        } else {
            int totalBoletos = 0;
            double totalVenta = 0.0;
            System.out.println("Lista de pasajeros registrados:");
            for (BoletosAutobuses b : listaVentas) {
                System.out.println("- " + b.getNombrePasajero());
                totalBoletos += b.getCantidadBoletos();
                totalVenta += precioBoleto * b.getCantidadBoletos();
            }
            System.out.println("Importe total de la lista de boletos: " + totalVenta + " MXN");
            System.out.println("Cantidad total de pasajeros registrados: " + totalBoletos);
        }
    }
}
