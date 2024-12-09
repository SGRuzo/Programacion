/**
 * Indica si el numero introducido es positivo, negativo o igual a 0.
 * @version 1.0
 * @author SarayGRuzo
 */
public class Boletin3_3 {
    public static void main (String[] args) {
        int numero = +5;

        if (numero>0) {
            System.out.println("+");
        } else if (numero < 0) {
            System.out.println("-");
        } else {
            System.out.println("0");
        }
    }

}
