package Boletin11_1;

public class Main {
    public static void main(String[] args) {
        try {
            // Intentamos crear un Deportista con datos válidos
            Deportista d = new Deportista(
                    "Lucas",              // nome
                    "Rúa Nova",           // direccion
                    "12345678A",          // DNI válido
                    "futbol",             // nomeDeporte
                    "Depor",              // clube
                    "2024fut123456"       // licencia válida (formato correcto y año actual)
            );

            // Si tudo va bien, mostramos mensaje de éxito
            System.out.println("Deportista creado con éxito: " +
                    d.getNome() + ", DNI: " + d.getDni() + ", Licenza: " + d.getLicenza());

        } catch (DniNonValido e) {
            // Si el DNI no es válido, mostramos el mensaje de error
            System.err.println("Erro co DNI: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            // Si la licencia no es válida, mostramos el mensaje de error
            System.err.println("Erro coa licenza: " + e.getMessage());
        }
    }
}
