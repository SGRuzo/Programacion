import java.util.ArrayList;

class Usuario {
    // Atributos del usuario
    String nombre;
    String idUsuario;
    ArrayList<Libro> librosPrestados;

    // Constructor del usuario
    public Usuario(String nombre, String idUsuario) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        this.librosPrestados = new ArrayList<>();
    }

    // Metodo para prestar un libro
    public void prestarLibro(Libro libro) {
        if (libro.disponible) {
            librosPrestados.add(libro);
            libro.prestarLibro();  // Cambia la disponibilidad del libro
        } else {
            System.out.println("El libro " + libro.titulo + " no está disponible para préstamo.");
        }
    }

    // Metodo para devolver un libro
    public void devolverLibro(Libro libro) {
        if (librosPrestados.contains(libro)) {
            librosPrestados.remove(libro);
            libro.devolverLibro();  // Cambia la disponibilidad del libro
        } else {
            System.out.println("El libro no ha sido prestado por este usuario.");
        }
    }

    // Metodo para mostrar los libros prestados
    public void mostrarLibrosPrestados() {
        if (librosPrestados.isEmpty()) {
            System.out.println("No tienes libros prestados.");
        } else {
            System.out.println("Libros prestados por " + nombre + ":");
            for (Libro libro : librosPrestados) {
                libro.mostrarInformacion();
            }
        }
    }

    // Metodo para buscar un libro por título
    public void buscarLibroPorTitulo(String titulo) {
        for (Libro libro : librosPrestados) {
            if (libro.titulo.equalsIgnoreCase(titulo)) {
                libro.mostrarInformacion();
                return;
            }
        }
        System.out.println("No se encontró el libro con título: " + titulo);
    }

    // Metodo para mostrar el historial de préstamos
    public void mostrarHistorialPrestamos() {
        System.out.println("Historial de préstamos de " + nombre + ":");
        for (Libro libro : librosPrestados) {
            System.out.println("Título: " + libro.titulo + " | Autor: " + libro.autor);
        }
    }
}
