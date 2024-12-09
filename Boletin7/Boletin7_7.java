/**
 * Codificar unha función que faga unha copia dunha matríz, pasada como parámetro, e devolte a copia da matríz.
 * @version 1.0
 * @author SarayGRuzo
 */
public class Boletin7_7 {

    public static void main(String[] args) {
        // Creamos un array original con valores iniciales
        int[] matrizOriginal = {1, 2, 3, 4, 5};

        // Mostramos el contenido de la matriz original
        System.out.println("Matriz original:");
        for (int elemento : matrizOriginal) {
            System.out.print(elemento + " ");
        }
        System.out.println();

        // Llamamos a la función para copiar la matriz
        int[] matrizCopia = copiarMatriz(matrizOriginal);

        // Mostramos el contenido de la matriz copiada
        System.out.println("Matriz copiada:");
        for (int elemento : matrizCopia) {
            System.out.print(elemento + " ");
        }
        System.out.println();

        // Comprobamos si las matrices son diferentes (en memoria)
        if (matrizOriginal == matrizCopia) {
            System.out.println("Las matrices son la misma instancia.");
        } else {
            System.out.println("Las matrices son diferentes instancias.");
        }
    }

    /**
     * Función que realiza una copia de una matriz unidimensional.
     *
     * @param matrizOriginal La matriz a copiar.
     * @return Una nueva matriz con los mismos elementos que la original.
     */
    public static int[] copiarMatriz(int[] matrizOriginal) {
        // Creamos un nuevo array con el mismo tamaño que el original
        int[] matrizCopia = new int[matrizOriginal.length];

        // Usamos un bucle para copiar cada elemento
        for (int i = 0; i < matrizOriginal.length; i++) {
            matrizCopia[i] = matrizOriginal[i]; // Copiamos elemento por elemento
        }

        // Devolvemos la matriz copiada
        return matrizCopia;
    }
}
