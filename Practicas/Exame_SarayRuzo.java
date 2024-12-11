import java.util.Scanner;

/**
 * Programa para xestionar os libros dunha biblioteca.
 * Taboa unidimensional
 *
 * @version 1.0
 * @author SarayGRuzo
 */
public class Examen2_SarayGarciaRuzo {
    // Array para almacenar os libros
    private static String[] libros = new String[20];

    public static void main(String[] args) {
        // Inicializar o array con "Baleira"
        for (int i = 0; i < libros.length; i++) {
            libros[i] = "Baleira";
        }

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Menú principal
            System.out.println("\nMenú biblioteca:");
            System.out.println("1. Engadir un libro.");
            System.out.println("2. Ver a lista dos libros.");
            System.out.println("3. Eliminar un libro.");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    engadirLibro(scanner);
                    break;
                case 2:
                    visualizarLibros();
                    break;
                case 3:
                    eliminarLibro(scanner);
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opción non válida, volve a intentalo.");
            }
        } while (opcion != 4);

        scanner.close();
    }

    /**
     * Método para engadir un libro ao array.
     *
     * @param scanner Scanner para entrada do usuario.
     */
    public static void engadirLibro(Scanner scanner) {
        System.out.print("Introduce o nome do libro: ");
        scanner.nextLine(); // Consumir o salto de liña pendente
        String libro = scanner.nextLine();

        // Buscar unha posición "Baleira" para engadir o libro
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].equals("Baleira")) {
                libros[i] = libro;
                System.out.println("Libro engadido na posición " + i + ".");
                return;
            }
        }
        System.out.println("Non hai espacio dispoñible para engadir o libro.");
    }

    /**
     * Método para visualizar a lista de libros.
     */
    public static void visualizarLibros() {
        System.out.println("\nLista de libros:");
        for (int i = 0; i < libros.length; i++) {
            System.out.println("Posición " + i + ": " + libros[i]);
        }
    }

    /**
     * Método para eliminar un libro do array.
     *
     * @param scanner Scanner para entrada do usuario.
     */
    public static void eliminarLibro(Scanner scanner) {
        System.out.print("Introduce o índice do libro que queres eliminar (0-19): ");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < libros.length) {
            if (!libros[indice].equals("Baleira")) {
                libros[indice] = "Baleira";
                System.out.println("Libro eliminado na posición " + indice + ".");
            } else {
                System.out.println("A posición xa está baleira.");
            }
        } else {
            System.out.println("Índice inválido. Introduce un número entre 0 e 19.");
        }
    }
}
