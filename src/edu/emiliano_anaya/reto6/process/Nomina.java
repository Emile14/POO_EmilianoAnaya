package edu.emiliano_anaya.reto6.process;

import edu.emiliano_anaya.reto6.data.Categoria;
import edu.emiliano_anaya.reto6.data.Empleado;

import java.util.ArrayList;
import java.util.Scanner;

public class Nomina {
    private ArrayList<Empleado> empleados;

    public Nomina() {
        this.empleados = new ArrayList<>();
    }

    public void capturarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de empleados a capturar:");
        int cantidadEmpleados = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        for (int i = 0; i < cantidadEmpleados; i++) {
            System.out.println("Empleado #" + (i + 1));
            System.out.print("Nombre completo: ");
            String nombreCompleto = scanner.nextLine();
            System.out.print("Horas trabajadas: ");
            int horasTrabajadas = scanner.nextInt();
            System.out.print("Horas extras trabajadas: ");
            int horasExtrasTrabajadas = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            System.out.print("Teléfono: ");
            String telefono = scanner.nextLine();
            System.out.print("Fecha de nacimiento (YYYY-MM-DD): ");
            String fechaNacimiento = scanner.nextLine();

            System.out.println("Seleccione la categoría:");
            System.out.println("1. Empleado Ventas");
            System.out.println("2. Administrador");
            System.out.println("3. Gerente");
            int opcionCategoria = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            Categoria categoria;
            switch (opcionCategoria) {
                case 1:
                    categoria = new Categoria("Empleado Ventas", "EV", 100.00, 50.00);
                    break;
                case 2:
                    categoria = new Categoria("Administrador", "ADM", 180.00, 100.00);
                    break;
                case 3:
                    categoria = new Categoria("Gerente", "GER", 250.00, 150.00);
                    break;
                default:
                    categoria = null;
            }

            Empleado empleado = new Empleado(nombreCompleto, horasTrabajadas, horasExtrasTrabajadas, telefono, fechaNacimiento, categoria);
            empleados.add(empleado);
        }
    }

    public double calcularTotalNomina() {
        double totalNomina = 0;
        for (Empleado empleado : empleados) {
            Categoria categoria = empleado.getCategoria();
            totalNomina += categoria.getSueldoBase() * empleado.getHorasTrabajadas();
            totalNomina += categoria.getPagoHoraExtra() * empleado.getHorasExtrasTrabajadas();
        }
        return totalNomina;
    }

    public double calcularTotalSueldoNormal() {
        double totalSueldoNormal = 0;
        for (Empleado empleado : empleados) {
            Categoria categoria = empleado.getCategoria();
            totalSueldoNormal += categoria.getSueldoBase() * empleado.getHorasTrabajadas();
        }
        return totalSueldoNormal;
    }

    public double calcularTotalHorasExtras() {
        double totalHorasExtras = 0;
        for (Empleado empleado : empleados) {
            Categoria categoria = empleado.getCategoria();
            totalHorasExtras += categoria.getPagoHoraExtra() * empleado.getHorasExtrasTrabajadas();
        }
        return totalHorasExtras;
    }

    public int calcularTotalHorasLaboradas() {
        int totalHorasLaboradas = 0;
        for (Empleado empleado : empleados) {
            totalHorasLaboradas += empleado.getHorasTrabajadas() + empleado.getHorasExtrasTrabajadas();
        }
        return totalHorasLaboradas;
    }

    public int calcularTotalPersonasConHorasExtras() {
        int totalPersonasConHorasExtras = 0;
        for (Empleado empleado : empleados) {
            if (empleado.getHorasExtrasTrabajadas() > 0) {
                totalPersonasConHorasExtras++;
            }
        }
        return totalPersonasConHorasExtras;
    }

    public int calcularTotalPersonasSinHorasExtras() {
        int totalPersonasSinHorasExtras = 0;
        for (Empleado empleado : empleados) {
            if (empleado.getHorasExtrasTrabajadas() == 0) {
                totalPersonasSinHorasExtras++;
            }
        }
        return totalPersonasSinHorasExtras;
    }
}
