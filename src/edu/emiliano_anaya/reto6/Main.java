package edu.emiliano_anaya.reto6;

import edu.emiliano_anaya.reto6.process.Nomina;

public class Main {
    public static void main(String[] args) {
        Nomina nomina = new Nomina();
        nomina.capturarDatos();

        System.out.println("Total de la nómina de la empresa: $" + nomina.calcularTotalNomina());
        System.out.println("Total a pagar por sueldo normal: $" + nomina.calcularTotalSueldoNormal());
        System.out.println("Total a pagar por horas extras: $" + nomina.calcularTotalHorasExtras());
        System.out.println("Total de horas laboradas en la empresa: " + nomina.calcularTotalHorasLaboradas());
        System.out.println("Total de personas que tienen horas extras: " + nomina.calcularTotalPersonasConHorasExtras());
        System.out.println("Total de personas que no tienen horas extras: " + nomina.calcularTotalPersonasSinHorasExtras());
    }
}
