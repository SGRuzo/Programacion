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
        System.out.println("Gestión del Hotel:");
        System.out.println("1. Registrar usuario.");
        System.out.println("2. Liberar habitación.");
        System.out.println("3.Consultar habitacionesvacías.");
        System.out.println("4. Salir");
        opcion=scanner.nextInt();
        Switch (ocpion){
            case 1:
                registrar(hotel, scanner);
                break;
            case 2:
                liberar(hotel, scanner);
                break;
            case 3:
                consultar(hotel, scanner);
                break;
            case 4:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida, vuelve a intentarlo.");
        }
        scanner.close();
    }
    public static void registrar(String[][] hotel, Scanner scanner) {
        System.out.println("Planta (0-3):");
        int planta=scanner.nextInt();
        System.out.println("Habitación (0-5):");
        int habitacion =scanner.nextInt();

        if (planta >= 0 && <4 && habitacion >= 0 && habitacion <6) {
            if hotel[planta][habitacion]
        }
    }
    public static void liberar(String[][] hotel, Scanner scanner) {

    }

    public static void consultar(String[][] hotel, Scanner scanner) {

    }

}
