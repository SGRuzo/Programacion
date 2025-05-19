package E11_Academicos;

import java.util.*;

public class RealAcademia {

    // Metodo que comproba se a letra é do abecedario español
    public static boolean letraValida(Character letra) {
        // Letras do abecedario español (sen ñ)
        return Character.isLetter(letra); // verifica se é unha letra
    }

    // Metodo que tenta engadir un novo académico á academia
    static boolean nuevoAcademico(Map<Character, Academico> academia, Academico novo, Character letra) {
        if (!letraValida(letra)) {
            System.out.println("A letra '" + letra + "' non é válida.");
            return false;
        }

        if (academia.containsKey(letra)) {
            System.out.println("O sillón '" + letra + "' xa está ocupado.");
            return false;
        }

        academia.put(letra, novo);
        System.out.println(" Engadido " + novo.getNome() + " no sillón '" + letra + "'");
        return true;
    }

    public static void main(String[] args) {
        // Creamos un mapa de académicos, clave = letra, valor = académico
        Map<Character, Academico> academia = new TreeMap<>(); // TreeMap = ordenado por clave

        // Creamos 5 académicos
        Academico a1 = new Academico("Rosa Martínez", 2001);
        Academico a2 = new Academico("Álvaro Pérez", 1999);
        Academico a3 = new Academico("Lucía Gómez", 2010);
        Academico a4 = new Academico("Carlos Ruíz", 2005);
        Academico a5 = new Academico("Beatriz Fernández", 2012);

        // Engadimos usando o metodo novoAcademico
        nuevoAcademico(academia, a1, 'R');
        nuevoAcademico(academia, a2, 'A');
        nuevoAcademico(academia, a3, 'L');
        nuevoAcademico(academia, a4, 'C');
        nuevoAcademico(academia, a5, 'B');

        System.out.println("\nLista de académicos SEN letra (só nomes), ORDENADOS por NOME:");
        List<Academico> listaPorNome = new ArrayList<>(academia.values());
        Collections.sort(listaPorNome); // ordena usando compareTo (nome)
        for (Academico ac : listaPorNome) {
            System.out.println(ac);
        }

        System.out.println("\nLista de académicos SEN letra, ORDENADOS por ANO de ingreso:");
        listaPorNome.sort(Comparator.comparingInt(Academico::getAnoIngreso));
        for (Academico ac : listaPorNome) {
            System.out.println(ac);
        }

        System.out.println("\nLista de académicos CON letra, ORDENADOS por LETRA:");
        for (Map.Entry<Character, Academico> entry : academia.entrySet()) {
            char letra = entry.getKey();
            Academico ac = entry.getValue();
            System.out.printf("Letra '%c' → %s\n", letra, ac);
        }
    }
}