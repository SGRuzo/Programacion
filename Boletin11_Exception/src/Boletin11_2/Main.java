package Boletin11_2;

// Clase principal con un ejemplo de uso
public class Main {
    public static void main(String[] args) {
        try {
            // Creamos unha data válida
            Data data1 = new Data(29, 2, 2024); // 2024 é ano bisiesto
            data1.mostrarData(); // Mostra: 29/02/2024

            // Probaremos incrementar días
            data1.incrementarDia(); // Debería pasar a 01/03/2024
            data1.mostrarData();

            // Probaremos unha data non válida
            Data data2 = new Data(31, 4, 2025); // Abril ten só 30 días → erro
            data2.mostrarData(); // Isto non se executará

        } catch (FormatoDataErroneo e) {
            // Se captura o erro, mostramos a mensaxe explicando que fallou
            System.err.println("Erro ao crear ou modificar a data: " + e.getMessage());
        }
    }
}