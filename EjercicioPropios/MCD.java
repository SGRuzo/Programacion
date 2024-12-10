import java.util.Scanner; // Importa la clase Scanner para que podamos leer datos del usuario

public class MCD { // Inicia la clase principal del programa, que se llama "MCD"

    // Método para calcular el MCD. Recibe dos números (a y b) y devuelve el MCD.
    public static int calcularMCD(int a, int b) {

        // Aquí empieza el proceso de cálculo del MCD, utilizando el algoritmo de Euclides.
        while (b != 0) { // Mientras que el número b no sea 0, sigue haciendo lo siguiente:

            int temp = b; // Guarda el valor de b en una variable temporal llamada "temp"
            b = a % b; // Calcula el "resto" de dividir a entre b, y guarda ese valor en b
            a = temp; // Luego, a toma el valor de "temp", que es el valor original de b
        }
        return a; // Una vez que b es 0, el valor de a es el MCD, así que lo devolvemos
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos un "scanner" para leer la entrada del usuario

        // Pedimos al usuario que introduzca el primer número
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt(); // Leemos el primer número y lo guardamos en la variable num1

        // Pedimos al usuario que introduzca el segundo número
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt(); // Leemos el segundo número y lo guardamos en la variable num2

        // Llamamos a la función calcularMCD, que nos devolverá el MCD de los dos números
        int mcd = calcularMCD(num1, num2);

        // Mostramos el resultado en la pantalla
        System.out.println("El Máximo Común Divisor (MCD) de " + num1 + " y " + num2 + " es: " + mcd);
    }
}
