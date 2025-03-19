import java.util.ArrayList;
import java.util.List;

public class Pasteleria {
    // Lista de pasteles que se han creado en la pastelería
    private List<Pastel> pasteles;

    // Lista de ingredientes disponibles en la pastelería
    private List<Ingrediente> ingredientesDisponibles;

    // Constructor de la clase Pasteleria
    public Pasteleria() {
        // Inicializamos la lista de pasteles vacía
        this.pasteles = new ArrayList<>();

        // Inicializamos la lista de ingredientes disponibles vacía
        this.ingredientesDisponibles = new ArrayList<>();
    }

    // Metodo para agregar un ingrediente a la pastelería
    public void agregarIngrediente(Ingrediente ingrediente) {
        // Añadimos el ingrediente a la lista de ingredientes disponibles
        ingredientesDisponibles.add(ingrediente);
    }

    // Metodo para crear un pastel en la pastelería
    public void crearPastel(Pastel pastel) {
        // Añadimos el pastel a la lista de pasteles creados
        pasteles.add(pastel);
    }

    // Metodo para eliminar un pastel de la pastelería
    public void eliminarPastel(Pastel pastel) {
        // Eliminamos el pastel de la lista de pasteles
        pasteles.remove(pastel);
    }

    // Metodo para verificar si los ingredientes necesarios para una receta están disponibles
    public boolean ingredientesDisponibles(Receta receta) {
        // Recorremos cada ingrediente que tiene la receta
        for (Ingrediente ingredienteDeReceta : receta.getIngredientes()) {
            boolean encontrado = false;

            // Comprobamos si el ingrediente de la receta está en la lista de ingredientes disponibles
            for (Ingrediente ingredienteEnInventario : ingredientesDisponibles) {
                // Si el ingrediente de la receta se encuentra en la lista de ingredientes
                if (ingredienteDeReceta.esIgual(ingredienteEnInventario)) {
                    encontrado = true; // Marcamos que se encontró el ingrediente
                    break; // Terminamos el ciclo porque ya encontramos el ingrediente
                }
            }

            // Si no se encuentra un ingrediente, la receta no se puede producir
            if (!encontrado) {
                return false;
            }
        }

        // Si todos los ingredientes se encuentran disponibles, devolvemos true
        return true;
    }

    // Metodo para mostrar todos los ingredientes que tenemos en la pastelería
    public void mostrarInventario() {
        // Recorremos todos los ingredientes y los mostramos por consola
        for (Ingrediente ingrediente : ingredientesDisponibles) {
            System.out.println(ingrediente);  // Imprimimos el ingrediente
        }
    }

    // Metodo para calcular el total de los pasteles con un descuento aplicado
    public double calcularTotal(Descuento descuento) {
        double total = 0.0;  // Inicializamos el total en 0

        // Recorremos todos los pasteles creados
        for (Pastel pastel : pasteles) {
            // Calculamos el precio de cada pastel
            double precio = pastel.calcularPrecioTotal(ingredientesDisponibles);
            // Aplicamos el descuento al precio del pastel y sumamos al total
            total += descuento.aplicarDescuento(precio);
        }

        // Devolvemos el total con el descuento aplicado
        return total;
    }
}
