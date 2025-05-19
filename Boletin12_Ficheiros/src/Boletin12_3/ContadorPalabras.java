package Boletin12_3;

import java.io.*;
import java.util.*;

public class ContadorPalabras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. Pedimos o nome do ficheiro ao usuario
        System.out.print("Introduce o nome do ficheiro .txt (ex: texto.txt): ");
        String nomeFicheiro = sc.nextLine();

        //2. Creamos un mapa para gardar as palabras e a súa frecuencia
        Map<String, Integer> frecuenciaPalabras = new HashMap<>();

        //3. Lemos o contido do ficheiro
        try (BufferedReader br = new BufferedReader(new FileReader(nomeFicheiro))) {
            String liña;

            while ((liña = br.readLine()) != null) {
                //4. Eliminamos signos de puntuación e pasamos a minúsculas
                liña = liña.replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚñÑüÜ\\s]", "").toLowerCase();

                //5. Dividimos a liña en palabras separadas por espazos
                String[] palabras = liña.split("\\s+");

                //6. Contamos cantas veces aparece cada palabra
                for (String palabra : palabras) {
                    if (!palabra.isEmpty()) { // evitamos palabras vacías
                        frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
                    }
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("O ficheiro non se atopou.");
            return;
        } catch (IOException e) {
            System.err.println("Erro ao ler o ficheiro: " + e.getMessage());
            return;
        }

        //7. Mostramos os resultados por pantalla
        System.out.println("\n--- FRECUENCIA DE PALABRAS ---");
        for (Map.Entry<String, Integer> entrada : frecuenciaPalabras.entrySet()) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue());
        }

        // 8. Gardamos os resultados nun novo ficheiro resumo_palabras.txt
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("resumo_palabras.txt"))) {
            for (Map.Entry<String, Integer> entrada : frecuenciaPalabras.entrySet()) {
                bw.write(entrada.getKey() + ": " + entrada.getValue());
                bw.newLine();
            }
            System.out.println("\nResumo gardado en resumo_palabras.txt");
        } catch (IOException e) {
            System.err.println("Erro ao gardar o resumo: " + e.getMessage());
        }

        sc.close();
    }
}