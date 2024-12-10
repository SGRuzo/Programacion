import java.util.Scanner;

public class Jardín {

    // Función para plantar una flor en el jardín
    public static void plantarFlor(String[][] jardin, int fila, int columna, String flor) {
        // Comprobamos si el lugar está vacío, es decir, si la celda contiene "0"
        if (jardin[fila][columna].equals("0")) {
            // Dependiendo de la flor seleccionada, colocamos el emoji correspondiente en la matriz
            if (flor.equals("🌸")) jardin[fila][columna] = "🌸";  // Flor de cerezo
            else if (flor.equals("🌻")) jardin[fila][columna] = "🌻";  // Girasol
            else if (flor.equals("🌹")) jardin[fila][columna] = "🌹";  // Rosa
            else if (flor.equals("🌼")) jardin[fila][columna] = "🌼";  // Margarita
            System.out.println("Flor plantada en (" + fila + ", " + columna + ")");
        } else {
            // Si el lugar ya tiene una flor, mostramos un mensaje de advertencia
            System.out.println("¡Este lugar ya tiene una flor!");
        }
    }

    // Función para regar una flor en el jardín
    public static void regarFlor(String[][] jardin, int fila, int columna) {
        // Comprobamos si la celda seleccionada tiene una flor (es decir, no está vacía)
        if (!jardin[fila][columna].equals("0")) {
            System.out.println("Flor regada en (" + fila + ", " + columna + ")");
            // Aquí podríamos implementar algún tipo de mejora de la flor, por ejemplo cambiar el emoji
            // para que parezca más viva. Esto es opcional y puede depender de cómo quieras representar el "crecimiento".
        } else {
            // Si no hay una flor en ese lugar, mostramos un mensaje
            System.out.println("¡No hay flor para regar aquí!");
        }
    }

    // Función para eliminar una flor del jardín
    public static void eliminarFlor(String[][] jardin, int fila, int columna) {
        // Comprobamos si la celda contiene una flor (es decir, no está vacía)
        if (!jardin[fila][columna].equals("0")) {
            // Eliminamos la flor (ponemos "0" en esa posición)
            jardin[fila][columna] = "0";
            System.out.println("Flor eliminada de (" + fila + ", " + columna + ")");
        } else {
            // Si no hay flor en esa celda, mostramos un mensaje
            System.out.println("¡No hay flor en este lugar!");
        }
    }

    // Función para ver el estado actual del jardín (mostrar la matriz)
    public static void verJardin(String[][] jardin) {
        // Recorremos la matriz e imprimimos el estado actual del jardín
        for (int i = 0; i < jardin.length; i++) {
            for (int j = 0; j < jardin[i].length; j++) {
                System.out.print(jardin[i][j] + " ");  // Imprimimos cada celda (flor o espacio vacío)
            }
            System.out.println();  // Salto de línea para separar las filas
        }
    }

    // Función principal con el menú de opciones
    public static void menu() {
        Scanner sc = new Scanner(System.in);

        // Crear jardín de 5x5 (matriz de 5 filas y 5 columnas)
        String[][] jardin = new String[5][5];

        // Inicializamos todas las celdas del jardín con "0", indicando que están vacías
        for (int i = 0; i < jardin.length; i++) {
            for (int j = 0; j < jardin[i].length; j++) {
                jardin[i][j] = "0";  // "0" representa un espacio vacío
            }
        }

        // Menú interactivo donde el usuario puede elegir qué acción realizar
        while (true) {
            System.out.println("\n*** Menú del Jardín ***");
            System.out.println("1. Plantar una flor");
            System.out.println("2. Regar una flor");
            System.out.println("3. Eliminar una flor");
            System.out.println("4. Ver el estado del jardín");
            System.out.println("5. Salir");

            // Leemos la opción elegida por el usuario
            int opcion = sc.nextInt();

            // Acción correspondiente a cada opción
            if (opcion == 1) {
                // Opción 1: Plantar una flor
                System.out.println("¿Qué flor quieres plantar?");
                System.out.print("1. 🌸 Flor de cerezo   ");
                System.out.print("2. 🌻 Girasol    ");
                System.out.print("3. 🌹 Rosa     ");
                System.out.println("4. 🌼 Margarita    ");
                int flor = sc.nextInt();

                // Pedimos al usuario las coordenadas (fila y columna)
                System.out.println("¿Dónde deseas plantar la flor? Ingresa fila y columna:");
                int fila = sc.nextInt();
                int columna = sc.nextInt();

                // Determinamos qué flor plantar según la opción del usuario
                String florElegida = "";
                if (flor == 1) florElegida = "🌸";
                else if (flor == 2) florElegida = "🌻";
                else if (flor == 3) florElegida = "🌹";
                else if (flor == 4) florElegida = "🌼";

                // Llamamos a la función para plantar la flor
                plantarFlor(jardin, fila, columna, florElegida);
            } else if (opcion == 2) {
                // Opción 2: Regar una flor
                System.out.println("¿Dónde deseas regar la flor? Ingresa fila y columna:");
                int fila = sc.nextInt();
                int columna = sc.nextInt();
                // Llamamos a la función para regar la flor
                regarFlor(jardin, fila, columna);
            } else if (opcion == 3) {
                // Opción 3: Eliminar una flor
                System.out.println("¿Dónde deseas eliminar una flor? Ingresa fila y columna:");
                int fila = sc.nextInt();
                int columna = sc.nextInt();
                // Llamamos a la función para eliminar la flor
                eliminarFlor(jardin, fila, columna);
            } else if (opcion == 4) {
                // Opción 4: Ver el estado del jardín
                verJardin(jardin);
            } else if (opcion == 5) {
                // Opción 5: Salir del programa
                System.out.println("¡Gracias por cuidar tu jardín!");
                break;  // Salimos del bucle y terminamos el programa
            } else {
                // Si el usuario ingresa una opción no válida, mostramos un mensaje
                System.out.println("Opción no válida. Por favor, elige de nuevo.");
            }
        }

        // Cerramos el scanner para evitar fugas de memoria
        sc.close();
    }

    // Metodo principal para iniciar el programa
    public static void main(String[] args) {
        menu();  // Llamamos al menú para iniciar el programa
    }
}
