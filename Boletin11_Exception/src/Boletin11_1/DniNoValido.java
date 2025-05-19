package Boletin11_1;

// Esta clase define una excepción personalizada para cuando el DNI no es válido.
// Extiende la clase Exception, por lo que se puede "lanzar" como cualquier excepción.
class DniNonValido extends Exception {
    public DniNonValido(String mensaxe) {
        super(mensaxe);
    }
}
