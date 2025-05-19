package Boletin11_2;

// Esta clase será una excepción personalizada para datos de fecha incorrectos.
// No es 'public' para que se pueda compilar tudo junto en un solo archivo como 'Main.java'.
class FormatoDataErroneo extends Exception {
    public FormatoDataErroneo(String mensaxe) {
        super(mensaxe); // Llamamos al constructor de Exception con el mensaje de error.
    }
}