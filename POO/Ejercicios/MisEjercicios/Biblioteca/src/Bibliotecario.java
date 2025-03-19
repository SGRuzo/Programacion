class Bibliotecario extends Empleado {
    String turno;

    // Constructor del bibliotecario
    public Bibliotecario(String nombre, String idEmpleado, String turno) {
        super(nombre, idEmpleado, "Bibliotecario");
        this.turno = turno;
    }

    // Sobrecarga del metodo realizarAccion para el bibliotecario
    @Override
    public void realizarAccion() {
        System.out.println("El bibliotecario " + nombre + " está gestionando los préstamos.");
    }

    // Metodo para gestionar un préstamo de libro
    public void gestionarPrestamo(Libro libro, Usuario usuario) {
        usuario.prestarLibro(libro);
    }

    // Metodo para gestionar la devolución de un libro
    public void gestionarDevolucion(Libro libro, Usuario usuario) {
        usuario.devolverLibro(libro);
    }

    // Mostrar información del bibliotecario
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();  // Llama al metodo de la clase base
        System.out.println("Turno: " + turno);
    }
}
