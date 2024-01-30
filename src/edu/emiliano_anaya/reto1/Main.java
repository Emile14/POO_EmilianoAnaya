package edu.emiliano_anaya.reto1;

import edu.emiliano_anaya.reto1.ui.CLI;

public class Main {
    public static void main(String[] args) {
        try {
            CLI.LaunchAPP();
        }catch (Exception e){
            System.out.println("Error");
        }
    }
}
