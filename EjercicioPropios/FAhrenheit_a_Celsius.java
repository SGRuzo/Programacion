import java.util.Scanner;

public class FAhrenheit_a_Celsius {

    // Función recursiva para convertir Celsius a Fahrenheit
    public static double convertirCelsiusAFahrenheit(double celsius, double incremento) {
        // Caso base: cuando el incremento llega a 0, hemos terminado la conversión
        if (incremento == 0) {
            return celsius * 9 / 5 + 32; // Fórmula de conversión Celsius a Fahrenheit
        }

        // Llamada recursiva: Continuamos la operación hasta llegar al caso base
        return convertirCelsiusAFahrenheit(celsius, incremento - 1);
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una temperatura en grados Celsius
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        // Usar la función recursiva para convertir la temperatura
        // El segundo parámetro es un valor arbitrario para iniciar la recursión
        double fahrenheit = convertirCelsiusAFahrenheit(celsius, 1);

        // Mostrar el resultado
        System.out.println(celsius + " grados Celsius es igual a " + fahrenheit + " grados Fahrenheit.");

        // Cerrar el scanner
        scanner.close();
    }
}
