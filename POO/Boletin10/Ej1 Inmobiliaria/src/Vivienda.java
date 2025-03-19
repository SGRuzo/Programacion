public class Vivienda extends Inmueble { // Hereda las caracteristicas de Inmueble

    private int numeroHabitaciones; // Número de habitaciones en la vivienda
    private String observaciones; // Comentarios adicionales

    // Constructor para crear una vivienda
    public Vivienda(String calle, int numero, String localidad, double precio, TipoServicio tipoServicio, int numeroHabitaciones, String observaciones) {
        super(calle, numero, localidad, precio, tipoServicio);
        this.numeroHabitaciones = numeroHabitaciones;
        this.observaciones = observaciones;
    }

    // Metodos para obtener y modificar los atributos
    public int getNumeroHabitaciones() { return numeroHabitaciones; }
    public void setNumeroHabitaciones(int numeroHabitaciones) { this.numeroHabitaciones = numeroHabitaciones; }

    public String getObservaciones() { return observaciones; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }

    // Metodo para mostrar información de la vivienda
    @Override // Le dice a Java que estamos redefiniendo el metodo de la clase padre.
    public String toString() {
        return super.toString() + ", habitaciones: " + numeroHabitaciones + ", observaciones: " + observaciones;
    }

    // Metodo para calcular la ganancia
    @Override // Le dice a Java que estamos redefiniendo el metodo de la clase padre.
    public double calcularGanancia() {
        return (getTipoServicio() == TipoServicio.VENTA) ? getPrecio() * 0.2 : getPrecio();
    }
}