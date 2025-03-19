class Empleado {
    // Atributos comunes de todos los empleados
    String nombre;
    String idEmpleado;
    String puesto;

    // Constructor para inicializar la clase Empleado
    public Empleado(String nombre, String idEmpleado, String puesto) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.puesto = puesto;
    }

    // Metodo para mostrar información básica del empleado
    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre + ", ID: " + idEmpleado + ", Puesto: " + puesto);
    }

    // Metodo común para realizar la acción asignada al empleado
    public void realizarAccion() {
        System.out.println("Empleado realizando acciones.");
    }
}
