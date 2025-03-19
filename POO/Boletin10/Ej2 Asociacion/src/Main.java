// Clase Principal (Main) para ejecutar el programa
public class Main {
    public static void main(String[] args) {
        // Se crean instancias de Voluntarios, Socios y Asalariados
        Voluntarios voluntario = new Voluntarios("53818040H", "Pepe", "Calle Falsa 123", "Pontevedra", "01/01/2021", 25, "Estudiante", 20);
        Socios socio = new Socios("53818040H", "Juan", "Calle Falsa 321", "A Coruña", "01/01/2021", 300);
        Asalariados asalariado = new Asalariados("53818040H", "Pedro", "Calle Falsa 132", "Lugo", "01/01/2021", "Informático", 1000, 13, 2);

        // Se imprimen los datos
        System.out.println(voluntario.aCadea());
        System.out.println(socio.aCadea());
        System.out.println(asalariado.aCadea());
    }
}