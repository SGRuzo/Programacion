import java.util.List;
import java.util.ArrayList;

public class ClienteR {
    private String nombre; // Nombre del cliente.
    private String id; // ID único del cliente.
    private List<PedidoR> historialPedidos; // Lista de pedidos realizados por el cliente.

    // Constructor del cliente. Inicializa la lista de historial de pedidos.
    public ClienteR(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.historialPedidos = new ArrayList<>();
    }

    // Metodo para ver el menú del restaurante (mostrará la lista de platos disponibles).
    public void verMenu(Menú menu) {
        menu.mostrarMenu();
    }

    // Metodo para realizar un pedido, que agrega un pedido al historial.
    public void realizarPedido(PedidoR pedido) {
        historialPedidos.add(pedido); // Añade el pedido a la lista de historial.
        System.out.println(nombre + " ha realizado un nuevo pedido.");
    }

    // Metodo para calificar la comida.
    public void calificarComida(int calificacion) {
        System.out.println(nombre + " ha calificado la comida con: " + calificacion + "/5");
    }

    // Metodo para calificar el servicio recibido.
    public void calificarServicio(int calificacion) {
        System.out.println(nombre + " ha calificado el servicio con: " + calificacion + "/5");
    }

    // Metodo para cancelar un pedido, si aún no ha sido preparado.
    public void cancelarPedido(PedidoR pedido) {
        if (pedido.getEstado() == EstadoPedido.PENDIENTE) {
            pedido.cancelarPedido(); // Cancela el pedido si está pendiente.
            System.out.println("El pedido de " + nombre + " ha sido cancelado.");
        } else {
            System.out.println("No se puede cancelar el pedido, ya ha sido preparado.");
        }
    }
}
