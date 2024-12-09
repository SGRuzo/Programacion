/**
 * Realiza una resta si los numeros introducidos respetan la condicion de >=, de igual manera realiza una suma.
 * @version 1.0
 * @author SarayGRuzo
 */
public class Boletin3_2 {
    public static void main (String[] args) {
        short numero1 = 10;
        short numero2 = 5;

        if (numero1 >= numero2) {
            System.out.println("A resta é " + (numero1 - numero2));
        }
        System.out.println ("A suma é " + (numero1 + numero2));
    }

}
