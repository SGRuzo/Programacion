/**
 *Programa que incremente la hora de un reloj
 * Pide al usuario hora,minutos,segundos y los segundos de incremento
 * @version 1.0
 * @author SarayGRuzo
 */


import java.util.Scanner;
public class Exame_SarayGarciaRuzo {
    public static void main (String[] args){
        //Creamos el objeto Scanner
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce la hora: ");
        int h = scanner.nextInt(); //h=horas
        int nh= 0;
        System.out.println("Introduce los minutos: ");
        int m = scanner.nextInt(); //m=minutos
        int nm =0;
        System.out.println("Introduce los segundos: ");
        int s = scanner.nextInt(); //s=segundos
        int ns= 0;
        System.out.println("Introduce el incremento en segundos: ");
        int i = scanner.nextInt(); //i=incremento
        if(i+s<60 ) {    //Si el incremento + segundos es más que 60
            nm = m++;    //incrementamos minutos
        } else if(s+m>3600) {    //Si el incremento + segundos + minutos es más que 3600
            nh = h++;            //Incrementamos horas
        } else
            System.out.println ("La hora con el incremento es: " + nh +":"+nm+":"+s);

    }
}

