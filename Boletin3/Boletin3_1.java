import java.util.Scanner;
/**
 * Indica si el numero introducido es positivo
 * @version 1.0
 * @author SarayGRuzo
 */
public class Boletin3_1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Introduce un numero: ");
        int numero = scanner.nextInt();
        if (numero > 0) {
            System.out.println(numero + " é positivo");
        }
    }

}
