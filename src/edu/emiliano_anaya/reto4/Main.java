package edu.emiliano_anaya.reto4;

import edu.emiliano_anaya.reto4.ui.CLI;

public class Main {
    public static void main(String[] args) {
        try {
            CLI.launchAPP();
        }catch (Exception e){
            System.out.println("Error");
        }
    }
}
