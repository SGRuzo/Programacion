import java.util.Scanner;
/**
 * Programa con una función que recibe dos elementos (tabla y valor)
 * Busca en la tabla si existe el valor, si existe devuelve el indice, sino -1.
 * @version 1.0
 * @author SarayGRuzo
 */

public class Boletin7_6 {

    public static void main(String[] args) {
        // Tabla con los valores ordenados
        int[] tabla = {3, 8, 15, 23, 42, 46, 56, 57, 64, 78};

        // Creamos el objeto Scanner
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario que introduzca el valor que quiere buscar
        System.out.println("Introduce un número para buscar en la tabla: ");
        int valor = sc.nextInt(); // Leemos el numero

        // Llamamos a la funcion buscarValor para realizar la busqueda binaria
        int resultado = buscarValor(tabla, valor);

        // Mostramos el resultado
        if (resultado != -1) {
            // Si la funcion devuelve un indice válido, el valor fue encontrado
            System.out.println("El valor " + valor + " se encuentra en el índice " + resultado);
        } else {
            // Si la función devolvió -1, el valor no está en la tabla
            System.out.println("El valor " + valor + " no se encuentra en la tabla.");
        }
    }

    /**
     * Busqueda binaria en un array ordenado para encontrar un valor.
     *
     * @param tabla Array de enteros ordenados donde se busca.
     * @param valor Valor que queremos buscar en el array.
     * @return El índice del valor si se encuentra; -1 si no está en el array.
     */
    public static int buscarValor(int[] tabla, int valor) {
        // Variables que delimitan el rango de búsqueda:
        int inicio = 0;               // Índice inicial (al comienzo de la tabla)
        int fin = tabla.length - 1;   // Índice final (último elemento de la tabla)

        // Mientras haya un rango válido en la búsqueda
        while (inicio <= fin) {
            // Calcular el índice del elemento central del rango actual
            int mitad = (inicio + fin) / 2;

            // Verificamos si el valor buscado es el elemento en la posición 'mitad'
            if (tabla[mitad] == valor) {
                return mitad; // Se encontró el valor, devolvemos su índice
            }

            // Si el valor buscado es menor que el elemento en 'mitad':
            if (tabla[mitad] > valor) {
                // Ajustar el rango de búsqueda para descartar la mitad derecha
                fin = mitad - 1;
            }
            // Si el valor buscado es mayor que el elemento en 'mitad':
            else {
                // Ajustar el rango de búsqueda para descartar la mitad izquierda
                inicio = mitad + 1;
            }
        }

        // Si el bucle termina sin encontrar el valor, devolver -1
        return -1;
    }
}
