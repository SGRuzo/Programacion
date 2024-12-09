//Importamos la clase Scanner
import java.util.Scanner;
/**
 * Calcula los numeros negativos, positivos y ceros de una lista de numeros enteros.
 * @version 1.0
 * @author SarayGRuzo
 */
public class Boletin5_1 {
    public static void main (String[] args) {
        //Creamos objeto Scanner
        Scanner scanner = new Scanner(System.in);

        int negativos = 0; //Comenzamos el contador de numeros negativos con 0.
        int positivos = 0; //Comenzamos el contador de numeros positivos con 0.
        int ceros = 0; //Comenzamos el contador de ceros con 0.


        //Bucle for, Colicita 10 numeros repitiendo la formula 10veces separadas.
        for (int i=1; i<=10; i++) {
            System.out.println("Introduce el número" + i + ": ");
            int numero = scanner.nextInt();

            if(numero < 0) {    //Si el número es menor que 0
                negativos++;    //sumamos 1 al contador de numeros negativos.
            } else if (numero > 0) {    //Si el número es mayor que 0
                positivos++;            //Sumamos 1 al contador de numeros positivos.
            } else {        //Si no se da lo anterior
                ceros++;    //Sumamos 1 al contador de ceros.
            }
        }

        //Imprimimos el resultado.
        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);
        System.out.println("Ceros: " + ceros);

        //Cerramos el Scanner
        scanner.close();
    }
}
