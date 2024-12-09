import java.util.Scanner;
/**
 * Programa para hotel con tablero 4plantas y 6habitaciones por planta.
 * Registrar usuarios con nombre, liberar habitaciones y consultar habitaciones vacías.
 * @version 1.0
 * @author SarayGRuzo
 */

public class HabHotel {
    public static void main (String[] args) {
        String[][] hotel = new String[4][6];

        for (int i=0; 1 < hotel.length; i++) {
            for (int j=0; j < hotel [i].length;j++) {
                hotel [i][j] ="Vacía";
            }
        }
        Scanner scanner = new Scanner (System.in);
        int opcion;
        do {
            System.out.println("Gestión del Hotel:");
            System.out.println("1. Registrar usuario.");
            System.out.println("2. Liberar habitación.");
            System.out.println("3.Consultar habitacionesvacías.");
            System.out.println("4. Salir");
            System.out.println("Elige una opción: ");
            opcion=scanner.nextInt();
            switch (opcion) {
                case 1:
                    registrar(hotel, scanner);
                    break;
                case 2:
                    liberar(hotel, scanner);
                    break;
                case 3:
                    consultar(hotel);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, vuelve a intentarlo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
    public static void registrar(String[][] hotel, Scanner scanner){
        System.out.print("Introduce el nombre del cliente: ");
        String cliente = scanner.next();

        System.out.print("Introduce el número de planta (1-4): ");
        int planta = scanner.nextInt();

        System.out.print("Introduce el número de habitación (1-6): ");
        int habitacion = scanner.nextInt();

        if (planta < 1 || planta > 4 || habitacion < 1 || habitacion > 6){
            System.out.println ("A habitación " +habitacion+ "está ocupada, intentalo con una vacía.");
            return;
        } else {
            hotel[planta - 1][habitacion - 1] = cliente;
            System.out.println("Habitación registrada con éxito.");
        }

    }
    public static void liberar(String[][] hotel, Scanner scanner) {
        System.out.print("Introduce el número de planta (1-4): ");
        int planta = scanner.nextInt();

        System.out.print("Introduce el número de habitación (1-6): ");
        int habitacion = scanner.nextInt();

        if (planta < 1 || planta > 4 || habitacion < 1 || habitacion > 6) {
            System.out.println("Planta o habitación fuera de rango.");
            return;
        }

        if (hotel[planta - 1][habitacion - 1].equals("Vacía")) {
            System.out.println("La habitación ya está vacía.");
        } else {
            hotel[planta - 1][habitacion - 1] = "Vacía";
            System.out.println("Habitación liberada con éxito.");
        }
    }

    public static void consultar(String[][] hotel) {
        for (int i = 0; i<hotel.length; i++) {
            System.out.println ("Planta " + (i+1)+ ": ");
            for (int j=0; j<hotel[i].length; j++) {
                System.out.println ("Habitación " + (j+1) + ": ");
            }
            System.out.println();
        }


    }

}
