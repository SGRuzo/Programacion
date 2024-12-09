import java.util.Scanner;

public class Fibonacci {
    public static void main (String[] args){ //Metodo principal
        //Creamos el objeto Scanner
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce el primer número: ");     //Pedimos al usuario el primer numero
        int n1 = scanner.nextInt(); //Guardamos el primer numero
        System.out.println("Introduce el segndo número: ");     //Pedimos al usuario el segundo numero
        int n2 = scanner.nextInt(); //Guardamos el segundo numero
        System.out.println("Introduce el número de elementos: ");   //Pedimos al usuario el numero de elementos para la secuencia.
        int elementos = scanner.nextInt();  //Guardamos el numero de elementos.
        int n3 = 0; //Variable que almacenará el siguiente numero de la secuencia.
        //Muestra los numeros proporcionados por el usuario.
        System.out.println(n1);
        System.out.println(n2);

        int j=0;    //Variable
        recursiva("hola"); //Llamada al metodo recursivo

        //Bucle for para calcular y mostrarla secuencia de Fibonacci.
        for (int i=0; i<elementos; i++){
            n3= fibonacci (n1, n2);

            n1=n2;
            n2=n3;
        }

    }
    static void recursiva (String msg){
        System.out.println(msg);
        if (msg.length()<10) recursiva(msg+".");
    }

   static int fibonacci (int a, int b){
        int suma= a+b;
        System.out.println(suma);
        return suma;
    }


}
