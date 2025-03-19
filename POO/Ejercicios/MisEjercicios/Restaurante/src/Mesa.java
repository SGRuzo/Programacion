import java.util.ArrayList;

// La clase Mesa representa una mesa en el restaurante.
public class Mesa implements Reservable {
    private int numero; // Número de la mesa.
    private EstadoMesa estado; // Estado de la mesa: DISPONIBLE, OCUPADA, RESERVADA.
    private List<PedidoR> pedidos; // Lista de pedidos de esta mesa.

    public Mesa(int numero) {
        this.numero = numero;
        this.estado = EstadoMesa.DISPONIBLE; // Al principio la mesa está disponible.
        this.pedidos = new ArrayList<>();
    }
    enum EstadoMesa {
        DISPONIBLE,
        OCUPADA,
        RESERVADA
    }

    // Metodo para obtener el número de la mesa.
    public int getNumero() {
        return numero;
    }

    // Metodo para obtener el estado de la mesa.
    public EstadoMesa getEstado() {
        return estado;
    }

    // Implementación del metodo de la interfaz Reservable para reservar la mesa.
    @Override
    public void reservar(String hora) {
        this.estado = EstadoMesa.RESERVADA; // Cambiamos el estado de la mesa a reservada.
        System.out.println("Mesa " + numero + " reservada a las " + hora);
    }

    // Implementación del metodo de la interfaz Reservable para cancelar la reserva de la mesa.
    @Override
    public void cancelarReserva() {
        this.estado = EstadoMesa.DISPONIBLE; // Cambiamos el estado de la mesa a disponible.
        System.out.println("Reserva de la mesa " + numero + " cancelada.");
    }

    // Metodo para actualizar el estado de la mesa (ocuparla o liberarla).
    public void actualizarEstado(EstadoMesa nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("El estado de la mesa " + numero + " ahora es: " + nuevoEstado);
    }
}
