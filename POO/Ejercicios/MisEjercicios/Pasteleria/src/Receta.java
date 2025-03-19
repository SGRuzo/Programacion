import java.util.ArrayList;

// Clase que representa una receta en la pastelería
public class Receta {
    // Atributos de la clase Receta
    private String nombre; // El nombre de la receta
    private ArrayList<Ingrediente> ingredientes; // Lista que guarda los ingredientes de la receta

    // Constructor de la clase Receta: se llama cuando se crea una nueva receta
    public Receta(String nombre) {
        this.nombre = nombre; // Asigna el nombre de la receta al atributo 'nombre'
        this.ingredientes = new ArrayList<>(); // Crea una lista vacía para almacenar los ingredientes
    }

    // Metodo para agregar un ingrediente a la receta
    public void agregarIngrediente(String nombreIngrediente, double cantidad) {
        // Creamos un nuevo objeto Ingrediente con el nombre y la cantidad
        Ingrediente nuevoIngrediente = new Ingrediente(nombreIngrediente, cantidad);
        ingredientes.add(nuevoIngrediente); // Añadimos el ingrediente a la lista
    }

    // Metodo para calcular el costo total de la receta basándose en los ingredientes y sus precios
    public double calcularPrecio(ArrayList<Ingrediente> ingredientesDisponibles) {
        double precioTotal = 0.0; // Inicializamos el precio total a 0

        // Recorremos todos los ingredientes de la receta
        for (Ingrediente ingrediente : ingredientes) {
            String nombreIngrediente = ingrediente.getNombre(); // El nombre del ingrediente
            double cantidad = ingrediente.getCantidad(); // La cantidad de ese ingrediente en la receta

            // Buscamos el ingrediente en la lista de ingredientes disponibles
            Ingrediente ingredienteDisponible = buscarIngrediente(nombreIngrediente, ingredientesDisponibles);
            if (ingredienteDisponible != null) {
                // Si el ingrediente está disponible, calculamos su costo y lo añadimos al precio total
                precioTotal += ingredienteDisponible.calcularCosto(cantidad);
            }
        }
        return precioTotal; // Devolvemos el costo total de la receta
    }

    // Metodo para buscar un ingrediente en la lista de ingredientes disponibles
    private Ingrediente buscarIngrediente(String nombre, ArrayList<Ingrediente> ingredientesDisponibles) {
        for (Ingrediente ingrediente : ingredientesDisponibles) {
            if (ingrediente.getNombre().equals(nombre)) {
                return ingrediente; // Si encontramos el ingrediente, lo devolvemos
            }
        }
        return null; // Si no encontramos el ingrediente, devolvemos null
    }

    // Metodo para obtener la cantidad de un ingrediente específico en la receta
    public double obtenerCantidadIngrediente(String ingredienteNombre) {
        for (Ingrediente ingrediente : ingredientes) {
            if (ingrediente.getNombre().equals(ingredienteNombre)) {
                return ingrediente.getCantidad(); // Devuelve la cantidad si el ingrediente existe
            }
        }
        return 0.0; // Si el ingrediente no existe, devuelve 0.0
    }

    // Metodo para modificar la cantidad de un ingrediente en la receta
    public void modificarIngrediente(String ingredienteNombre, double nuevaCantidad) {
        for (Ingrediente ingrediente : ingredientes) {
            if (ingrediente.getNombre().equals(ingredienteNombre)) {
                ingrediente.setCantidad(nuevaCantidad); // Actualiza la cantidad del ingrediente
            }
        }
    }

    // Metodo para mostrar la información de la receta como texto
    @Override
    public String toString() {
        return "Receta: " + nombre + ", Ingredientes: " + ingredientes;
    }
}
