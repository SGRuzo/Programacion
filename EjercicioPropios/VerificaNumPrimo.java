
import java.util.Scanner;

public class VerificaNumPrimo {

    // Función que verifica si un número es primo
    public static boolean esPrimo(int numero) {
        // Los números menores o iguales a 1 no son primos
        if (numero <= 1) {
            return false;
        }

        // Comprobamos si el número es divisible por algún número entre 2 y la raíz cuadrada de 'numero'
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;  // Si es divisible, no es primo
            }
        }

        return true;  // Si no es divisible por ningún número, es primo
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese un número
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        // Llamamos a la función y mostramos el resultado
        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }

        scanner.close();
    }
}
