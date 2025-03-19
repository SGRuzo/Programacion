import java.util.List;
import java.util.ArrayList;

// La clase Restaurante gestiona las mesas, los empleados y los clientes.
public class Restaurante {
    // Lista de mesas, empleados y clientes del restaurante.
    private List<Mesa> mesas;
    private List<EmpleadoR> empleados;
    private List<ClienteR> clientes;

    // Constructor para inicializar las listas.
    public Restaurante() {
        mesas = new ArrayList<>();
        empleados = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    // Metodo para reservar una mesa para un cliente.
    public void reservarMesa(Mesa mesa, ClienteR cliente, String hora) {
        // Si la mesa está disponible, se puede reservar.
        if (mesa.getEstado() == EstadoMesa.DISPONIBLE) {
            mesa.reservar(hora); // Llamamos al metodo de la interfaz.
            System.out.println("Reserva confirmada para la mesa " + mesa.getNumero() + " a las " + hora);
        } else {
            System.out.println("La mesa " + mesa.getNumero() + " no está disponible.");
        }
    }

    // Metodo para cancelar una reserva.
    public void cancelarReserva(Mesa mesa) {
        mesa.cancelarReserva();
        System.out.println("Reserva de la mesa " + mesa.getNumero() + " cancelada.");
    }

    // Metodo para mostrar la lista de empleados.
    public void mostrarEmpleados() {
        for (EmpleadoR empleadoR : empleados) {
            System.out.println(empleadoR.getNombre() + " - " + empleadoR.getPuesto());
        }
    }

    // Metodo para buscar una mesa disponible.
    public Mesa buscarMesaDisponible() {
        for (Mesa mesa : mesas) {
            if (mesa.getEstado() == EstadoMesa.DISPONIBLE) {
                return mesa; // Si encontramos una mesa disponible, la devolvemos.
            }
        }
        return null; // Si no hay mesas disponibles, devolvemos null.
    }

    // Metodo para generar un reporte diario del restaurante.
    public void generarReporteDiario() {
        System.out.println("Reporte diario del restaurante:");
        System.out.println("Número de mesas ocupadas: " + mesas.size()); // Número de mesas ocupadas.
        // Aquí podríamos incluir más detalles como ingresos o número de pedidos.
    }

    // Metodo para asignar una mesa a un cliente cuando llega al restaurante.
    public void asignarMesaACliente(ClienteR cliente) {
        Mesa mesa = buscarMesaDisponible(); // Buscamos una mesa disponible.
        if (mesa != null) {
            mesa.setEstado(EstadoMesa.OCUPADA); // Cambiamos el estado de la mesa a ocupada.
            System.out.println("Mesa asignada a " + cliente.getNombre() + " en la mesa " + mesa.getNumero());
        } else {
            System.out.println("No hay mesas disponibles para " + cliente.getNombre());
        }
    }
}
