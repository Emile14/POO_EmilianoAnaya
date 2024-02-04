package edu.emiliano_anaya.reto2.cajas;

import edu.emiliano_anaya.reto2.cajas.ui.CLI;

public class Main {
    public static void main(String[] args) {
        try {
            CLI.launchAPP();
        }catch (Exception e){
            System.out.println("Error");
        }
    }
}
