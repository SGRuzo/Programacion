// Clase que representa un pastel específico, que es una receta con un tipo y cantidad específica
public class Pastel extends Receta {
    private String tipo; // Tipo de pastel (por ejemplo, 'Chocolate', 'Vainilla')
    private int cantidad; // Cantidad de pasteles de este tipo a producir

    // Constructor de la clase Pastel
    public Pastel(String nombre, String tipo, int cantidad) {
        super(nombre); // Llama al constructor de la clase padre (Receta)
        this.tipo = tipo; // Asigna el tipo de pastel (ej. 'Chocolate')
        this.cantidad = cantidad; // Asigna la cantidad de pasteles a producir
    }

    // Metodo para calcular el precio total de los pasteles, multiplicando el precio unitario por la cantidad
    public double calcularPrecioTotal(Map<String, Ingrediente> ingredientesDisponibles) {
        double precioUnitario = calcularPrecio(ingredientesDisponibles); // Calcula el precio de la receta
        return precioUnitario * cantidad; // Multiplica por la cantidad de pasteles
    }

    // Metodo para cambiar el tipo de pastel
    public void cambiarTipo(String nuevoTipo) {
        this.tipo = nuevoTipo; // Cambia el tipo de pastel
    }

    // Metodo para aumentar la cantidad de pasteles a producir
    public void aumentarCantidad(int cantidadAdicional) {
        this.cantidad += cantidadAdicional; // Suma la cantidad adicional a la cantidad actual
    }

    // Metodo para mostrar información del pastel como texto
    @Override
    public String toString() {
        return "Pastel: " + super.toString() + ", Tipo: " + tipo + ", Cantidad: " + cantidad;
    }
}
