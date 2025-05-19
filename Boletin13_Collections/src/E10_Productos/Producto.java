package E10_Productos;
import java.io.Serializable;

// Clase que representa un produto da tenda
class Produto implements Serializable {
    private String codigo;       // Código alfanumérico (ID do produto)
    private String nome;        // Nome do produto
    private int cantidade;      // Cantidade en stock

    public Produto(String codigo, String nome, int cantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.cantidade = cantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getCantidade() {
        return cantidade;
    }

    public void setCantidade(int cantidade) {
        this.cantidade = cantidade;
    }

    @Override
    public String toString() {
        return String.format("Código: %s | Nome: %s | Cantidade: %d", codigo, nome, cantidade);
    }
}
