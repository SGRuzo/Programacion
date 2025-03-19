package Ejercicios;
import java.util.Scanner; // Importa la clase Scanner para leer la entrada del usuario

public class Fecha {

    // Declaración de atributos para la fecha
    private int dia;    // Almacena el día de la fecha
    private int mes;    // Almacena el mes de la fecha
    private int anio;   // Almacena el año de la fecha

    // Constructor que inicializa los valores de día, mes y año
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;      // Inicializa el día con el valor proporcionado
        this.mes = mes;      // Inicializa el mes con el valor proporcionado
        this.anio = anio;    // Inicializa el año con el valor proporcionado
    }

    // Metodo que muestra la fecha en formato dd/mm/aaaa
    public void mostrarFecha() {
        // Imprime la fecha con el formato adecuado (dd/mm/aaaa)
        System.out.println(String.format("%02d/%02d/%04d", dia, mes, anio));
        // %02d asegura que el día y el mes tengan dos dígitos (ej. 01, 02, etc.)
        // %04d asegura que el año tenga cuatro dígitos (ej. 2025)
    }

    // Metodo que comprueba si un año es bisiesto
    private boolean esBisiesto(int anio) {
        // Un año es bisiesto si es divisible por 4, pero no divisible por 100, salvo que sea divisible por 400
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    // Metodo que devuelve el número de días de un mes en particular, considerando los años bisiestos para febrero
    private int diasDelMes(int mes, int anio) {
        // Switch para determinar el número de días según el mes
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31; // Meses con 31 días: Enero, Marzo, Mayo, Julio, Agosto, Octubre, Diciembre
            case 4: case 6: case 9: case 11:
                return 30; // Meses con 30 días: Abril, Junio, Septiembre, Noviembre
            case 2:
                return esBisiesto(anio) ? 29 : 28; // Febrero: 29 días si es bisiesto, 28 si no lo es
            default:
                return 0; // Caso por defecto para evitar un mes inválido
        }
    }

    // Metodo para sumar un número de días a la fecha
    public void sumarDias(int dias) {
        this.dia += dias;    // Aumenta el valor de los días
        ajustarFecha();       // Llama al metodo ajustarFecha() para corregir la fecha si el día excede el número de días del mes
    }

    // Metodo para restar un número de días de la fecha
    public void restarDias(int dias) {
        this.dia -= dias;    // Resta el número de días
        ajustarFecha();       // Llama al metodo ajustarFecha() para corregir la fecha si el día es negativo
    }

    // Metodo privado que ajusta la fecha cuando el día excede los límites de un mes o cuando se vuelve negativo
    private void ajustarFecha() {
        // Mientras el día sea mayor que el número de días en el mes, ajusta la fecha
        while (this.dia > diasDelMes(this.mes, this.anio)) {
            this.dia -= diasDelMes(this.mes, this.anio);  // Resta los días del mes actual
            this.mes++;  // Avanza al siguiente mes
            if (this.mes > 12) {   // Si el mes es mayor que diciembre, resetea a enero y avanza el año
                this.mes = 1;
                this.anio++;   // Incrementa el año
            }
        }

        // Mientras el día sea menor o igual a 0, ajusta la fecha hacia el mes anterior
        while (this.dia <= 0) {
            this.mes--;   // Retrocede al mes anterior
            if (this.mes < 1) {  // Si el mes es menor que enero, regresa a diciembre y decrementa el año
                this.mes = 12;
                this.anio--;  // Decrementa el año
            }
            this.dia += diasDelMes(this.mes, this.anio);  // Añade los días del mes anterior para ajustar el valor del día
        }
    }

    // Metodo principal para ejecutar el programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Crea un objeto Scanner para leer la entrada del usuario

        // Solicita al usuario que ingrese el día, mes y año
        System.out.print("Introduce el día (dd): ");
        int dia = scanner.nextInt();  // Lee el día ingresado
        System.out.print("Introduce el mes (mm): ");
        int mes = scanner.nextInt();  // Lee el mes ingresado
        System.out.print("Introduce el año (aaaa): ");
        int anio = scanner.nextInt();  // Lee el año ingresado

        // Crea una nueva instancia de la clase Fecha con los valores proporcionados
        Fecha fecha = new Fecha(dia, mes, anio);

        // Muestra la fecha ingresada por el usuario
        System.out.println("La fecha ingresada es:");
        fecha.mostrarFecha();  // Llama al metodo para mostrar la fecha

        // Solicita al usuario cuántos días desea sumar
        System.out.print("¿Cuántos días deseas sumar? ");
        int diasSumar = scanner.nextInt();  // Lee la cantidad de días a sumar
        fecha.sumarDias(diasSumar);  // Llama al metodo sumarDias para agregar los días
        System.out.println("Fecha después de sumar días:");
        fecha.mostrarFecha();  // Muestra la fecha después de sumar los días

        // Solicita al usuario cuántos días desea restar
        System.out.print("¿Cuántos días deseas restar? ");
        int diasRestar = scanner.nextInt();  // Lee la cantidad de días a restar
        fecha.restarDias(diasRestar);  // Llama al metodo restarDias para restar los días
        System.out.println("Fecha después de restar días:");
        fecha.mostrarFecha();  // Muestra la fecha después de restar los días

        scanner.close();  // Cierra el Scanner para liberar recursos
    }
}
