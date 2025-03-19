public class Main {
    public static void main(String[] args) {
        // 🔹 Creamos objetos de cada tipo de inmueble y los mostramos en pantalla

        PrazaGaraxe p1 = new PrazaGaraxe("Calle 1", 20, "Madrid", 100, Inmueble.TipoServicio.ALQUILER, 1, PrazaGaraxe.Tipo.ADEGA);
        System.out.println(p1.toString());
        System.out.println("Ganancia: " + p1.calcularGanancia());

        LocalComercial l1 = new LocalComercial("Calle 2", 50, "Barcelona", 200, Inmueble.TipoServicio.ALQUILER, LocalComercial.Tipo.SI_ACONDICIONADO);
        System.out.println(l1.toString());
        System.out.println("Ganancia: " + l1.calcularGanancia());

        Vivienda v1 = new Vivienda("Calle 3", 100, "Sevilla", 300, Inmueble.TipoServicio.VENTA, 3, "Con jardín");
        System.out.println(v1.toString());
        System.out.println("Ganancia: " + v1.calcularGanancia());
    }
}