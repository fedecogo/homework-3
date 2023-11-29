import es1.Rettangolo;
import static es1.Rettangolo.stampaDueRettangoli;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //primo ret
        System.out.println("Inserisci l'altezza del 1° rettangolo:");
        int altezza1 = scanner.nextInt();
        System.out.println("Inserisci la larghezza del 1° rettangolo:");
        int larghezza1 = scanner.nextInt();
        Rettangolo rettangolo1 = new Rettangolo(altezza1, larghezza1);


        //sec ret
        System.out.println("Inserisci l'altezza del 2° rettangolo:");
        int altezza2 = scanner.nextInt();
        System.out.println("Inserisci la larghezza del 2° rettangolo:");
        int larghezza2 = scanner.nextInt();
        Rettangolo rettangolo2 = new Rettangolo(altezza2, larghezza2);


        stampaDueRettangoli(rettangolo1, rettangolo2);
        //stampa due rett
    }
}
