package edu.emiliano_anaya.reto3.Diccionario;

import edu.emiliano_anaya.reto3.Diccionario.process.DiccionarioDePalabras;
import edu.emiliano_anaya.reto3.Diccionario.ui.CLI;

public class Main {
    public static void main(String[] args) {
        String[] palabras = {"Mar", "Payaso", "Marihuana", "Blanca", "Privilegio", "Circunferencia",
                "Tequila", "Rebote", "Prejuicio", "Chaqueta"};
        String[] significados = {"agua salada", "alguien muy gracioso", "una planta magica", "una persona privilegiada",
                "una persona blanca", "bebida alcoholisante", "algo redodondo", "lo que hace un resorte",
                "juzgar a alguien", "algo que usas para el frio"};
        DiccionarioDePalabras diccionario = new DiccionarioDePalabras(palabras, significados);
        try{
            CLI.launchApp(diccionario);
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}
