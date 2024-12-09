import java.util.Scanner;
/**
 * Suma los numeros indicados segun las monedas y los billetes, para calcular el total de euros.
 * @version 1.0
 * @author SarayGRuzo
 */
public class Boletin2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de billetes de 100 €: ");
        int billetes100 = scanner.nextInt();

        System.out.print("Introduce el número de billetes de 20 €: ");
        int billetes20 = scanner.nextInt();

        System.out.print("Introduce el número de billetes de 5 €: ");
        int billetes5 = scanner.nextInt();

        System.out.print("Introduce el número de monedas de 1 €: ");
        int monedas1 = scanner.nextInt();

        double totalEuros = (billetes100 * 100) + (billetes20 * 20) + (billetes5 * 5) + (monedas1 * 1);


        System.out.println("El total en euros es: " + totalEuros + " €");

        scanner.close();
    }
}
