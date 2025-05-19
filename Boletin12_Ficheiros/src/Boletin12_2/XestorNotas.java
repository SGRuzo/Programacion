package Boletin12_2;

import java.io.*;
import java.util.*;

public class XestorNotas {

    // Fichero onde se gardarán as notas (texto plano)
    private static final String RUTA_NOTAS = "notas.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        // Bucle principal do programa co menú
        do {
            System.out.println("--- MENÚ XESTOR DE NOTAS ---");
            System.out.println("1. Engadir nova nota");
            System.out.println("2. Listar todas as notas");
            System.out.println("3. Buscar notas por palabra clave");
            System.out.println("0. Saír");
            System.out.print("Escolle unha opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // Limpiamos o buffer despois de ler un número

            switch (opcion) {
                case 1:
                    engadirNota(sc);
                    break;
                case 2:
                    listarNotas();
                    break;
                case 3:
                    buscarNotas(sc);
                    break;
                case 0:
                    System.out.println("Ata logo!");
                    break;
                default:
                    System.out.println("Opción non válida.");
            }

        } while (opcion != 0);

        sc.close();
    }

    // Metodo para engadir unha nova nota ao ficheiro
    private static void engadirNota(Scanner sc) {
        System.out.print("Escribe a nota que queres gardar: ");
        String nota = sc.nextLine();

        // Engadimos a nota ao final do ficheiro
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA_NOTAS, true))) {
            bw.write(nota);       // Escribimos a nota
            bw.newLine();         // Saltamos á seguinte liña
            System.out.println("Nota gardada correctamente.");
        } catch (IOException e) {
            System.err.println("Erro ao gardar a nota: " + e.getMessage());
        }
    }

    // Metodo para listar todas as notas gardadas no ficheiro
    private static void listarNotas() {
        File ficheiro = new File(RUTA_NOTAS);

        // Se o ficheiro non existe aínda, informamos ao usuario
        if (!ficheiro.exists()) {
            System.out.println("Non hai notas gardadas.");
            return;
        }

        System.out.println("\n--- LISTA DE NOTAS ---");
        try (BufferedReader br = new BufferedReader(new FileReader(ficheiro))) {
            String liña;
            int numero = 1;

            // Lemos cada liña do ficheiro (unha nota por liña)
            while ((liña = br.readLine()) != null) {
                System.out.println(numero + ". " + liña);
                numero++;
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o ficheiro: " + e.getMessage());
        }
    }

    // Metodo para buscar notas que conteñan unha palabra clave
    private static void buscarNotas(Scanner sc) {
        System.out.print("Introduce a palabra clave para buscar: ");
        String clave = sc.nextLine().toLowerCase(); // Convertimos a minúsculas para busca insensible

        File ficheiro = new File(RUTA_NOTAS);

        // Se non existe o ficheiro, non hai notas que buscar
        if (!ficheiro.exists()) {
            System.out.println("Non hai notas gardadas.");
            return;
        }

        boolean atopada = false;
        System.out.println("\n--- RESULTADOS DA BUSCA ---");
        try (BufferedReader br = new BufferedReader(new FileReader(ficheiro))) {
            String liña;
            int numero = 1;

            while ((liña = br.readLine()) != null) {
                // Comprobamos se a liña contén a palabra clave
                if (liña.toLowerCase().contains(clave)) {
                    System.out.println(numero + ". " + liña);
                    atopada = true;
                }
                numero++;
            }

            if (!atopada) {
                System.out.println("Non se atoparon notas coa palabra indicada.");
            }

        } catch (IOException e) {
            System.err.println("Erro ao ler o ficheiro: " + e.getMessage());
        }
    }
}
