import java.util.Scanner;
/**
 * Programa que muestre el numero de aprobados y suspenso,
 * calcula la media de la clase y muestre la nota más alta.
 * @version 1.0
 * @author SarayGRuzo
 */

public class Boletin7_3 {
    public static void main(String[] args) {

        String[] nombres = new String[30];
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = "Alumno " + (i + 1);
        }

        int[] notas = new int[30];

        for (int i = 0; i < notas.length; i++) {
            notas[i] = (int) (Math.random() * 11);
            System.out.print(notas[i] + " ");
        }

        System.out.println("Lista de alumnos y sus notas:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + ": " + notas[i]);
        }

        int aprobados = 0;
        int suspensos = 0;
        int sumaNotas = 0;
        int notaMaxima = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
            sumaNotas += notas[i];
            if (notas[i] > notaMaxima) {
                notaMaxima = notas[i];
            }
        }
        double media = sumaNotas / (double) notas.length;
        System.out.println(" ");
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suspensos: " + suspensos);
        System.out.println("Nota media de la clase: " + media);
        System.out.println("Nota más alta: " + notaMaxima);

        Scanner sc = new Scanner(System.in);
        System.out.print("\nIntroduce el nombre de un alumno para ver su nota: ");
        String alumnoBuscado = sc.nextLine();
        boolean encontrado = false;
    }
}