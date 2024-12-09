//Importamos Scanner.
import java.util.Scanner;
/**
 * Calcula el área de un rectángulo según los datos que proporciona el usuario.
 * @version 1.0
 * @author SarayGRuzo
 */
public class Boletin5_3 {
    public static void main (String[] args) {
        //Creamos objeto scanner.
        Scanner scanner = new Scanner(System.in);
        //Declaramos las variables de base y altura.
        double base, altura;

        do{
            //Se pide al usuario que inroduzca el valor de la base del rectángulo.
            System.out.println("Introduce la base del rectángulo (procura que el valor aportado sea positivo: ");
            base = scanner.nextDouble();
            //Comprobamos si el valor aportado es positivo.
            if (base <= 0) {
                //Al comprobar que es negativo avisamos al usuario.
                System.out.println("El valor aportado no es positivo");
            }
        } while (base <= 0);

        do {
            //Se pide al usuario que reproduzca el valor de la altura del rectángulo;
            System.out.println("Introduce la altua del rectángulo (procura que el valor aportado sea positivo: ");
            altura = scanner.nextDouble();
            //Comprobamos si el valor aportado es ositivo.
            if (altura <= 0) {
                //Al comprobar que es negativo avisamos al usuario.
                System.out.println("El valor aportado no es positivo");
            }
        } while (altura <= 0);

        //Calculamos el área del rectángulo con la fórmula área=base*altura.
        double area = base + altura;
        //Imprimirmos el resultado de la área.
        System.out.println("El área del rectángulo es: " + area);
        //Cerramos el objeto Scanner.
        scanner.close();

    }
}
