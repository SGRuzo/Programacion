import java.util.Scanner;

public class TablaMultiplicar {

    // Función recursiva para generar la tabla de multiplicar
    public static void generarTabla(int numero, int i) {
        // Caso base: Si hemos llegado a la décima multiplicación, terminamos la recursión
        if (i > 10) {
            return;
        }

        // Imprimimos el resultado de la multiplicación
        System.out.println(numero + " x " + i + " = " + (numero * i));

        // Llamamos recursivamente para el siguiente número
        generarTabla(numero, i + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que ingrese el número
        System.out.print("Introduce el número para generar su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        // Llamamos a la función recursiva para empezar con la tabla desde 1
        generarTabla(numero, 1);

        scanner.close();  // Cerramos el scanner
    }
}
