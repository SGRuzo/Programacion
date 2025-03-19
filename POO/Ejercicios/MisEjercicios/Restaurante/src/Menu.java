import java.util.List;
import java.util.ArrayList;

public class Menu {
    private List<Plato> platos; // Lista de platos disponibles en el menú.

    // Constructor para inicializar el menú con una lista de platos.
    public Menu() {
        platos = new ArrayList<>();
    }

    // Metodo para añadir un plato al menú.
    public void añadirPlato(Plato plato) {
        platos.add(plato);
        System.out.println("Plato " + plato.getNombre() + " añadido al menú.");
    }

    // Metodo para eliminar un plato del menú.
    public void eliminarPlato(Plato plato) {
        platos.remove(plato);
        System.out.println("Plato " + plato.getNombre() + " eliminado del menú.");
    }

    // Metodo para mostrar el menú con todos los platos.
    public void mostrarMenu() {
        System.out.println("Menú del restaurante:");
        for (Plato plato : platos) {
            plato.mostrarInformacion();
        }
    }

    // Metodo para buscar un plato por nombre.
    public Plato buscarPlato(String nombre) {
        for (Plato plato : platos) {
            if (plato.getNombre().equalsIgnoreCase(nombre)) {
                return plato;
            }
        }
        System.out.println("Plato no encontrado.");
        return null;
    }
}
