import java.util.Scanner;

public class FibonacciRecursiva {

    // Función recursiva que calcula el n-ésimo número de Fibonacci
    public static int fibonacci(int n) {
        // Caso base: si n es 0 o 1, el número de Fibonacci es 0 o 1
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            // Llamada recursiva: F(n) = F(n-1) + F(n-2)
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de Fibonacci que desea calcular
        System.out.print("Introduce el valor de n para calcular el n-ésimo número de Fibonacci: ");
        int n = scanner.nextInt();

        // Llamar a la función recursiva y mostrar el resultado
        int resultado = fibonacci(n);
        System.out.println("El " + n + "-ésimo número de Fibonacci es: " + resultado);
    }
}
