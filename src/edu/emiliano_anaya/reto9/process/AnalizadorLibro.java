package edu.emiliano_anaya.reto9.process;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.Normalizer;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class AnalizadorLibro {
    /**
     * Analiza un archivo de texto para contar las palabras más utilizadas.
     *
     * @param nombreArchivo El nombre del archivo de texto a analizar.
     */
    public static void analizar(String nombreArchivo) {
        // Mapa para almacenar las palabras y su frecuencia
        Map<String, Integer> frecuenciaPalabras = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            // Lee cada línea del archivo
            while ((linea = br.readLine()) != null) {
                // Normaliza y procesa cada línea del archivo
                linea = normalizarTexto(linea);
                // Tokeniza la línea para obtener las palabras
                StringTokenizer tokenizer = new StringTokenizer(linea);
                // Cuenta las palabras y las agrega al mapa
                while (tokenizer.hasMoreTokens()) {
                    String palabra = tokenizer.nextToken().toLowerCase();
                    // Filtra las palabras que contienen solo caracteres alfabéticos
                    if (palabra.matches("[a-záéíóúü]+")) {
                        frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Ordena y muestra las 10 palabras más utilizadas
        frecuenciaPalabras.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(10)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }

    /**
     * Normaliza un texto eliminando caracteres especiales y convirtiendo a minúsculas.
     *
     * @param texto El texto a normalizar.
     * @return El texto normalizado.
     */
    private static String normalizarTexto(String texto) {
        // Elimina acentos y caracteres especiales, convierte a minúsculas
        String textoNormalizado = Normalizer.normalize(texto, Normalizer.Form.NFD);
        textoNormalizado = textoNormalizado.replaceAll("[^\\p{ASCII}]", "");
        textoNormalizado = textoNormalizado.replaceAll("[^a-zA-Z ]", " ");
        return textoNormalizado;
    }
}
