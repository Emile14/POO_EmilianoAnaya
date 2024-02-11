package edu.emiliano_anaya.reto3.Diccionario.process;

import java.util.Arrays;

public class DiccionarioDePalabras {
    private  String[] palabras;
    private  String[] significados;

    public DiccionarioDePalabras(String[] palabras, String[] significados) {
        this.palabras = palabras;
        this.significados = significados;
    }
    private int buscarIndex(String palabra){
        int indice = 0;
        while (indice < palabras.length) {
            if(palabra.equals(palabras[indice]))
                return indice;
            indice++;
        }
        return -1;
    }

    public String darBusqueda(String palabra){
        return buscarSignificado(buscarIndex(palabra));
    }
    private String buscarSignificado(int indice){
        if(indice == -1) {
            return "Esta palabra no esta disponible";
        }
        return significados[indice];
    }

    public void imprimirArrays() {
        Arrays.stream(palabras).forEach(System.out::println);
    }
    public void contadorCaracteres(){
        Arrays.stream(palabras)
                .forEach(palabra -> {
                    int indice = Arrays.asList(palabras).indexOf(palabra);
                    String significado = significados[indice];
                    System.out.println(palabra + " - Cantidad de caracteres: " + palabra.length() +
                            ". Cantidad de caracteres del significado: " + significado.length());
                });
    }
}
