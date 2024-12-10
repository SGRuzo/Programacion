import java.util.Scanner;
public class TrsEnRaia {

    // Función principal que comienza el juego
    public static void main(String[] args) {
        char[][] tablero = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        // Llamada a la función recursiva que gestionará el turno de cada jugador
        jugar(tablero, 'X');
    }

    // Función recursiva que alterna turnos entre los jugadores
    public static void jugar(char[][] tablero, char jugador) {
        // Imprimir el tablero después de cada jugada
        imprimirTablero(tablero);

        // Verificar si hay un ganador o empate
        if (verificarGanador(tablero)) {
            System.out.println("¡El jugador " + jugador + " ha ganado!");
            return;
        }

        // Verificar si hay empate
        if (tableroLleno(tablero)) {
            System.out.println("¡Es un empate!");
            return;
        }

        // Solicitar y hacer el siguiente movimiento
        hacerMovimiento(tablero, jugador);

        // Cambiar de jugador (si es 'X', pasa a 'O', y viceversa)
        char siguienteJugador = (jugador == 'X') ? 'O' : 'X';

        // Llamada recursiva para el siguiente turno
        jugar(tablero, siguienteJugador);
    }

    // Función para imprimir el tablero
    public static void imprimirTablero(char[][] tablero) {
        System.out.println("Tablero:");
        for (int i = 0; i < 3; i++) {
            System.out.println(tablero[i][0] + " | " + tablero[i][1] + " | " + tablero[i][2]);
            if (i < 2) System.out.println("--+---+--");
        }
        System.out.println();
    }

    // Función que verifica si el tablero está lleno
    public static boolean tableroLleno(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false; // Si encuentra un espacio vacío, el tablero no está lleno
                }
            }
        }
        return true; // Si no encuentra espacios vacíos, el tablero está lleno
    }

    // Función que verifica si hay un ganador
    public static boolean verificarGanador(char[][] tablero) {
        // Verificar filas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2] && tablero[i][0] != ' ') {
                return true;
            }
        }

        // Verificar columnas
        for (int i = 0; i < 3; i++) {
            if (tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i] && tablero[0][i] != ' ') {
                return true;
            }
        }

        // Verificar diagonales
        if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[0][0] != ' ') {
            return true;
        }
        if (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0] && tablero[0][2] != ' ') {
            return true;
        }

        return false; // Si no hay tres símbolos iguales en filas, columnas o diagonales
    }

    // Función para pedir el movimiento al jugador
    public static void hacerMovimiento(char[][] tablero, char jugador) {
        Scanner scanner = new Scanner(System.in);
        int fila, columna;

        // Solicitar al jugador que ingrese una fila y columna
        System.out.println("Jugador " + jugador + ", ingresa tu movimiento (fila y columna entre 0 y 2): ");
        fila = scanner.nextInt();
        columna = scanner.nextInt();

        // Verificar que la posición seleccionada sea válida
        if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ') {
            // Realizar el movimiento
            tablero[fila][columna] = jugador;
        } else {
            // Si la posición es inválida o ya está ocupada, pedir de nuevo el movimiento
            System.out.println("Movimiento inválido, intenta nuevamente.");
            hacerMovimiento(tablero, jugador); // Llamada recursiva para pedir otro movimiento
        }
    }
}
