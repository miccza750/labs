import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz tekst:");
        String tekst = scanner.nextLine();
        String[] slowa = tekst.split(" ");
        Map<String, Integer> l = new HashMap<>();
        for (String slowo : slowa) {
            if (!slowo.isEmpty()) {
                l.put(slowo, l.getOrDefault(slowo, 0) + 1);
            }

        }
            System.out.println(l);

    }

}