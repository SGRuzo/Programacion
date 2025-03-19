class Libro {
    // Atributos de la clase Libro
    String titulo;
    String autor;
    String codigoISBN;
    boolean disponible;
    int numPrestamos;

    // Constructor para inicializar el libro con título, autor y código ISBN
    public Libro(String titulo, String autor, String codigoISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigoISBN = codigoISBN;
        this.disponible = true; // Por defecto, el libro está disponible
        this.numPrestamos = 0;  // Inicia el contador de préstamos en 0
    }

    // Metodo para prestar el libro, cambiando la disponibilidad a false
    public void prestarLibro() {
        if (disponible) {
            disponible = false;
            numPrestamos++;  // Incrementa el contador de préstamos
            System.out.println("Libro " + titulo + " prestado exitosamente.");
        } else {
            System.out.println("El libro " + titulo + " no está disponible.");
        }
    }

    // Metodo para devolver el libro, cambiando la disponibilidad a true
    public void devolverLibro() {
        disponible = true;
        System.out.println("Libro " + titulo + " devuelto exitosamente.");
    }

    // Metodo para mostrar información del libro
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", ISBN: " + codigoISBN + ", Disponible: " + disponible + ", Número de préstamos: " + numPrestamos);
    }

    // Metodo para actualizar el título del libro
    public void actualizarTitulo(String nuevoTitulo) {
        this.titulo = nuevoTitulo;
    }
}
