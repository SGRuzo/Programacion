package E9_RegistroTemperaturas;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class EstacionMeteoroloxica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<RexistroTemperatura> rexistros = new ArrayList<>();

        boolean sair = false;

        // Bucle principal do programa
        while (!sair) {
            // Mostramos o menú
            System.out.println("\n--- Menú ---");
            System.out.println("1. Novo rexistro");
            System.out.println("2. Listar rexistros");
            System.out.println("3. Mostrar estatísticas");
            System.out.println("4. Saír");
            System.out.print("Escolle unha opción: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    // Opción 1: Engadir un novo rexistro
                    System.out.print("Introduce a temperatura (en ºC): ");
                    double temp = sc.nextDouble();

                    // Creamos un rexistro coa temperatura e a hora actual
                    RexistroTemperatura novo = new RexistroTemperatura(temp);

                    // Engadimos o rexistro á lista
                    rexistros.add(novo);
                    System.out.println("✅ Rexistro gardado.");
                    break;

                case 2:
                    // Opción 2: Listar rexistros
                    System.out.println("\n📋 Lista de rexistros:");
                    for (RexistroTemperatura r : rexistros) {
                        System.out.println(r); // Mostramos cada rexistro
                    }
                    break;

                case 3:
                    // Opción 3: Mostrar estatísticas (mínimo, máximo, promedio)
                    if (rexistros.isEmpty()) {
                        System.out.println("⚠️ Non hai rexistros para analizar.");
                    } else {
                        double suma = 0;
                        double max = Double.MIN_VALUE;
                        double min = Double.MAX_VALUE;

                        // Recorremos todos os rexistros para calcular as estatísticas
                        for (RexistroTemperatura r : rexistros) {
                            double t = r.getTemperatura();
                            suma += t;
                            if (t > max) max = t;
                            if (t < min) min = t;
                        }

                        double promedio = suma / rexistros.size();

                        System.out.printf("📊 Estatísticas:\n");
                        System.out.printf("Temperatura máxima: %.2f ºC\n", max);
                        System.out.printf("Temperatura mínima: %.2f ºC\n", min);
                        System.out.printf("Temperatura media: %.2f ºC\n", promedio);
                    }
                    break;

                case 4:
                    // Opción 4: Gardar en ficheiro e saír
                    sair = true;

                    // Obtemos a data de hoxe para o nome do ficheiro
                    String dataHoxe = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));

                    // Creamos o nome do ficheiro
                    String nomeFicheiro = "rexistros" + dataHoxe + ".dat";

                    // Gardamos os rexistros nun ficheiro binario
                    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeFicheiro))) {
                        oos.writeObject(rexistros);
                        System.out.println("💾 Rexistros gardados no ficheiro: " + nomeFicheiro);
                    } catch (IOException e) {
                        System.out.println("❌ Erro ao gardar os rexistros: " + e.getMessage());
                    }
                    break;

                default:
                    System.out.println("❌ Opción non válida.");
            }
        }

        sc.close(); // Pechamos o escáner
    }
}