public class Main {
    public static void main(String[] args) {
        // Crear un objeto de tipo Reloj con hora, minutos, segundos y formato
        Reloj reloj = new Reloj(14, 30, 45, "doce");

        // Mostrar el reloj usando el metodo toString sobrescrito
        System.out.println(reloj.toString());  // Debería mostrar la hora en formato 12 horas

        // Avanzar un segundo y mostrar la nueva hora
        reloj.avanzarUnSegundo();
        System.out.println("Después de avanzar un segundo: " + reloj.toString());

        // Cambiar el formato a 24 horas y mostrar el reloj
        reloj.setFormato("VINTECATRO");
        System.out.println("En formato 24 horas: " + reloj.toString());

        // Verificar si es AM o PM
        System.out.println("AM/PM: " + reloj.amPm());
    }
}
