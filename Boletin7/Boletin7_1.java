
/**
 * Programa que cree un array con6num aleatorios (1-50) y visualiza el array al revés.
 * @version 1.0
 * @author SarayGRuzo
 */

public class Boletin7_1 {
    public static void main(String[] args) {
        int[] numeros = new int[6];

        System.out.println("Números aleatorios: ");
        for (int i = 0; i <numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 50) + 1;
            System.out.print(numeros[i] + " ");
        }

        System.out.println (" ");
        System.out.println ("Números al revés: ");
        for (int i = numeros.length - 1; i>= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}

