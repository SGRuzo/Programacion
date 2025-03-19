// La clase Miembros es ABSTRACTA, lo que significa que no se puede instanciar directamente.
// Solo puede ser usada como una "plantilla" para que otras clases hereden sus atributos y métodos.
public abstract class Miembros {
    // Atributos privados (solo accesibles dentro de esta clase)
    private String dni;          // Documento Nacional de Identidad
    private String nombre;       // Nombre del miembro
    private String direccion;    // Dirección del miembro
    private String provincia;    // Provincia donde vive el miembro
    private String dataIngreso;  // Fecha en la que ingresó a la asociación
    private double caja = 0;     // Caja o saldo de dinero de la persona en la asociación

    // Constructor de la clase Miembros (se usa para inicializar los datos cuando se crea un objeto de esta clase o de una clase hija)
    public Miembros(String dni, String nombre, String direccion, String provincia, String dataIngreso) {
        // Se asignan los valores a los atributos mediante los setters
        this.setDni(dni);
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setProvincia(provincia);
        this.setDataIngreso(dataIngreso);
    }

    // Metodo abstracto: las clases que hereden de Miembros deben implementar este método
    public abstract String aCadea();

    // Métodos GET: devuelven el valor de los atributos privados
    public String getDni() {
        return dni;
    }

    // Metodo para modificar la caja (saldo de dinero)
    public void modificarCaja(double cantidad) {
        caja += cantidad;
    }

    // Metodo SET para asignar un valor al DNI con validación de letra
    public void setDni(String dni) {
        // Extraemos la letra del DNI (último carácter)
        char letra = dni.charAt(8);

        // Extraemos los números del DNI (primeros 8 caracteres)
        dni = dni.substring(0, 8);
        int dninumeros = Integer.parseInt(dni); // Convertimos los números de String a int

        // Verificamos si el número es válido
        if (dninumeros > 0 && dninumeros <= 99999999) {
            // Calculamos la letra correspondiente al número
            char letraValida = 0;
            int letrap = dninumeros % 23;
            switch (letrap) {
                case 0 -> letraValida = 'T';
                case 1 -> letraValida = 'R';
                case 2 -> letraValida = 'W';
                case 3 -> letraValida = 'A';
                case 4 -> letraValida = 'G';
                case 5 -> letraValida = 'M';
                case 6 -> letraValida = 'Y';
                case 7 -> letraValida = 'F';
                case 8 -> letraValida = 'P';
                case 9 -> letraValida = 'D';
                case 10 -> letraValida = 'X';
                case 11 -> letraValida = 'B';
                case 12 -> letraValida = 'N';
                case 13 -> letraValida = 'J';
                case 14 -> letraValida = 'Z';
                case 15 -> letraValida = 'S';
                case 16 -> letraValida = 'Q';
                case 17 -> letraValida = 'V';
                case 18 -> letraValida = 'H';
                case 19 -> letraValida = 'L';
                case 20 -> letraValida = 'C';
                case 21 -> letraValida = 'K';
                case 22 -> letraValida = 'E';
            }

            // Verificamos si la letra ingresada coincide con la calculada
            if (letra == letraValida) {
                this.dni = dni + letra; // Se asigna el DNI válido
            } else {
                System.out.println("La letra no es válida.");
            }
        } else {
            System.out.println("El número no es válido.");
        }
    }

    // Métodos GET y SET para los demás atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDataIngreso() {
        return dataIngreso;
    }

    // Validación del formato de la fecha antes de asignarla
    public void setDataIngreso(String dataIngreso) {
        if (dataIngreso.matches("\\d{2}/\\d{2}/\\d{4}")) {
            this.dataIngreso = dataIngreso;
        } else {
            System.out.println("La fecha no es válida.");
        }
    }
}
