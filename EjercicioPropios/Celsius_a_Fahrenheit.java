
import java.util.Scanner;

public class Celsius_a_Fahrenheit {

    // Función recursiva para convertir Celsius a Fahrenheit
    public static double celsiusAFahrenheit(double celsius) {
        // Caso base: si la temperatura es 0, ya está convertida
        if (celsius == 0) {
            return 32;  // La temperatura en Celsius 0 es igual a 32 en Fahrenheit
        } else {
            // Recursivamente sumamos la temperatura en Fahrenheit (F = (C * 9/5) + 32)
            double fahrenheit = (celsius * 9 / 5) + 32;
            return fahrenheit; // Devolvemos el valor convertido
        }
    }

    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese la temperatura en grados Celsius
        System.out.print("Introduce la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        // Llamamos a la función recursiva para convertir Celsius a Fahrenheit
        double fahrenheit = celsiusAFahrenheit(celsius);

        // Mostramos el resultado de la conversión
        System.out.println(celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit.");

        // Cerramos el objeto Scanner
        scanner.close();
    }
}

