/**
 *Programa que incremente la hora de un reloj
 * Pide al usuario hora,minutos,segundos y los segundos de incremento
 * @version 1.0
 * @author SarayGRuzo
 */


import java.util.Scanner;
public class Exame_SarayRuzo {
    public static void main (String[] args){
        //Creamos el objeto Scanner
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce la hora: ");
        int hora = scanner.nextInt(); //h=horas
        int nhora= 0;
        System.out.println("Introduce los minutos: ");
        int minutos = scanner.nextInt(); //m=minutos
        int nminutos =0;
        System.out.println("Introduce los segundos: ");
        int segundos = scanner.nextInt(); //s=segundos
        int nseg= 0;
        System.out.println("Introduce el incremento en segundos: ");
        int i = scanner.nextInt();        
        segundos += incremento;
        minutos += segundos / 60;
        segundos %= 60;
        hora += minutos / 60;
        minutos %= 60;
        hora %= 24;
        System.out.println("La hora con el incremento es: " + hora + ":" + minutos + ":" + segundos);
    }
}

