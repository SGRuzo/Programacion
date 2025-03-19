public abstract class Inmueble {  // esta clase NO se puede instanciar directamente.

    // Características de cada inmueble
    private String calle;
    private int numero;
    private String localidad;
    private double precio;

    // El inmueble está en venta o en alquiler
    public enum TipoServicio {
        VENTA, ALQUILER
    }
    private TipoServicio tipoServicio;

    // Constructor para CREAR objetos y asignar valores iniciales
    public Inmueble(String calle, int numero, String localidad, double precio, TipoServicio tipoServicio) {
        this.calle = calle;
        this.numero = Math.abs(numero); // Si el número es negativo, lo hace positivo
        this.localidad = localidad;
        this.precio = Math.abs(precio); // Si el precio es negativo, lo hace positivo
        this.tipoServicio = tipoServicio;
    }

    // Métodos (funciones que nos permiten acceder y modificar los atributos)
    public String getCalle() { return calle; }
    public void setCalle(String calle) { this.calle = calle; }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = Math.abs(numero); }

    public String getLocalidad() { return localidad; }
    public void setLocalidad(String localidad) { this.localidad = localidad; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = Math.abs(precio); }

    public TipoServicio getTipoServicio() { return tipoServicio; }
    public void setTipoServicio(TipoServicio tipoServicio) { this.tipoServicio = tipoServicio; }

    // Metodo para mostrar información del inmueble
    @Override
    public String toString() {
        String estado = (tipoServicio == TipoServicio.VENTA) ? "venta" : "alquiler";
        return "El inmueble en " + calle + " " + numero + ", " + localidad +
                " tiene un precio de " + precio + " en estado de " + estado;
    }

    // Metodo abstracto (todas las clases que hereden de Inmueble deben implementarlo)
    public abstract double calcularGanancia();
}