package Boletin12_4;
import java.io.*;
import java.util.*;

public class XestorTarefas {

    static List<Tarefa> tarefas = new ArrayList<>();
    static final String FICHEIRO = "tarefas.dat";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cargarTarefas();

        int opcion;
        do {
            // ✅ Menú principal
            System.out.println("--- XESTOR DE TAREFAS ---");
            System.out.println("1. Engadir tarefa");
            System.out.println("2. Borrar tarefa");
            System.out.println("3. Modificar tarefa");
            System.out.println("4. Listar tarefas");
            System.out.println("0. Gardar e saír");
            System.out.print("Escolle unha opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpamos o salto de liña

            switch (opcion) {
                case 1 -> engadirTarefa(sc);
                case 2 -> borrarTarefa(sc);
                case 3 -> modificarTarefa(sc);
                case 4 -> listarTarefas();
                case 0 -> gardarTarefas();
                default -> System.out.println("Opción non válida.");
            }
        } while (opcion != 0);

        sc.close();
    }

    // Engadir unha nova tarefa
    public static void engadirTarefa(Scanner sc) {
        System.out.print("Data (aaaa-mm-dd): ");
        String data = sc.nextLine();
        System.out.print("Hora (hh:mm): ");
        String hora = sc.nextLine();
        System.out.print("Duración (min): ");
        int duracion = sc.nextInt(); sc.nextLine();
        System.out.print("Nome da tarefa: ");
        String nome = sc.nextLine();
        System.out.print("Descrición: ");
        String descricion = sc.nextLine();
        System.out.print("Está feita? (true/false): ");
        boolean feita = sc.nextBoolean(); sc.nextLine();

        Tarefa nova = new Tarefa(data, hora, duracion, nome, descricion, feita);
        tarefas.add(nova);
        System.out.println("✅ Tarefa engadida!");
    }

    // Listar todas as tarefas
    public static void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Non hai tarefas gardadas.");
            return;
        }

        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println("ID: " + i);
            System.out.println(tarefas.get(i));
        }
    }

    // Borrar unha tarefa por ID
    public static void borrarTarefa(Scanner sc) {
        listarTarefas();
        System.out.print("Introduce o ID da tarefa que queres borrar: ");
        int id = sc.nextInt(); sc.nextLine();
        if (id >= 0 && id < tarefas.size()) {
            tarefas.remove(id);
            System.out.println("✅ Tarefa borrada.");
        } else {
            System.out.println("ID incorrecto.");
        }
    }

    // Modificar unha tarefa existente
    public static void modificarTarefa(Scanner sc) {
        listarTarefas();
        System.out.print("ID da tarefa a modificar: ");
        int id = sc.nextInt(); sc.nextLine();
        if (id >= 0 && id < tarefas.size()) {
            Tarefa t = tarefas.get(id);

            System.out.print("Nova data (aaaa-mm-dd) [" + t.getData() + "]: ");
            String novaData = sc.nextLine();
            if (!novaData.isEmpty()) t.setData(novaData);

            System.out.print("Nova hora (hh:mm) [" + t.getHora() + "]: ");
            String novaHora = sc.nextLine();
            if (!novaHora.isEmpty()) t.setHora(novaHora);

            System.out.print("Nova duración (min) [" + t.getDuracion() + "]: ");
            String novaDuracion = sc.nextLine();
            if (!novaDuracion.isEmpty()) t.setDuracion(Integer.parseInt(novaDuracion));

            System.out.print("Novo nome [" + t.getNome() + "]: ");
            String novoNome = sc.nextLine();
            if (!novoNome.isEmpty()) t.setNome(novoNome);

            System.out.print("Nova descrición [" + t.getDescripcion() + "]: ");
            String novaDescricion = sc.nextLine();
            if (!novaDescricion.isEmpty()) t.setDescripcion(novaDescricion);

            System.out.print("Feita? (true/false) [" + t.isFeita() + "]: ");
            String novoEstado = sc.nextLine();
            if (!novoEstado.isEmpty()) t.setFeita(Boolean.parseBoolean(novoEstado));

            System.out.println("✅ Tarefa modificada.");
        } else {
            System.out.println("ID non válido.");
        }
    }

    // Gardar todas as tarefas no ficheiro binario
    public static void gardarTarefas() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FICHEIRO))) {
            oos.writeObject(tarefas);
            System.out.println("✅ Tarefas gardadas en " + FICHEIRO);
        } catch (IOException e) {
            System.err.println("Erro ao gardar tarefas: " + e.getMessage());
        }
    }

    // Cargar tarefas ao iniciar o programa
    @SuppressWarnings("unchecked")
    public static void cargarTarefas() {
        File f = new File(FICHEIRO);
        if (f.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
                tarefas = (List<Tarefa>) ois.readObject();
                System.out.println("📂 Tarefas cargadas desde " + FICHEIRO);
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Erro ao cargar tarefas: " + e.getMessage());
            }
        }
    }
}
