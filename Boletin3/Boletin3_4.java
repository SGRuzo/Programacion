import java.util.Scanner;
/**
 * Resuelve cual de las personas pesa más, introduciendo su nombre y peso.
 * @version 1.0
 * @author SarayGRuzo
 */
public class Boletin3_4 {
    public static void main(String[] args) {
        Scanner sc;
        int pesoPesado, peso1, peso2;
        String nomePesado, nome1, nome2;

        sc = new Scanner(System.in);
        System.out.println("Escribe o nome da persoa 1: ");
        nome1 = sc.next();
        System.out.println("Escribe o peso da persoa 1: ");
        peso1 = sc.nextInt();
        System.out.println("Escribe o nome da persoa 2: ");
        nome2 = sc.next();
        System.out.println("Escribe o peso da persoa 2: ");
        peso2 = sc.nextInt();

        pesoPesado = (peso1>peso2) ? peso1:peso2;
        nomePesado = (peso1>peso2) ? nome1:nome2;

        System.out.println("A persoa más pesada é " +nomePesado+ ", e o seu peso é " +pesoPesado+ "Kg");
        sc.close();

    }
}