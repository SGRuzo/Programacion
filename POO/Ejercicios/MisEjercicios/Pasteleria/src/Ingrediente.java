public class Ingrediente {
    private String nombre; // El nombre del ingrediente
    private double cantidad; // La cantidad del ingrediente en la receta

    // Constructor de la clase Ingrediente
    public Ingrediente(String nombre, double cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    // Metodo para obtener el nombre del ingrediente
    public String getNombre() {
        return nombre;
    }

    // Metodo para obtener la cantidad del ingrediente
    public double getCantidad() {
        return cantidad;
    }

    // Metodo para establecer (modificar) la cantidad del ingrediente
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    // Metodo para calcular el costo del ingrediente según su cantidad
    public double calcularCosto(double cantidadUsada) {
        // Supongamos que el precio de cada ingrediente está basado en su cantidad y el costo por unidad
        // Aquí solo hacemos una suposición, en la práctica, deberías agregar el precio por unidad
        double precioPorUnidad = 5.0; // Este es un ejemplo; puedes cambiarlo según el ingrediente
        return cantidadUsada * precioPorUnidad;
    }

    // Metodo para mostrar la información del ingrediente como texto
    @Override
    public String toString() {
        return nombre + ": " + cantidad;
    }
}
