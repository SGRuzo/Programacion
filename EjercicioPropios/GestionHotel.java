import java.util.Scanner;

public class GestionHotel {
    public static void main(String[] args) {
        // Creamos un array bidimensional para representar el hotel
        // 4 plantas y 6 habitaciones por planta
        String[][] hotel = new String[4][6];  // El hotel tiene 4 plantas, cada una con 6 habitaciones.

        // Inicializamos el array con el valor "Vacía"
        for (int i = 0; i < hotel.length; i++) { // Recorremos cada planta del hotel
            for (int j = 0; j < hotel[i].length; j++) { // Recorremos las habitaciones de cada planta
                hotel[i][j] = "Vacía"; // Establecemos que todas las habitaciones están vacías al inicio
            }
        }

        // Menú principal
        Scanner scanner = new Scanner(System.in); // Creamos un scanner para leer entradas del usuario
        int opcion;

        do {
            System.out.println("\n--- Gestión del Hotel ---"); // Muestra el menú de opciones
            System.out.println("1. Registrar usuario");
            System.out.println("2. Liberar habitación");
            System.out.println("3. Consultar habitaciones vacías");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt(); // Leemos la opción elegida por el usuario

            // Usamos un switch para ejecutar la acción correspondiente según la opción seleccionada
            switch (opcion) {
                case 1: // Si el usuario elige registrar un usuario
                    registrarUsuario(hotel, scanner); // Llamamos a la función para registrar usuario
                    break;
                case 2: // Si el usuario elige liberar una habitación
                    liberarHabitacion(hotel, scanner); // Llamamos a la función para liberar una habitación
                    break;
                case 3: // Si el usuario elige consultar las habitaciones vacías
                    consultarHabitacionesVacias(hotel); // Llamamos a la función para consultar las habitaciones vacías
                    break;
                case 4: // Si el usuario elige salir
                    System.out.println("Saliendo del programa..."); // Mensaje de salida
                    break;
                default: // Si el usuario ingresa una opción no válida
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 4); // El programa sigue ejecutándose hasta que el usuario elige salir (opción 4)

        scanner.close(); // Cerramos el scanner al final del programa
    }

    // Función para registrar un usuario
    public static void registrarUsuario(String[][] hotel, Scanner scanner) {
        System.out.print("Introduce el número de planta (0-3): ");
        int planta = scanner.nextInt(); // Leemos la planta seleccionada por el usuario
        System.out.print("Introduce el número de habitación (0-5): ");
        int habitacion = scanner.nextInt(); // Leemos la habitación seleccionada por el usuario

        // Verificamos que la planta y habitación sean válidas
        if (planta >= 0 && planta < 4 && habitacion >= 0 && habitacion < 6) {
            if (hotel[planta][habitacion].equals("Vacía")) { // Comprobamos si la habitación está vacía
                System.out.print("Introduce el nombre del usuario: ");
                scanner.nextLine(); // Limpiamos el buffer del scanner
                String nombre = scanner.nextLine(); // Leemos el nombre del usuario
                hotel[planta][habitacion] = nombre; // Registramos al usuario en la habitación
                System.out.println("Usuario registrado en la habitación " + habitacion + " de la planta " + planta);
            } else {
                System.out.println("La habitación ya está ocupada."); // Si la habitación ya está ocupada, mostramos un mensaje
            }
        } else {
            System.out.println("Número de planta o habitación inválido."); // Si la planta o habitación no son válidas, mostramos un mensaje
        }
    }

    // Función para liberar una habitación
    public static void liberarHabitacion(String[][] hotel, Scanner scanner) {
        System.out.print("Introduce el número de planta (0-3): ");
        int planta = scanner.nextInt(); // Leemos la planta seleccionada por el usuario
        System.out.print("Introduce el número de habitación (0-5): ");
        int habitacion = scanner.nextInt(); // Leemos la habitación seleccionada por el usuario

        // Verificamos que la planta y habitación sean válidas
        if (planta >= 0 && planta < 4 && habitacion >= 0 && habitacion < 6) {
            if (!hotel[planta][habitacion].equals("Vacía")) { // Si la habitación no está vacía
                hotel[planta][habitacion] = "Vacía"; // Liberamos la habitación, asignando el valor "Vacía"
                System.out.println("La habitación " + habitacion + " de la planta " + planta + " ha sido liberada.");
            } else {
                System.out.println("La habitación ya está vacía."); // Si la habitación ya está vacía, mostramos un mensaje
            }
        } else {
            System.out.println("Número de planta o habitación inválido."); // Si la planta o habitación no son válidas, mostramos un mensaje
        }
    }

    // Función para consultar habitaciones vacías
    public static void consultarHabitacionesVacias(String[][] hotel) {
        System.out.println("\nHabitaciones vacías:"); // Mostramos un mensaje de inicio
        // Recorremos todas las habitaciones del hotel
        for (int i = 0; i < hotel.length; i++) { // Recorremos las plantas del hotel
            for (int j = 0; j < hotel[i].length; j++) { // Recorremos las habitaciones de cada planta
                if (hotel[i][j].equals("Vacía")) { // Si la habitación está vacía
                    System.out.println("Planta " + i + ", Habitación " + j); // Mostramos la planta y el número de habitación vacía
                }
            }
        }
    }
}

