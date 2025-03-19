import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pasteleria {
    private List<Pastel> pasteles;
    private Map<String, Ingrediente> ingredientesDisponibles;

    public Pasteleria() {
        this.pasteles = new ArrayList<>();
        this.ingredientesDisponibles = new HashMap<>();
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientesDisponibles.put(ingrediente.toString(), ingrediente);
    }

    public void crearPastel(Pastel pastel) {
        pasteles.add(pastel);
    }

    // Metodo para eliminar un pastel
    public void eliminarPastel(Pastel pastel) {
        pasteles.remove(pastel);
    }

    // Metodo para verificar si los ingredientes para una receta están disponibles
    public boolean ingredientesDisponibles(Receta receta) {
        for (String ingrediente : receta.ingredientes.keySet())
            if (!ingredientesDisponibles.containsKey(ingrediente)) {
                return false;  // Si falta algún ingrediente, la receta no puede ser producida
            }
        return true;
    }

    // Metodo para mostrar el inventario de ingredientes
    public void mostrarInventario() {
        for (Ingrediente ingrediente : ingredientesDisponibles.values()) {
            System.out.println(ingrediente);
        }
    }

    public double calcularTotal(Descuento descuento) {
        double total = 0.0;
        for (Pastel pastel : pasteles) {
            double precio = pastel.calcularPrecioTotal(ingredientesDisponibles);
            total += descuento.aplicarDescuento(precio);
        }
        return total;
    }
}
