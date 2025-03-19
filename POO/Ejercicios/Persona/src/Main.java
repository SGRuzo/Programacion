public class Main {
    public static void main(String[] args) {
        Persoa p1 = new Persoa("Juan", 20, "12345678Z");
        System.out.println(p1);
        p1.setEdad(30);
        System.out.println(p1);
        p1.setDni("12345678Z");
        System.out.println(p1);
    }
}