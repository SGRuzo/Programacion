import java.util.Scanner;

public class BibliotecaTabla {

    // Lista de libros, la cual usaremos como una tabla simulada
    static String[] libros = new String[100]; // Usamos un arreglo de 100 libros como ejemplo
    static int cantidadLibros = 0;  // Variable para llevar el conteo de la cantidad de libros en la lista

    // Función recursiva para mostrar la lista completa de libros
    public static void mostrarLista(int index) {
        // Si hemos llegado al final de la lista, terminamos la función
        if (index == cantidadLibros) {
            return;
        }
        // Mostramos el título del libro
        System.out.println(libros[index]);
        // Llamamos recursivamente para mostrar el siguiente libro
        mostrarLista(index + 1);
    }

    // Función recursiva para mostrar una sublista de libros entre los índices n y m
    public static void mostrarSublista(int n, int m, int index) {
        // Si hemos alcanzado el índice final, terminamos la función
        if (index > m) {
            return;
        }
        // Mostramos el libro solo si el índice está dentro del rango solicitado
        if (index >= n) {
            System.out.println(libros[index]);
        }
        // Llamamos recursivamente para mostrar el siguiente libro
        mostrarSublista(n, m, index + 1);
    }

    // Función recursiva para buscar un libro en la lista
    public static boolean buscarLibro(String libro, int index) {
        // Si llegamos al final de la lista y no encontramos el libro
        if (index == cantidadLibros) {
            return false;
        }
        // Si encontramos el libro en el índice actual
        if (libros[index].equalsIgnoreCase(libro)) {
            return true;
        }
        // Llamamos recursivamente para buscar en el siguiente índice
        return buscarLibro(libro, index + 1);
    }

    // Función recursiva para contar cuántas veces aparece un libro en la lista
    public static int contarLibro(String libro, int index) {
        // Si llegamos al final de la lista, devolvemos 0
        if (index == cantidadLibros) {
            return 0;
        }
        // Contamos 1 si el libro coincide en el índice actual
        int count = (libros[index].equalsIgnoreCase(libro)) ? 1 : 0;
        // Llamamos recursivamente y sumamos el conteo
        return count + contarLibro(libro, index + 1);
    }

    // Función recursiva para encontrar el libro más largo
    public static String libroMasLargo(int index, String libroMasLargo) {
        // Si llegamos al final de la lista, devolvemos el libro más largo encontrado
        if (index == cantidadLibros) {
            return libroMasLargo;
        }
        // Actualizamos el libro más largo si el actual tiene más caracteres
        if (libros[index].length() > libroMasLargo.length()) {
            libroMasLargo = libros[index];
        }
        // Llamamos recursivamente para continuar con el siguiente libro
        return libroMasLargo(index + 1, libroMasLargo);
    }

    // Función recursiva para encontrar el libro más corto
    public static String libroMasCorto(int index, String libroMasCorto) {
        // Si llegamos al final de la lista, devolvemos el libro más corto encontrado
        if (index == cantidadLibros) {
            return libroMasCorto;
        }
        // Actualizamos el libro más corto si el actual tiene menos caracteres
        if (libros[index].length() < libroMasCorto.length()) {
            libroMasCorto = libros[index];
        }
        // Llamamos recursivamente para continuar con el siguiente libro
        return libroMasCorto(index + 1, libroMasCorto);
    }

    // Función recursiva para contar libros que empiezan con una letra específica
    public static int contarPorLetra(char letra, int index) {
        // Si llegamos al final de la lista, devolvemos 0
        if (index == cantidadLibros) {
            return 0;
        }
        // Verificamos si el título del libro empieza con la letra especificada
        int count = (libros[index].charAt(0) == letra) ? 1 : 0;
        // Llamamos recursivamente para contar los siguientes libros
        return count + contarPorLetra(letra, index + 1);
    }

    // Función recursiva para buscar una palabra en los títulos de los libros
    public static boolean contienePalabra(String palabra, String buscarPalabra, int index) {
        // Si llegamos al final de la lista, devolvemos false
        if (index == cantidadLibros) {
            return false;
        }
        // Si el título del libro contiene la palabra
        if (libros[index].contains(buscarPalabra)) {
            return true;
        }
        // Llamamos recursivamente para continuar buscando
        return contienePalabra(palabra, buscarPalabra, index + 1);
    }

    // Función recursiva para buscar el índice de un libro
    public static int buscarIndice(String libro, int index) {
        // Si llegamos al final de la lista, devolvemos -1 (no encontrado)
        if (index == cantidadLibros) {
            return -1;
        }
        // Si encontramos el libro, devolvemos el índice
        if (libros[index].equalsIgnoreCase(libro)) {
            return index;
        }
        // Llamamos recursivamente para continuar la búsqueda
        return buscarIndice(libro, index + 1);
    }

    // Función recursiva para comprobar si todos los libros tienen títulos más largos que una longitud mínima
    public static boolean todosLargos(int longitudMin, int index) {
        // Si llegamos al final de la lista, devolvemos true
        if (index == cantidadLibros) {
            return true;
        }
        // Si un libro tiene un título más corto que la longitud mínima, devolvemos false
        if (libros[index].length() < longitudMin) {
            return false;
        }
        // Llamamos recursivamente para verificar el siguiente libro
        return todosLargos(longitudMin, index + 1);
    }

    // Función recursiva para contar libros con un carácter especial
    public static int contarCaracterEspecial(char especial, int index) {
        // Si llegamos al final de la lista, devolvemos 0
        if (index == cantidadLibros) {
            return 0;
        }
        // Contamos 1 si el título del libro contiene el carácter especial
        int count = (libros[index].indexOf(especial) != -1) ? 1 : 0;
        // Llamamos recursivamente para contar los siguientes libros
        return count + contarCaracterEspecial(especial, index + 1);
    }

    // Función recursiva para contar palíndromos
    public static int contarPalindromos(int index) {
        // Si llegamos al final de la lista, devolvemos 0
        if (index == cantidadLibros) {
            return 0;
        }
        // Verificamos si el título del libro es un palíndromo
        int count = esPalindromo(libros[index]) ? 1 : 0;
        // Llamamos recursivamente para contar los siguientes palíndromos
        return count + contarPalindromos(index + 1);
    }

    // Función para verificar si un texto es un palíndromo
    public static boolean esPalindromo(String texto) {
        String reversed = new StringBuilder(texto).reverse().toString();
        return texto.equalsIgnoreCase(reversed);
    }

    // Función recursiva para añadir un libro al final
    public static void agregarLibroAlFinal(String libro, int index) {
        // Si hemos llegado al final de la lista, añadimos el libro
        if (index == cantidadLibros) {
            libros[cantidadLibros++] = libro;
            return;
        }
        // Llamamos recursivamente hasta llegar al final
        agregarLibroAlFinal(libro, index + 1);
    }

    // Función recursiva para añadir un libro al inicio
    public static void agregarLibroAlInicio(String libro, int index) {
        // Si hemos llegado al final, añadimos el libro al inicio
        if (index == cantidadLibros) {
            for (int i = cantidadLibros; i > 0; i--) {
                libros[i] = libros[i - 1];
            }
            libros[0] = libro;
            cantidadLibros++;
            return;
        }
        // Llamamos recursivamente para desplazar los libros
        agregarLibroAlInicio(libro, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        // Bucle principal para mostrar el menú y manejar las opciones
        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Mostrar lista completa de libros");
            System.out.println("2. Mostrar sublista de libros");
            System.out.println("3. Buscar libro");
            System.out.println("4. Contar libro por nombre");
            System.out.println("5. Libro más largo");
            System.out.println("6. Libro más corto");
            System.out.println("7. Contar libros que empiezan con una letra");
            System.out.println("8. Buscar libros por palabra");
            System.out.println("9. Buscar índice de un libro");
            System.out.println("10. Comprobar si todos los libros son largos");
            System.out.println("11. Contar libros con caracteres especiales");
            System.out.println("12. Contar palíndromos");
            System.out.println("13. Añadir libro al final");
            System.out.println("14. Añadir libro al inicio");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            // Llamamos a la función correspondiente según la opción elegida
            switch (opcion) {
                case 1:
                    mostrarLista(0);
                    break;
                case 2:
                    System.out.print("Introduzca el índice inicial: ");
                    int n = sc.nextInt();
                    System.out.print("Introduzca el índice final: ");
                    int m = sc.nextInt();
                    mostrarSublista(n, m, 0);
                    break;
                case 3:
                    System.out.print("Introduce el nombre del libro a buscar: ");
                    String libroBuscar = sc.nextLine();
                    if (buscarLibro(libroBuscar, 0)) {
                        System.out.println("El libro está en la lista.");
                    } else {
                        System.out.println("El libro no está en la lista.");
                    }
                    break;
                case 4:
                    System.out.print("Introduce el nombre del libro para contar: ");
                    String libroContar = sc.nextLine();
                    int count = contarLibro(libroContar, 0);
                    System.out.println("El libro aparece " + count + " veces.");
                    break;
                case 5:
                    System.out.println("El libro más largo es: " + libroMasLargo(0, libros[0]));
                    break;
                case 6:
                    System.out.println("El libro más corto es: " + libroMasCorto(0, libros[0]));
                    break;
                case 7:
                    System.out.print("Introduce la letra para contar libros: ");
                    char letra = sc.nextLine().charAt(0);
                    System.out.println("Hay " + contarPorLetra(letra, 0) + " libros que empiezan con la letra " + letra + ".");
                    break;
                case 8:
                    System.out.print("Introduce la palabra para buscar en los libros: ");
                    String palabra = sc.nextLine();
                    if (contienePalabra(palabra, palabra, 0)) {
                        System.out.println("Hay libros que contienen esa palabra.");
                    } else {
                        System.out.println("No se encontró la palabra en los títulos.");
                    }
                    break;
                case 9:
                    System.out.print("Introduce el nombre del libro para buscar su índice: ");
                    String libroIndice = sc.nextLine();
                    int indice = buscarIndice(libroIndice, 0);
                    if (indice == -1) {
                        System.out.println("El libro no está en la lista.");
                    } else {
                        System.out.println("El índice del libro es: " + indice);
                    }
                    break;
                case 10:
                    System.out.print("Introduce la longitud mínima: ");
                    int longitudMin = sc.nextInt();
                    if (todosLargos(longitudMin, 0)) {
                        System.out.println("Todos los libros tienen títulos más largos que la longitud mínima.");
                    } else {
                        System.out.println("No todos los libros cumplen con la longitud mínima.");
                    }
                    break;
                case 11:
                    System.out.print("Introduce el carácter especial: ");
                    char especial = sc.nextLine().charAt(0);
                    System.out.println("Hay " + contarCaracterEspecial(especial, 0) + " libros con ese carácter especial.");
                    break;
                case 12:
                    System.out.println("Hay " + contarPalindromos(0) + " libros que son palíndromos.");
                    break;
                case 13:
                    System.out.print("Introduce el nombre del libro para añadirlo al final: ");
                    String libroFinal = sc.nextLine();
                    agregarLibroAlFinal(libroFinal, 0);
                    System.out.println("Libro añadido al final.");
                    break;
                case 14:
                    System.out.print("Introduce el nombre del libro para añadirlo al inicio: ");
                    String libroInicio = sc.nextLine();
                    agregarLibroAlInicio(libroInicio, 0);
                    System.out.println("Libro añadido al inicio.");
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida, por favor elige nuevamente.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
