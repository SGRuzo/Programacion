import java.util.Scanner;
public class Factorial {
        // Metodo recursivo para calcular el factorial con int
        public static int calcularFactorial(int numero) {
            if (numero == 0 || numero == 1) { // Caso base
                return 1;
            }
            return numero * calcularFactorial(numero - 1); // Llamada recursiva
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicitar al usuario un número entero
            System.out.print("Introduce un número entero para calcular su factorial: ");
            int numero = scanner.nextInt();

            // Validar que el número sea positivo y no supere los límites
            if (numero < 0) {
                System.out.println("El factorial no está definido para números negativos.");
            } else if (numero > 12) { // Factorial de 13 supera el rango de int
                System.out.println("El número es demasiado grande para calcular el factorial usando int.");
            } else {
                // Calcular y mostrar el factorial
                int resultado = calcularFactorial(numero);
                System.out.println("El factorial de " + numero + " es: " + resultado);
            }

            scanner.close();
        }
    }

