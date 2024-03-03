package edu.emiliano_anaya.Evidencia1.process;

import edu.emiliano_anaya.Evidencia1.data.Medicamentos;

import java.util.ArrayList;
import java.util.Date;

/**
 * Esta clase gestiona el control de los medicamentos, incluyendo su almacenamiento y generación de reportes.
 */
public class ControlDeMedicamentos {
    private ArrayList<Medicamentos> catalogo;

    /**
     * Constructor de la clase ControlDeMedicamentos.
     * Inicializa el catálogo de medicamentos como un nuevo ArrayList vacío.
     */
    public ControlDeMedicamentos() {
        this.catalogo = new ArrayList<>();
    }

    /**
     * Agrega un nuevo medicamento al catálogo.
     * @param medicamento El medicamento a agregar.
     */
    public void agregarMedicamento(Medicamentos medicamento) {
        catalogo.add(medicamento);
    }

    /**
     * Genera un reporte con la lista de medicamentos almacenados en el catálogo.
     * El reporte incluye la fecha de generación, la cantidad de productos en la lista
     * y un desglose de cada medicamento con sus detalles.
     */
    public void generarReporte() {
        System.out.println("Reporte de Medicamentos");
        System.out.println("Fecha de generación: " + new Date());
        System.out.println("Cantidad de productos en la lista: " + catalogo.size());
        for (int i = 0; i < catalogo.size(); i++) {
            System.out.println("Medicamento #" + (i + 1));
            System.out.println(catalogo.get(i));
            System.out.println("------------------------");
        }
    }

    /**
     * Obtiene el catálogo de medicamentos.
     * @return El catálogo de medicamentos.
     */
    public ArrayList<Medicamentos> getCatalogo() {
        return catalogo;
    }
}
