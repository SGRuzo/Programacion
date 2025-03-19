public class Main {
    public static void main(String[] args) {
        // Crear un restaurante
        Restaurante restaurante = new Restaurante();

        // Crear mesas
        Mesa mesa1 = new Mesa(1);
        Mesa mesa2 = new Mesa(2);

        // Crear empleados
        Camarero camarero = new Camarero("Juan", "C001");
        Cocinero cocinero = new Cocinero("Ana", "C002");
        Gerente gerente = new Gerente("Carlos", "G001");

        // Añadir empleados al restaurante
        restaurante.mostrarEmpleados();  // Mostrar empleados

        // Crear cliente y asignarle una mesa
        ClienteR cliente = new ClienteR("Laura", "C003");
        restaurante.asignarMesaACliente(cliente);  // Asigna una mesa disponible

        // Reservar una mesa
        restaurante.reservarMesa(mesa1, cliente, "19:00");
    }
}
