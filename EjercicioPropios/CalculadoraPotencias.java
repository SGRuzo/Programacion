import java.util.Scanner;

public class CalculadoraPotencias {

    // Función que calcula la potencia
    public static double calcularPotencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la base
        System.out.print("Introduce la base: ");
        double base = scanner.nextDouble();

        // Solicitar al usuario el exponente
        System.out.print("Introduce el exponente: ");
        int exponente = scanner.nextInt();

        // Llamar a la función calcularPotencia
        double resultado = calcularPotencia(base, exponente);

        // Mostrar el resultado
        System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " + resultado);

        scanner.close();
    }
}