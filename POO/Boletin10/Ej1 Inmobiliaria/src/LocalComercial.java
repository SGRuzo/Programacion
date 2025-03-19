public class LocalComercial extends Inmueble { // Hereda las caracteristicas de Inmueble

    // Enum para definir si el local está acondicionado o no
    public enum Tipo {
        SI_ACONDICIONADO, NO_ACONDICIONADO
    }

    private Tipo tipo; // Tipo de local comercial

    // Constructor para crear un local comercial
    public LocalComercial(String calle, int numero, String localidad, double precio, TipoServicio tipoServicio, Tipo tipo) {
        super(calle, numero, localidad, precio, tipoServicio); // Llamamos al constructor de Inmueble
        this.tipo = tipo;
    }

    // Metodo para obtener el tipo de local
    public Tipo getTipo() { return tipo; }

    // Metodo para mostrar información del local comercial
    @Override // Le dice a Java que estamos redefiniendo el metodo de la clase padre.
    public String toString() {
        return super.toString() + ", tipo de local: " + tipo;
    }

    // Metodo para calcular la ganancia
    @Override // Le dice a Java que estamos redefiniendo el metodo de la clase padre.
    public double calcularGanancia() {
        return (getTipoServicio() == TipoServicio.VENTA) ? getPrecio() * 0.3 : getPrecio();
    }
}