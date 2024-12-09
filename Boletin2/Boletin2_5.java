/**
 * .
 * @version 1.0
 * @author SarayGRuzo
 */

import java.util.Scanner;
public class Boletin2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el sueldo fijo: ");
        double sueldoFijo = scanner.nextDouble();

        System.out.print("Introduce el importe total de ventas: ");
        double ventas = scanner.nextDouble();

        System.out.print("Introduce los kilómetros recorridos: ");
        double km = scanner.nextDouble();

        System.out.print("Introduce los días de desplazamiento: ");
        int dias = scanner.nextInt();

        double comision = (5.0 / 100) * ventas;
        double kilometraje = 2 * km;
        double dietas = 30 * dias;

        double sueldoBruto = sueldoFijo + comision + kilometraje + dietas;
        double irpf = 0.18 * sueldoBruto;
        double sueldoLiquido = sueldoBruto - irpf - 36;

        System.out.println("Sueldo bruto: " + sueldoBruto + " €");
        System.out.println("Sueldo líquido: " + sueldoLiquido + " €");

        scanner.close();
    }
}

