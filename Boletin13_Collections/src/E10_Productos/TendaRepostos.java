package E10_Productos;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TendaRepostos {
    private static final String NOME_FICHEIRO = "produtos.dat";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Produto> produtos = cargarProdutos();

        boolean sair = false;

        while (!sair) {
            // Menú principal
            System.out.println("\n--- Menú Xestión de Repostos ---");
            System.out.println("1. Dar de alta un produto");
            System.out.println("2. Dar de baixa un produto");
            System.out.println("3. Actualizar cantidade dun produto");
            System.out.println("4. Visualizar todos os produtos");
            System.out.println("5. Saír e gardar");
            System.out.print("Escolle unha opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // Consumimos a liña en branco

            switch (opcion) {
                case 1:
                    // Alta de produto
                    System.out.print("Introduce o código do produto: ");
                    String codAlta = sc.nextLine();

                    if (produtos.containsKey(codAlta)) {
                        System.out.println("⚠️ O produto xa existe.");
                    } else {
                        System.out.print("Introduce o nome do produto: ");
                        String nome = sc.nextLine();
                        System.out.print("Introduce a cantidade inicial: ");
                        int cant = sc.nextInt();

                        Produto novo = new Produto(codAlta, nome, cant);
                        produtos.put(codAlta, novo);
                        System.out.println("✅ Produto engadido.");
                    }
                    break;

                case 2:
                    // Baixa de produto
                    System.out.print("Introduce o código do produto a eliminar: ");
                    String codBaixa = sc.nextLine();

                    if (produtos.remove(codBaixa) != null) {
                        System.out.println("✅ Produto eliminado.");
                    } else {
                        System.out.println("❌ Produto non atopado.");
                    }
                    break;

                case 3:
                    // Actualizar cantidade
                    System.out.print("Introduce o código do produto: ");
                    String codActualizar = sc.nextLine();

                    Produto p = produtos.get(codActualizar);
                    if (p != null) {
                        System.out.print("Nova cantidade: ");
                        int novaCant = sc.nextInt();
                        p.setCantidade(novaCant);
                        System.out.println("✅ Cantidade actualizada.");
                    } else {
                        System.out.println("❌ Produto non atopado.");
                    }
                    break;

                case 4:
                    // Visualizar produtos
                    System.out.println("\n📋 Lista de produtos:");
                    for (Produto prod : produtos.values()) {
                        System.out.println(prod);
                    }
                    break;

                case 5:
                    // Saír e gardar
                    gardarProdutos(produtos);
                    sair = true;
                    System.out.println("💾 Datos gardados en '" + NOME_FICHEIRO + "'.");
                    break;

                default:
                    System.out.println("❌ Opción non válida.");
            }
        }

        sc.close();
    }

    // Metodo para cargar produtos desde o ficheiro
    private static Map<String, Produto> cargarProdutos() {
        File ficheiro = new File(NOME_FICHEIRO);
        if (!ficheiro.exists()) {
            return new HashMap<>(); // Se non existe o ficheiro, devolvemos un mapa baleiro
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ficheiro))) {
            return (Map<String, Produto>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("❌ Erro ao cargar produtos. Comezando cun ficheiro baleiro.");
            return new HashMap<>();
        }
    }

    // Metodo para gardar os produtos no ficheiro
    private static void gardarProdutos(Map<String, Produto> produtos) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOME_FICHEIRO))) {
            oos.writeObject(produtos);
        } catch (IOException e) {
            System.out.println("❌ Erro ao gardar os produtos: " + e.getMessage());
        }
    }
}