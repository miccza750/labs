import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> imiona = new HashMap<>();

        System.out.println("podaj imie: lub - ");
        while(true){
            System.out.println("pierwsze imię: ");
            String imie_1 = scanner.nextLine();
            System.out.println("drugie imię: ");
            String imie_2 = scanner.nextLine();
            if(imie_1.equals("-") || imie_2.equals("-")){
                break;
            }
            imiona.put(imie_1, imie_2);
            imiona.put(imie_2, imie_1);
        }
        System.out.print("Podaj imię do szukania: ");
        String Imie_szukane = scanner.nextLine();
        if (imiona.containsKey(Imie_szukane)) {
            System.out.println("imie partnera:"+ imiona.get(Imie_szukane));
        }
        else{
            System.out.println("Nie znaleziono");
        }
    }
}
