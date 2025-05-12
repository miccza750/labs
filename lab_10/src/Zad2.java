import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Map<String, String> ludzie = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean t = true;
        while (t){
            System.out.println("----MENU----");
            System.out.println("1. Dodaj użytkownika");
            System.out.println("2. Zaloguj się");
            System.out.println("3. Wyjście :\n");
            String wybor = scanner.nextLine();
        switch (wybor){
            case "3":
                t = false;
                break;
            case "2":
                System.out.print("Login: ");
                String login = scanner.nextLine();
                System.out.print("Hasło: ");
                String haslo = scanner.nextLine();
                    if(ludzie.get(login).equals(haslo)){
                        System.out.println("Zalogowano pomyślnie!");
                    }else{
                        System.out.println("Niepoprawne hasło lub login!");
                    }
                break;
            case "1":
                System.out.print("Podaj login: ");
                String login_2 = scanner.nextLine();
                System.out.print("Podaj hasło: ");
                String haslo_2 = scanner.nextLine();
                ludzie.put(login_2, haslo_2);
                break;
        }
        }
    }
}
