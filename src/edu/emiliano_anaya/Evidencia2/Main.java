package edu.emiliano_anaya.Evidencia2;

import edu.emiliano_anaya.Evidencia2.ui.Cli;

public class Main {
    public static void main(String[] args) {
        try {
            Cli.LaunchApp();
        }catch (Exception e){
            System.out.println("Error");
        }
    }
}
