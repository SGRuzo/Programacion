import java.util.Scanner;//importamos un Scanner
public class TresEnRaya {              //Declaramos clase
    public static void main(String[] args) {    //Metodo

        Scanner eleccion = new Scanner(System.in);  //creamos un scanner para entradas
        int[][] tablero_de_juego = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };

        boolean jugando = true; // Variable para controlar si el juego continúa

        while (jugando) {
            System.out.println("1.Jugar");
            System.out.println("2.Salir");
            int opcion = eleccion.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.println("Cara o Cruz (escribe 'cara' o 'cruz')"); //Imprimimos posibilidades
                    String cara_cruz = eleccion.next(); // Leemos elección del jugador
                    if (cara_cruz.equalsIgnoreCase("cara")) {
                        System.out.println("En que fila colocas cara?");
                        int fila_cara = eleccion.nextInt();
                        System.out.println("En que columna colocas cara?");
                        int columna_cara = eleccion.nextInt();
                        tablero_de_juego[fila_cara][columna_cara] = 1; // Marca "cara" en el tablero

                    } else if (cara_cruz.equalsIgnoreCase("cruz")) {
                        System.out.println("En que fila colocas cruz?");
                        int fila_cruz = eleccion.nextInt();
                        System.out.println("En que columna colocas cruz?");
                        int columna_cruz = eleccion.nextInt();
                        tablero_de_juego[fila_cruz][columna_cruz] = 2; // Marca "cruz" en el tablero

                    } else { // Manejo de caso inválido
                        System.out.println("Opción no válida. Por favor escribe 'cara' o 'cruz'.");
                        continue; // Regresa al menú principal
                    }

                    // Imprimir el estado actual del tablero
                    System.out.println("Estado actual del tablero:");
                    for (int i = 0; i < tablero_de_juego.length; i++) {
                        for (int j = 0; j < tablero_de_juego[i].length; j++) {
                            System.out.print(tablero_de_juego[i][j] + " ");
                        }
                        System.out.println(); // Salto de línea después de cada fila
                    }
                    break;
                }
                case 2: {
                    System.out.println("Gracias por jugar!");
                    jugando = false; // Finaliza el bucle
                    break;
                }
                default: {
                    System.out.println("Opción no válida. Por favor escribe '1' o '2'.");
                    break;
                }
            }
        }

        eleccion.close(); // Cerramos Scanner fuera del bucle para liberar recursos
        System.out.println("Estado actual del tablero:");
        for (int i = 0; i < tablero_de_juego.length; i++) {
            for (int j = 0; j < tablero_de_juego[0].length; j++) {
                System.out.print(tablero_de_juego[i][j] + " ");
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }

}

