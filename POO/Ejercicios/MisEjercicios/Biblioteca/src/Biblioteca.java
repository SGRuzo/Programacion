import java.util.ArrayList;

class Biblioteca {
    ArrayList<Libro> libros;
    ArrayList<Usuario> usuarios;
    ArrayList<Empleado> empleados;

    public Biblioteca() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
        empleados = new ArrayList<>();
    }

    // Metodo para agregar un libro
    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro " + libro.titulo + " agregado a la biblioteca.");
    }

    // Metodo para eliminar un libro
    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
        System.out.println("Libro " + libro.titulo + " eliminado de la biblioteca.");
    }

    // Metodo para buscar un libro por título
    public void buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.titulo.equalsIgnoreCase(titulo)) {
                libro.mostrarInformacion();
                return;
            }
        }
        System.out.println("No se encontró el libro con título: " + titulo);
    }

    // Metodo para registrar un usuario
    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario " + usuario.nombre + " registrado en la biblioteca.");
    }

    // Metodo para agregar un empleado
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado " + empleado.nombre + " agregado.");
    }
}
