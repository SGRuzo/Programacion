/**
 * Calcula la suma y el producto de los numeros comprendidos entre 10 y 90.
 * @version 1.0
 * @author SarayGRuzo
 */
public class Boletin5_2 {
    public static void main (String[] args) {

        //Comienza la suma con 0.
        int suma = 0;
        //Comienza la multiplicacion a partir del 1. (porque por cero todo daría 0)
        int producto = 1;

        //El bucle comienza con 10 y continúa con 90.
        for (int i=10; i <=90; i++) {
            //Suma + i con cada caso.
            suma += i;
            //Multiplica * i en cada caso
            producto *=i;
        }
        //Imprime la solución.
        System.out.println("La suma de los números entre 10 y 90 es: " +suma);
        System.out.println("El producto de los números entre 10 y 90 es: " +producto);

    }
}
