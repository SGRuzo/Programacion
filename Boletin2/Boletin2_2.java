import java.util.Scanner;
/**
 * Calcula la temperatura Fahrenheit y Kelvin, con la temperatura Celsius.
 * @version 1.0
 * @author SarayGRuzo
 */

public class Boletin2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        double kelvin = celsius + 273.15;

        System.out.println("Temperatura en grados Fahrenheit: " + fahrenheit);
        System.out.println("Temperatura en grados Kelvin: " + kelvin);

        scanner.close();
    }

}
