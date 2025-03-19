// Clase Socios que HEREDA de Miembros
public class Socios extends Miembros {
    private double cuota;

    public Socios(String dni, String nombre, String direccion, String provincia, String dataIngreso, double cuota) {
        super(dni, nombre, direccion, provincia, dataIngreso); // Llamamos al constructor de Miembros
        setCuota(cuota);
    }

    // Implementación del metodo abstracto aCadea()
    @Override
    public String aCadea() {
        return getDni() + " " + getNombre() + " " + getDireccion() + " " + getProvincia() + " " + getDataIngreso() + " " + cuota;
    }

    public void setCuota(double cuota) {
        if (cuota >= 0) {
            this.cuota = cuota;
        } else {
            System.out.println("La cuota no es válida.");
        }
    }

    public double getCuota() {
        return cuota;
    }
}