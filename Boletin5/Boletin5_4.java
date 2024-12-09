//Importamos Scanner
import java.util.Scanner;
/**
 * Programa  que visualice la tabla de multiplicar de un número que proporcione el usuario. Que acabe el programa cuando se seleccione el 0.
 * @version 1.0
 * @author SarayGRuzo
 */
public class Boletin5_4 {
    public static void main (String[] args){
        //Creamos un objeto Scanner.
        Scanner scanner = new Scanner(System.in);

        //Declaramos la variable del número que introduce el usuario.
        int numero;

        do{
            //Pedimos al usuario un número.
            System.out.println("Introduce un número para ver su tabla de multiplicar (pulsa 0 para salir): ");
            //Guardamos el número ingresado.
            numero = scanner.nextInt();

            //Si el número es 0 el programa acaba.
            if (numero == 0) {
                System.out.println("Has salido del programa.");
                break;
            }
            //Si el número no es 0, comenzamos a mostrar la tabla de multiplicar del número introducido.
            System.out.println("Tabla del" + numero + ": ");
            //Calculamos la tabla de multiplicar desde 1 hasta 10.
            for (int i = 1; i <= 10; i++) {
                //Calculamos cada multiplicacion.
                int resultado = numero * i;
                //Mostramos el resultado de toda la tabla.
                System.out.println(numero + "x" + i + "= " + resultado);
            }

        } while (true); //El bucle se hace infinito hasta que el usuariro pulse 0.
        //Cerramos scanner.
        scanner.close();
    }
}
