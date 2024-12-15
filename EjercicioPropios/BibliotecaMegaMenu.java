import java.util.Scanner;  // Importa la clase Scanner para leer la entrada del usuario desde la consola.

/**
 * Clase que simula una biblioteca, con funciones recursivas para gestionar una lista de libros.
 */
public class BibliotecaMegaMenu {  // Definimos la clase principal que contiene el código de la biblioteca.

    // Array que almacena los títulos de los libros. Inicialmente, tenemos 10 posiciones disponibles.
    private static String[] listaLibros = new String[10];

    /**
     * Muestra toda la lista de libros de forma recursiva.
     * @param indice Índice desde donde empezar a mostrar la lista.
     */
    public static void mostrarLista(int indice) {
        // Condición base: si el índice llega al tamaño de la lista, se detiene la recursión.
        // Esto evita acceder a posiciones fuera de los límites del array.
        if (indice == listaLibros.length) {
            return; // Termina la ejecución de la función cuando se cumple la condición.
        }

        // Verifica si el elemento en la posición actual de la lista es nulo.
        // Si es nulo, imprime "vacío"; si no, imprime el contenido del libro.
        System.out.println(listaLibros[indice] == null ? "vacío" : listaLibros[indice]);

        // Llamada recursiva: incrementa el índice en 1 para avanzar al siguiente elemento.
        // Este es el paso que mueve la función hacia la condición base.
        mostrarLista(indice + 1);
    }

    /**
     * Muestra una sublista de libros entre los índices n y m.
     * @param n Índice inicial de la sublista.
     * @param m Índice final de la sublista.
     * @param indice Índice desde donde empezar a mostrar la sublista.
     */
    public static void mostrarSublista(int n, int m, int indice) {
        // Verifica si el índice actual (indice) supera el índice final (m) de la sublista.
        // Si esto ocurre, detiene la ejecución de la función mediante "return".
        if (indice > m) {
            return;  // Caso base de la recursión: no hay más libros que procesar.
        }

        // Comprueba si el índice actual (indice) está dentro del rango deseado,
        // es decir, mayor o igual al índice inicial (n).
        if (indice >= n) {
            // Si el índice actual contiene un libro, lo imprime. Si es nulo, imprime "vacío".
            System.out.println(listaLibros[indice] == null ? "vacío" : listaLibros[indice]);
        }

        // Llama recursivamente a la función, incrementando el índice en 1.
        // Esto asegura que se procesen los índices siguientes dentro del rango [n, m].
        mostrarSublista(n, m, indice + 1);
    }


    /**
     * Busca un libro en la lista de forma recursiva.
     * @param libro Título del libro a buscar.
     * @param indice Índice desde donde empezar la búsqueda.
     * @return true si el libro se encuentra en la lista, false en caso contrario.
     */
    public static boolean buscarLibro(String libro, int indice) {
        // Comprueba si hemos llegado al final de la lista de libros
        // Si el índice actual es igual al tamaño de la lista, significa que no encontramos el libro
        if (indice == listaLibros.length) {
            return false;  // Devuelve false porque el libro no está en la lista
        }
        // Comprueba si el título del libro actual en el índice coincide con el libro buscado
        if (libro.equals(listaLibros[indice])) {
            return true;  // Si se encuentra el libro, devuelve true
        }
        // Llama recursivamente a la función incrementando el índice en 1
        // Continúa buscando el libro en el resto de la lista
        return buscarLibro(libro, indice + 1);
    }


    /**
     * Cuenta cuántas veces aparece un libro en la lista.
     * @param libro Título del libro a contar.
     * @param indice Índice desde donde empezar a contar.
     * @return El número de veces que el libro aparece en la lista.
     */
    public static int contarLibro(String libro, int indice) {
        // Verifica si se ha llegado al final de la lista.
        // 'listaLibros.length' indica el tamaño de la lista, y 'indice' representa la posición actual.
        if (indice == listaLibros.length) {
            // Si el índice alcanza el tamaño de la lista, significa que ya se revisaron todos los elementos.
            // Devuelve 0 porque no hay más libros que contar.
            return 0;
        }

        // Comprueba si el libro en la posición actual es igual al libro que estamos buscando.
        // 1. Verifica que el elemento en el índice actual no sea null (para evitar errores de referencia).
        // 2. Compara el libro en el índice actual con el libro buscado usando `.equals`.
        // Si coinciden, asigna 1 (indica que se encontró una ocurrencia); de lo contrario, asigna 0.
        int count = listaLibros[indice] != null && listaLibros[indice].equals(libro) ? 1 : 0;

        // Llama a la función recursivamente para continuar verificando el siguiente índice.
        // Suma 'count' (el resultado actual, que puede ser 0 o 1) al resultado de la llamada recursiva.
        return count + contarLibro(libro, indice + 1);
    }


    /**
     * Encuentra el libro con el título más largo.
     * @param indice Índice desde donde empezar la búsqueda.
     * @param maxLibro Título del libro más largo encontrado hasta el momento.
     * @return El libro con el título más largo.
     */
    public static String libroMasLargo(int indice, String maxLibro) {
        // Caso base: si el índice ha llegado al tamaño de la lista de libros, se retorna el libro más largo encontrado.
        if (indice == listaLibros.length) {
            return maxLibro; // Devuelve el título del libro más largo almacenado en maxLibro.
        }

        // Comprueba si el libro en la posición actual no es nulo y si su longitud es mayor
        // que la longitud del libro más largo encontrado hasta ahora.
        if (listaLibros[indice] != null && listaLibros[indice].length() > maxLibro.length()) {
            maxLibro = listaLibros[indice]; // Actualiza maxLibro con el título del libro más largo.
        }

        // Llamada recursiva: incrementa el índice para revisar el siguiente libro en la lista.
        return libroMasLargo(indice + 1, maxLibro);
    }


    /**
     * Encuentra el libro con el título más corto.
     * @param indice Índice desde donde empezar la búsqueda.
     * @param minLibro Título del libro más corto encontrado hasta el momento.
     * @return El libro con el título más corto.
     */
    public static String libroMasCorto(int indice, String minLibro) {
        // Caso base: Si el índice ha alcanzado el tamaño de la lista, se retorna el libro más corto encontrado.
        if (indice == listaLibros.length) {
            return minLibro;  // Devuelve el resultado acumulado en minLibro.
        }

        // Verifica si el libro actual no es nulo y si su longitud es menor que la del libro más corto encontrado.
        if (listaLibros[indice] != null && listaLibros[indice].length() < minLibro.length()) {
            minLibro = listaLibros[indice];  // Actualiza minLibro con el título más corto encontrado hasta ahora.
        }

        // Llama recursivamente a la función, avanzando al siguiente índice.
        return libroMasCorto(indice + 1, minLibro);
    }


    /**
     * Cuenta cuántos libros empiezan con una letra específica.
     * @param letra La letra con la que deben empezar los títulos de los libros.
     * @param indice Índice desde donde empezar a contar.
     * @return El número de libros que empiezan con la letra especificada.
     */
    public static int contarPorLetra(char letra, int indice) {
        // Verifica si hemos alcanzado el final de la lista de libros.
        // 'listaLibros.length' representa el tamaño de la lista de libros.
        if (indice == listaLibros.length) {
            // Si el índice es igual al tamaño de la lista, terminamos la recursión
            // y devolvemos 0 porque no hay más libros para revisar.
            return 0;
        }

        // Comprueba si el libro en el índice actual no es nulo y su primer carácter
        // coincide con la letra especificada.
        // 'listaLibros[indice]' asegura que el libro existe (no es null).
        // 'charAt(0)' obtiene el primer carácter del título del libro.
        int count = listaLibros[indice] != null && listaLibros[indice].charAt(0) == letra ? 1 : 0;

        // Si las condiciones se cumplen, 'count' tendrá el valor 1, de lo contrario será 0.

        // Realiza una llamada recursiva al metodo con el siguiente índice (indice + 1)
        // y suma el resultado de esa llamada a 'count'.
        return count + contarPorLetra(letra, indice + 1);
    }


    /**
     * Comprueba si un libro contiene una palabra clave.
     * @param libro Título del libro a comprobar. (No se utiliza en este metodo, es redundante).
     * @param palabra La palabra clave que debe contener el libro.
     * @param indice Índice desde donde empezar a comprobar en la lista de libros.
     * @return true si algún libro contiene la palabra, false en caso contrario.
     */
    public static boolean contienePalabra(String libro, String palabra, int indice) {
        // Caso base: si el índice ha alcanzado el tamaño de la lista de libros, hemos recorrido toda la lista.
        // No se encontró ningún libro que contenga la palabra, por lo tanto, devolvemos false.
        if (indice == listaLibros.length) {
            return false;
        }

        // Verifica si el elemento actual de la lista no es nulo y contiene la palabra clave.
        // Si se cumple esta condición, devolvemos true porque ya hemos encontrado la palabra.
        if (listaLibros[indice] != null && listaLibros[indice].contains(palabra)) {
            return true;
        }

        // Si no hemos encontrado la palabra en el índice actual, realizamos una llamada recursiva al metodo,
        // incrementando el índice en 1 para comprobar el siguiente libro de la lista.
        return contienePalabra(libro, palabra, indice + 1);
    }


    /**
     * Busca el índice de un libro en la lista de forma recursiva.
     *
     * @param libro Título del libro que se desea buscar en la lista.
     * @param indice Índice actual desde donde se realiza la búsqueda.
     * @return El índice del libro en la lista si se encuentra; de lo contrario, -1.
     */
    public static int buscarIndice(String libro, int indice) {
        // Caso base 1: Si el índice actual es igual al tamaño de la lista, significa que
        // hemos recorrido toda la lista sin encontrar el libro, por lo que devolvemos -1.
        if (indice == listaLibros.length) {
            return -1; // Indica que el libro no se encuentra en la lista.
        }
        // Caso base 2: Si el libro en la posición actual (indice) de la lista coincide con
        // el libro que estamos buscando, devolvemos el índice actual.
        if (libro.equals(listaLibros[indice])) {
            return indice; // Retorna el índice donde se encontró el libro.
        }
        // Caso recursivo: Si no se cumple ninguno de los casos base, se llama a la función
        // de nuevo, incrementando el índice en 1 para continuar buscando en la siguiente posición.
        return buscarIndice(libro, indice + 1);
    }


    /**
     * Comprueba si todos los libros tienen un título con una longitud superior a n caracteres.
     * @param n La longitud mínima de los títulos.
     * @param indice Índice desde donde empezar a comprobar.
     * @return true si todos los títulos son largos, false en caso contrario.
     */
    public static boolean todosLargos(int n, int indice) {
        // Caso base: si el índice alcanza la longitud de la lista, hemos comprobado todos los libros
        // y ninguno ha fallado, por lo que todos cumplen la condición.
        if (indice == listaLibros.length) {
            return true;  // Retorna true porque todos los títulos son largos.
        }

        // Comprueba si el elemento en la posición actual de la lista es nulo o si su longitud
        // es menor o igual al número especificado (n).
        if (listaLibros[indice] == null || listaLibros[indice].length() <= n) {
            return false;  // Si alguno no cumple, retorna false inmediatamente.
        }

        // Llamada recursiva: pasa al siguiente índice para comprobar el resto de los libros.
        // El índice se incrementa en 1 para analizar el siguiente libro en la lista.
        return todosLargos(n, indice + 1);
    }


    /**
     * Cuenta cuántos libros contienen un carácter especial.
     * @param caracter El carácter especial a buscar.
     * @param indice Índice desde donde empezar a contar.
     * @return El número de libros que contienen el carácter especial.
     */
    public static int contarCaracterEspecial(char caracter, int indice) {
        // Caso base: Si hemos recorrido toda la lista (el índice actual es igual al tamaño de la lista),
        // devolvemos 0, ya que no hay más libros para verificar.
        if (indice == listaLibros.length) {
            return 0;
        }

        // Verificamos si el libro en la posición actual (listaLibros[indice]) no es null
        // y si contiene el carácter especial usando el metodo `indexOf`.
        // Si el carácter está presente, `indexOf` devolverá un valor mayor o igual a 0.
        // En ese caso, `count` será 1; si no, será 0.
        int count = listaLibros[indice] != null && listaLibros[indice].indexOf(caracter) >= 0 ? 1 : 0;

        // Retornamos la suma del resultado actual (`count`) y el resultado de la llamada recursiva.
        // Llamamos a la misma función, pero incrementamos el índice en 1 para procesar el siguiente libro.
        return count + contarCaracterEspecial(caracter, indice + 1);
    }


    /**
     * Cuenta cuántos títulos son palíndromos.
     * @param indice Índice desde donde empezar a contar.
     * @return El número de libros que son palíndromos.
     */
    public static int contarPalindromos(int indice) {
        // Verifica si el índice es igual a la longitud de la lista de libros, lo que significa que hemos llegado al final de la lista.
        if (indice == listaLibros.length) {
            // Si hemos llegado al final, no hay más libros para verificar, por lo que devolvemos 0.
            return 0;
        }

        // Verifica si el libro en el índice actual no es nulo y si el título del libro es un palíndromo.
        // Si ambos son verdaderos, asigna 1 a la variable 'count', de lo contrario, asigna 0.
        int count = listaLibros[indice] != null && esPalindromo(listaLibros[indice]) ? 1 : 0;

        // Llama recursivamente a la función para el siguiente índice (indice + 1), y agrega el resultado de esa llamada al valor actual de 'count'.
        // Esto suma el número de palíndromos en el resto de la lista.
        return count + contarPalindromos(indice + 1);
    }


    /**
     * Función auxiliar para comprobar si un título es un palíndromo.
     * Un palíndromo es una palabra o frase que se lee igual hacia adelante y hacia atrás.
     * @param titulo El título a comprobar.
     * @return true si el título es un palíndromo, false en caso contrario.
     */
    private static boolean esPalindromo(String titulo) {
        // Usamos StringBuilder para invertir el título. StringBuilder es una clase que permite manipular cadenas de texto de forma eficiente.
        String reversed = new StringBuilder(titulo).reverse().toString();

        // Comparamos el título original con su versión invertida. Si son iguales, es un palíndromo.
        return titulo.equals(reversed);
    }


    /**
     * Añade un libro al final de la lista.
     * @param libro Título del libro a añadir.
     * @param indice Índice desde donde empezar a añadir el libro.
     */
    public static void agregarLibroAlFinal(String libro, int indice) {
        // Verifica si el índice es igual al tamaño de la lista, lo que indica que se ha llegado al final de la lista.
        if (indice == listaLibros.length) {
            return;  // Si el índice es igual al tamaño de la lista, termina la ejecución (no hay más espacio).
        }

        // Verifica si el índice es el penúltimo de la lista. Es decir, el índice donde se puede agregar un nuevo libro.
        if (indice == listaLibros.length - 1) {
            // Si hemos llegado al penúltimo índice, se asigna el libro al último espacio disponible.
            listaLibros[indice] = libro;  // Asigna el libro en la posición indicada en el arreglo listaLibros.
        } else {
            // Si no hemos llegado al final de la lista, recursivamente llamamos a la función aumentando el índice.
            agregarLibroAlFinal(libro, indice + 1);  // Llama nuevamente a la función con el índice incrementado.
        }
    }

    public static void agregarLibroAlInicio(String libro, int indice) {
        if (indice == 0) {
            // Mueve todos los elementos hacia la derecha
            for (int i = listaLibros.length - 1; i > 0; i--) {
                listaLibros[i] = listaLibros[i - 1];
            }
            listaLibros[0] = libro;  // Agrega el nuevo libro al inicio
        } else {
            agregarLibroAlInicio(libro, indice + 1);
        }
    }


    /**
     * Menú interactivo donde el usuario puede elegir qué acción realizar.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Inicializa el escáner para leer la entrada del usuario
        int opcion = 0;  // Variable que almacena la opción seleccionada por el usuario

        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Mostrar lista de libros");
            System.out.println("2. Mostrar sublista de libros");
            System.out.println("3. Buscar libro");
            System.out.println("4. Contar libro");
            System.out.println("5. Libro más largo");
            System.out.println("6. Libro más corto");
            System.out.println("7. Contar libros que empiezan con letra");
            System.out.println("8. Buscar palabra en libro");
            System.out.println("9. Buscar índice de libro");
            System.out.println("10. Comprobar si todos los títulos son largos");
            System.out.println("11. Contar libros con carácter especial");
            System.out.println("12. Contar libros palíndromos");
            System.out.println("13. Añadir libro al final");
            System.out.println("14. Añadir libro al inicio");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();  // Lee la opción elegida por el usuario

            switch (opcion) {
                case 1:  // Opción para mostrar la lista completa de libros
                    mostrarLista(0);
                    break;
                case 2:  // Opción para mostrar una sublista de libros
                    System.out.print("Ingrese índice inicial: ");
                    int n = sc.nextInt();
                    System.out.print("Ingrese índice final: ");
                    int m = sc.nextInt();
                    mostrarSublista(n, m, 0);
                    break;
                case 3:  // Opción para buscar un libro
                    System.out.print("Ingrese el título del libro a buscar: ");
                    sc.nextLine();  // Limpia el buffer del scanner
                    String libroBuscar = sc.nextLine();
                    System.out.println("¿El libro está en la lista? " + (buscarLibro(libroBuscar, 0) ? "Sí" : "No"));
                    break;
                case 4:  // Opción para contar un libro específico
                    System.out.print("Ingrese el título del libro a contar: ");
                    sc.nextLine();  // Limpia el buffer del scanner
                    String libroContar = sc.nextLine();
                    System.out.println("El libro aparece " + contarLibro(libroContar, 0) + " veces.");
                    break;
                case 5:  // Opción para encontrar el libro más largo
                    String libroLargo = libroMasLargo(0, "");
                    System.out.println("El libro más largo es: " + libroLargo);
                    break;
                case 6:  // Opción para encontrar el libro más corto
                    String libroCorto = libroMasCorto(0, "");
                    System.out.println("El libro más corto es: " + libroCorto);
                    break;
                case 7:  // Opción para contar libros que empiezan con una letra específica
                    System.out.print("Ingrese la letra: ");
                    char letra = sc.next().charAt(0);
                    System.out.println("Hay " + contarPorLetra(letra, 0) + " libros que empiezan con " + letra);
                    break;
                case 8:  // Opción para buscar una palabra en los títulos de los libros
                    System.out.print("Ingrese palabra a buscar: ");
                    sc.nextLine();  // Limpia el buffer del scanner
                    String palabraBuscar = sc.nextLine();
                    System.out.println("¿Se encontró la palabra? " + (contienePalabra("", palabraBuscar, 0) ? "Sí" : "No"));
                    break;
                case 9:  // Opción para buscar el índice de un libro
                    System.out.print("Ingrese el título del libro a buscar su índice: ");
                    sc.nextLine();  // Limpia el buffer del scanner
                    String libroIndice = sc.nextLine();
                    int indice = buscarIndice(libroIndice, 0);
                    if (indice == -1) {
                        System.out.println("El libro no se encontró.");
                    } else {
                        System.out.println("El libro está en el índice: " + indice);
                    }
                    break;
                case 10:  // Opción para comprobar si todos los títulos son largos
                    System.out.print("Ingrese la longitud mínima de los títulos: ");
                    int longitudMin = sc.nextInt();
                    System.out.println("¿Todos los libros tienen títulos más largos que " + longitudMin + "? " +
                            (todosLargos(longitudMin, 0) ? "Sí" : "No"));
                    break;
                case 11:  // Opción para contar libros con un carácter especial
                    System.out.print("Ingrese el carácter especial: ");
                    char especial = sc.next().charAt(0);
                    System.out.println("Hay " + contarCaracterEspecial(especial, 0) + " libros con el carácter " + especial);
                    break;
                case 12:  // Opción para contar palíndromos
                    System.out.println("Hay " + contarPalindromos(0) + " libros que son palíndromos.");
                    break;
                case 13:  // Opción para añadir un libro al final
                    System.out.print("Ingrese el título del libro a añadir: ");
                    sc.nextLine();  // Limpia el buffer del scanner
                    String libroAnadirF = sc.nextLine();
                    agregarLibroAlFinal(libroAnadirF, 0);
                    break;
                case 14:  // Opción para añadir un libro al final
                    System.out.print("Ingrese el título del libro a añadir: ");
                    sc.nextLine();  // Limpia el buffer del scanner
                    String libroAnadirI = sc.nextLine();
                    agregarLibroAlInicio(libroAnadirI, 0);
                    break;
                case 0:  // Opción para salir
                    System.out.println("¡Adiós!");
                    break;
                default:  // Si elige una opción inválida
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);  // El ciclo continuará hasta que el usuario elija salir
        sc.close();  // Cierra el scanner cuando ya no se use.
    }
}
