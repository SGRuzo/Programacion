public class DescuentoFijo implements Descuento {
    private double cantidadDescuento;

    public DescuentoFijo(double cantidadDescuento) {
        this.cantidadDescuento = cantidadDescuento;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return precio - cantidadDescuento;
    }
}
