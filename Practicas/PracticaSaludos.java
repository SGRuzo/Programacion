/**
 *Solicita un nombre de usuario y saluda una cantidad de veces definida en distintos idiomas
 * @version 1.0
 * @author SarayGRuzo
 */
//Importamos Scanner
import java.util.Scanner;
public class PracticaSaludos {
    /**
     * Metodo para ejecutar el programa
     * @param args
     */
    //Metodo que permite la ejecución del programa.
    public static void main (String[] args) {
        //Llamamos al metodo obterNome y guardamos el nomeEstudante.
        String nomeEstudante = obterNome();
        //Llamamos al metodo saudos y aportamos las veces y el idioma
        saudos(3, "en");
        //Imprimimos un mensaje de bienvenida en inglés.
        System.out.println("Welcome Mr,Mrs: " + nomeEstudante);
        saudos(5,"gl");
        System.out.println("Ola, señor/a: ");
        saudos(2,"es");
        System.out.println("Hola, señor/a: ");
    }

    /**
     *Metodo que imprime un saludo al usuario en el idioma y cantidad de veces especificados.
     * @param veces Número de veces que se imprimirá el saludo.
     * @param idioma Idioma en el que se realizará el saludo.
     */
    static void saudos(int veces, String idioma) {
        String nome = obterNome ();
        for (int i=0; i<veces; i++){
            if (idioma.equals ("gl")) System.out.println("Ola " + nome);
            else if (idioma.equals ("es")) System.out.println("Hola " + nome);
            else if (idioma.equals ("en")) System.out.println("Hello " + nome);
        }
    }

    /**
     * Metodo para obtener el nombre del usuario mediante entrada por consola.
     * @return
     */
    //Metodo obtenerNome
    static String obterNome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe o teu nome: ");
        String nome = sc.next();
        //sc.close();
        return nome;
        //La línea sc.close(); está comentada. Esto es porque cerrar Scanner puede impedir futuras lecturas desde System.in.

    }

}
