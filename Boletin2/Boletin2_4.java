import java.util.Scanner;
/**
 * Separa los billetes y monedas segun su valor, con el total de euros.
 * @version 1.0
 * @author SarayGRuzo
 */
public class Boletin2_4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad en euros: ");
        int cantidad = scanner.nextInt();

        int billetes100 = cantidad / 100;
        cantidad %= 100;

        int billetes20 = cantidad / 20;
        cantidad %= 20;

        int billetes5 = cantidad / 5;
        cantidad %= 5;

        int monedas1 = cantidad;

        System.out.println("Desglose:");
        System.out.println("Billetes de 100 €: " + billetes100);
        System.out.println("Billetes de 20 €: " + billetes20);
        System.out.println("Billetes de 5 €: " + billetes5);
        System.out.println("Monedas de 1 €: " + monedas1);

        scanner.close();
    }
}
