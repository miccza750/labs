import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> Imiona = new LinkedList<String>();
        System.out.println("podaj imie: lub - ");
        while (true) {
            System.out.print("Podaj imię: ");
            String imie = scanner.nextLine();

            if (imie.equals("-")) {
                break;
            }

            if (!imie.isEmpty()) {
                Imiona.add(imie);
            }
        }
        System.out.println("ilosc: " + Imiona.size());
    }
}