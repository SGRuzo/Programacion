package Boletin11_1;

public class Persoa {
    // Atributos privados: solo accesibles desde dentro de la clase
    private String nome;
    private String direccion;
    private String dni;

    // Constructor: se ejecuta al crear un nuevo objeto de tipo Persoa
    public Persoa(String nome, String direccion, String dni) throws DniNonValido {
        this.nome = nome;             // Asignamos el nombre
        this.direccion = direccion;   // Asignamos la dirección
        setDni(dni);                  // Llamamos al método setDni para validar el DNI
    }

    // Setter para el nombre
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para obtener el nombre
    public String getNome() {
        return nome;
    }

    // Setter para la dirección
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Getter para obtener la dirección
    public String getDireccion() {
        return direccion;
    }

    // Setter para el DNI con validación
    public void setDni(String dni) throws DniNonValido {
        // Validamos que el DNI tenga 8 números seguidos de una letra mayúscula
        if (!dni.matches("\\d{8}[A-Z]")) {
            // Si no cumple el formato, lanzamos una excepción personalizada
            throw new DniNonValido("DNI non válido. Debe ter 8 díxitos e 1 letra maiúscula. Ex: 12345678A");
        }
        this.dni = dni; // Si el formato es correcto, se asigna el valor al atributo
    }

    // Getter para obtener el DNI
    public String getDni() {
        return dni;
    }
}
