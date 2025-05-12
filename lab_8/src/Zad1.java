import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        try {
            String liczba = scanner.nextLine();
            double l = Double.parseDouble(liczba);
            if(l < 0){
                throw new IllegalArgumentException("liczba ujemna!");

            }
            double p = Math.sqrt(l);
            System.out.println("Pierwiastek: " + p);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
