// La clase base Empleado tiene atributos comunes a todos los empleados.
abstract class EmpleadoR {
    protected String nombre; // Nombre del empleado.
    protected String id; // ID del empleado.
    protected String puesto; // Puesto del empleado.

    public EmpleadoR(String nombre, String id, String puesto) {
        this.nombre = nombre;
        this.id = id;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    // Metodo abstracto que las subclases deben implementar para asignar tareas.
    public abstract void asignarTareas(String tarea);
}

// Subclase Camarero hereda de Empleado.
class Camarero extends EmpleadoR {
    public Camarero(String nombre, String id) {
        super(nombre, id, "Camarero");
    }

    @Override
    public void asignarTareas(String tarea) {
        System.out.println("El camarero " + nombre + " tiene la tarea de: " + tarea);
    }
}

// Subclase Cocinero hereda de Empleado.
class Cocinero extends EmpleadoR {
    public Cocinero(String nombre, String id) {
        super(nombre, id, "Cocinero");
    }

    @Override
    public void asignarTareas(String tarea) {
        System.out.println("El cocinero " + nombre + " tiene la tarea de: " + tarea);
    }
}

// Subclase Gerente hereda de Empleado.
class Gerente extends EmpleadoR {
    public Gerente(String nombre, String id) {
        super(nombre, id, "Gerente");
    }

    @Override
    public void asignarTareas(String tarea) {
        System.out.println("El gerente " + nombre + " tiene la tarea de: " + tarea);
    }
}
