import java.util.Scanner;
/**
 * Indica cual es el porcentaje descontado, con una operacion entre el precio tarifa y el precio pagado.
 * @version 1.0
 * @author SarayGRuzo
 */
public class Boletin2_1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Introduce el precio de tarifa: ");
        double precioTarifa = scanner.nextDouble();

        System.out.println("Introduce el precio pagado: ");
        double precioPagado = scanner.nextDouble();

        double descuento = ((precioTarifa - precioPagado) / precioTarifa) * 100;
        System.out.println("El porcentaje descontado es: " + descuento + "%");

        scanner.close();
    }

}
