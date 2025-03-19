class Administrador extends Empleado {

    // Constructor del administrador
    public Administrador(String nombre, String idEmpleado) {
        super(nombre, idEmpleado, "Administrador");
    }

    // Sobrecarga del metodo realizarAccion para el administrador
    @Override
    public void realizarAccion() {
        System.out.println("El administrador " + nombre + " está gestionando los libros.");
    }

    // Metodo para agregar un libro a la biblioteca
    public void agregarLibro(Libro libro) {
        System.out.println("Libro " + libro.titulo + " agregado exitosamente a la biblioteca.");
    }

    // Metodo para eliminar un libro de la biblioteca
    public void eliminarLibro(Libro libro) {
        System.out.println("Libro " + libro.titulo + " eliminado de la biblioteca.");
    }

    // Mostrar información del administrador
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();  // Llama al metodo de la clase base
        System.out.println("Este empleado tiene permisos para gestionar libros.");
    }
}
