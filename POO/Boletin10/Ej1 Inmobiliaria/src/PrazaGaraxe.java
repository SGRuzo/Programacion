public class PrazaGaraxe extends Inmueble { // Hereda las caracteristicas de Inmueble

    // Enum para definir el tipo de plaza (puede ser un trastero o una bodega)
    public enum Tipo {
        ADEGA, TRASTERO
    }

    private int numeroPlaza; // Número de la plaza de garaje
    private Tipo tipo; // Tipo de plaza

    // Constructor para crear una plaza de garaje
    public PrazaGaraxe(String calle, int numero, String localidad, double precio, TipoServicio tipoServicio, int numeroPlaza, Tipo tipo) {
        super(calle, numero, localidad, precio, tipoServicio); // Llamamos al constructor de Inmueble
        this.numeroPlaza = numeroPlaza;
        this.tipo = tipo;
    }

    // Metodos para obtener y modificar el número de praza
    public int getNumeroPraza() { return numeroPlaza; }
    public void setNumeroPraza(int numeroPlaza) { this.numeroPlaza = numeroPlaza; }

    public Tipo getTipo() { return tipo; }

    // Metodo para mostrar información de la plaza de garaje
    @Override // Le dice a Java que estamos redefiniendo el metodo de la clase padre.
    public String toString() {
        return super.toString() + ", número de plaza: " + numeroPlaza + ", tipo: " + tipo;
    }

    // Metodo para calcular la ganancia
    @Override // Le dice a Java que estamos redefiniendo el metodo de la clase padre.
    public double calcularGanancia() {
        return (getTipoServicio() == TipoServicio.VENTA) ? getPrecio() * 0.3 : getPrecio();
    }
}
