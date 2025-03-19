public class Plato {
    private String nombre; // Nombre del plato.
    private double precio; // Precio del plato.
    private String tipo; // Tipo de plato: entrada, plato principal, postre.
    private List<String> ingredientes; // Lista de ingredientes del plato.

    // Constructor para inicializar el plato.
    public Plato(String nombre, double precio, String tipo, List<String> ingredientes) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
        this.ingredientes = ingredientes;
    }

    // Metodo para obtener el nombre del plato.
    public String getNombre() {
        return nombre;
    }

    // Metodo para obtener el precio del plato.
    public double getPrecio() {
        return precio;
    }

    // Metodo para mostrar la información del plato.
    public void mostrarInformacion() {
        System.out.println("Plato: " + nombre + " - Precio: " + precio + " - Tipo: " + tipo);
        System.out.println("Ingredientes: " + ingredientes);
    }

    // Metodo para actualizar los ingredientes de un plato.
    public void actualizarIngredientes(List<String> nuevosIngredientes) {
        this.ingredientes = nuevosIngredientes;
        System.out.println("Ingredientes del plato " + nombre + " actualizados.");
    }

    // Metodo para actualizar el precio del plato.
    public void actualizarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
        System.out.println("El precio del plato " + nombre + " ha sido actualizado a: " + nuevoPrecio);
    }
}
