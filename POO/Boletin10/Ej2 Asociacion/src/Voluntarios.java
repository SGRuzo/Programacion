// Clase Voluntarios que HEREDA de Miembros e IMPLEMENTA la interfaz Gastos
public class Voluntarios extends Miembros implements Gastos {
    private int edad;
    private String ocupacion;
    private int horas;

    public Voluntarios(String dni, String nombre, String direccion, String provincia, String dataIngreso, int edad, String ocupacion, int horas) {
        super(dni, nombre, direccion, provincia, dataIngreso);
        this.edad = edad;
        this.ocupacion = ocupacion;
        setHoras(horas);
    }

    @Override
    public String aCadea() {
        return getDni() + " " + getNombre() + " " + getDireccion() + " " + getProvincia() + " " + getDataIngreso() + " " + edad + " " + ocupacion + " " + horas;
    }

    public void setHoras(int horas) {
        if (horas >= 0 && horas <= 40) {
            this.horas = horas;
        } else {
            System.out.println("Las horas no son válidas.");
        }
    }

    @Override
    public double calcularGastos() {
        return -3;
    }
}