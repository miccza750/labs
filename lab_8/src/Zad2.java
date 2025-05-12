import java.util.Scanner;
public class Zad2 {
     static class BlednaWartoscDlaSilniException extends Exception {
        public BlednaWartoscDlaSilniException(String message) {
            super(message);
        }
    }
    public static int silnia(int a) throws BlednaWartoscDlaSilniException{
        if(a < 0){
            throw new BlednaWartoscDlaSilniException("liczba ujemna!");
        }
        int k = 1;
        for (int i = 1; i <= a; i++) {
            k*=i;
        }
        return k;
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj liczbę: ");
            int l = scanner.nextInt();
            long Silnia = silnia(l);
            System.out.println("Silnia: "+ Silnia);
        } catch (BlednaWartoscDlaSilniException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }
}
