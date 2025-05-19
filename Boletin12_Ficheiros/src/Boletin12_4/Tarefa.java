package Boletin12_4;
import java.io.Serializable;

// Clase que representa unha tarefa, e implementa Serializable para poder gardarse en ficheiro binario
public class Tarefa implements Serializable {

    private String data;      // Ex: "2025-05-19"
    private String hora;      // Ex: "14:30"
    private int duracion;     // En minutos, ex: 90
    private String nome;      // Nome da tarefa
    private String descripcion;
    private boolean feita;    // true = feita, false = non feita

    // Constructor
    public Tarefa(String data, String hora, int duracion, String nome, String descripcion, boolean feita) {
        this.data = data;
        this.hora = hora;
        this.duracion = duracion;
        this.nome = nome;
        this.descripcion = descripcion;
        this.feita = feita;
    }

    // Metodos getter e setter
    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    public int getDuracion() { return duracion; }
    public void setDuracion(int duracion) { this.duracion = duracion; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public boolean isFeita() { return feita; }
    public void setFeita(boolean feita) { this.feita = feita; }

    // Metodo para mostrar a tarefa como texto
    @Override
    public String toString() {
        return "Tarefa: " + nome +
                "\nData: " + data +
                "\nHora: " + hora +
                "\nDuración: " + duracion + " min" +
                "\nDescrición: " + descripcion +
                "\nEstado: " + (feita ? "Feita" : "Non feita") + "\n";
    }
}