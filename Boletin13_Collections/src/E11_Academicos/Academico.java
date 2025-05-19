package E11_Academicos;

// Clase Academico que representa a un membro da academia
class Academico implements Comparable<Academico> {
    private String nome;
    private int anoIngreso;

    public Academico(String nome, int anoIngreso) {
        this.nome = nome;
        this.anoIngreso = anoIngreso;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoIngreso() {
        return anoIngreso;
    }

    // Implementamos a orde natural por nome (alfabético)
    @Override
    public int compareTo(Academico outro) {
        return this.nome.compareToIgnoreCase(outro.nome);
    }

    @Override
    public String toString() {
        return String.format("%s (%d)", nome, anoIngreso);
    }
}