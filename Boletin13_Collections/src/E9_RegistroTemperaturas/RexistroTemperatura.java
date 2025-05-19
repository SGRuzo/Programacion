package E9_RegistroTemperaturas;
import java.io.Serializable;
import java.time.LocalTime;

// Clase que representa un rexistro de temperatura
class RexistroTemperatura implements Serializable {
    private double temperatura;   // Temperatura rexistrada
    private LocalTime hora;       // Hora do rexistro

    // Constructor que asigna a temperatura e a hora actual
    public RexistroTemperatura(double temperatura) {
        this.temperatura = temperatura;
        this.hora = LocalTime.now(); // Hora no momento de rexistrar
    }

    // Metodo para mostrar os datos dun rexistro como texto
    public String toString() {
        return String.format("Temperatura: %.2f ºC, Hora: %s", temperatura, hora);
    }

    // Getters necesarios para calcular estatísticas
    public double getTemperatura() {
        return temperatura;
    }
}