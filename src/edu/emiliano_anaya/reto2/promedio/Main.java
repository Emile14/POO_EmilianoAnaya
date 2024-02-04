package edu.emiliano_anaya.reto2.promedio;

import edu.emiliano_anaya.reto2.promedio.ui.CLI;

public class Main {
    public static void main(String[] args) {
        try {
            CLI.LaunchApp();
        }catch (Exception e){
            System.out.println("Error");
        }
    }
}
