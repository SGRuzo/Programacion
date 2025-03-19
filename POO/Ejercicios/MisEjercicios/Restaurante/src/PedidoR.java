import java.util.List;
import java.util.ArrayList;

public class PedidoR {
    private String idPedido; // ID único del pedido.
    private ClienteR cliente; // El cliente que ha realizado el pedido.
    private List<Plato> platos; // Lista de platos que conforman el pedido.
    private EstadoPedido estado; // Estado del pedido (pendiente, en preparación, servido).

    // Constructor para inicializar el pedido con un cliente y una lista de platos.
    public PedidoR(String idPedido, ClienteR cliente) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.platos = new ArrayList<>();
        this.estado = EstadoPedido.PENDIENTE; // El pedido comienza con el estado pendiente.
    }

    // Metodo para agregar un plato al pedido.
    public void agregarPlato(Plato plato) {
        platos.add(plato); // Añade el plato a la lista de platos del pedido.
        System.out.println("Plato " + plato.getNombre() + " agregado al pedido.");
    }

    // Metodo para cambiar el estado del pedido (por ejemplo, de "pendiente" a "en preparación").
    public void cambiarEstado(EstadoPedido nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("El estado del pedido " + idPedido + " ha cambiado a: " + nuevoEstado);
    }

    // Metodo para calcular el total del pedido, sumando el precio de todos los platos.
    public double calcularTotal() {
        double total = 0;
        for (Plato plato : platos) {
            total += plato.getPrecio(); // Suma el precio de cada plato al total.
        }
        return total;
    }

    // Metodo para cancelar el pedido si aún no ha sido servido.
    public void cancelarPedido() {
        if (estado == EstadoPedido.PENDIENTE) {
            estado = EstadoPedido.CANCELADO; // Cambia el estado a cancelado si está pendiente.
            System.out.println("El pedido " + idPedido + " ha sido cancelado.");
        } else {
            System.out.println("El pedido ya no puede ser cancelado.");
        }
    }

    // Metodo para obtener el estado del pedido.
    public EstadoPedido getEstado() {
        return estado;
    }
}
