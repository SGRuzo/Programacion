import java.util.Scanner;

public class FuncionRecursiva {
    public static void main(String[] args){
        Scanner scanner=new Scanner (System.in);
        System.out.println("Introduce el valor de la base: ");
        int m = scanner.nextInt();
        System.out.println("Introduce el valor del exponente: ");
        int n = scanner.nextInt();
        int resultado = potencia(m,n);
        System.out.println( m + " elevado a " + n + " es: " + resultado);
        scanner.close();

    }
    static int potencia(int m, int n){
        if (n==0) {
            return 1;
        } else {
            return m * potencia(m, n -1);
        }

    }

}

