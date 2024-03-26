package edu.emiliano_anaya.reto8;

import edu.emiliano_anaya.reto8.ui.Cli;

public class Main {
    public static void main(String[] args) {
        try {
            Cli.launchApp();
        }catch (Exception e){
            System.out.println("Error");
        }
    }
}
