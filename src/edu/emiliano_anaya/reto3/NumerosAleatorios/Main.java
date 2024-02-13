package edu.emiliano_anaya.reto3.NumerosAleatorios;

import edu.emiliano_anaya.reto3.NumerosAleatorios.process.Matrices;
import edu.emiliano_anaya.reto3.NumerosAleatorios.ui.CLI;

public class Main {
    public static void main(String[] args) {
        /**
         * crea una instancia del CLI
         */
        CLI ui=new CLI();
        /**
         * crea una instancia de las operaciones de la matriz
         */
        Matrices operaciones = new Matrices();
        /**
         * obtiene la entrada del usuario y ejecuta las operaciones
         */
        ui.getInputAndExecute(operaciones);

    }
}
