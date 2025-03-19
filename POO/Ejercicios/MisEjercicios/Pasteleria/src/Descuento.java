public interface Descuento {
    double aplicarDescuento(double precio);

    // Metodo para aplicar un descuento combinado (puedes tener un descuento porcentual y uno fijo)
    default double aplicarDescuentoCombinado(double precio, double descuentoFijo, double descuentoPorcentaje) {
        double precioConDescuentoFijo = precio - descuentoFijo;
        return precioConDescuentoFijo - (precioConDescuentoFijo * descuentoPorcentaje / 100);
    }
}
