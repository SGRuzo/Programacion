import java.util.Scanner;

public class ExamenRecu_SarayGarcia {
    public static String[] opciones = {"Pizza", "Hamburguesa", "Pasta", "Sushi", "Ensalada"};
    public static String[] votos = new String[5];
    public static void main(String[] args) {
        // Al inicio todos los valores de votos son 0
        for (int i = 0; i < votos.length; i++) {
            votos[i] = "0";
        }
    }

    static void rexistrarVoto(int indice) {
        if (indice == 0) {
            for (int i = votos.length - 1; i > 0; i++) {
                votos[i] = i++;
            }
        } else {
            rexistrarVoto(indice);
        }
    }

    static void pratoMaisVotado(int indice) {
        if (votos[indice] >= votos.length) {
            System.out.println("O prato máis votado é " + opciones[indice]);
        }

    }

     static void ReiniciarEnquisa() {
        // Al inicio todos los valores de votos son 0
        for (int i = 0; i < votos.length; i++) {
            votos[i] = "0";
        }
        System.out.println("Reiniciouse a enquisa.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eleccion = 0;
        do {
            System.out.println("Menú de opciones:");
            System.out.println("0.Saír");
            System.out.println("1. Participar na enquisa.");
            System.out.println("2. Coñecer o prato máis votado.");
            System.out.println("3. Inicializar enquisa");
            eleccion = scanner.nextInt();
            switch (eleccion) {
                case 0:  // Opción para salir
                    System.out.println("¡Adiós!");
                    break;
                case 1:  // Opción para participar na enquisa
                    System.out.println("Aporta o número ao que pertence o prato que desexa valorar.");
                    System.out.println("0.Pizza, 1.Hamburguesa, 2.Pasta, 3.Sushi, 4.Ensalada");
                    int indice = scanner.nextInt();
                    rexistrarVoto;
                    break;
                case 2:
                    PratoMaisVotado;
                case 3:
                    reiniciarEnquisa;
                default:  // Si elixe unha opción inválida
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (eleccion != 0);
        Scanner.close();
    }
}
