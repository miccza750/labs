import java.util.*;

public class Zad3 {
    public static void main(String[] args) {
        Map<String, Double> menu = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean t = true;
        while (t){
            System.out.println("-----MENU-----");
            System.out.println("1. Dodaj danie,");
            System.out.println("2. Wyświetl kartę dań,");
            System.out.println("3. Usuń danie,");
            System.out.println("4. Oblicz rachunek,");
            System.out.println("5. Wyjście,");
            System.out.print("Wybierz opcję: ");
            String wybor = scanner.nextLine();
            switch (wybor){
                case "1":
                    System.out.print("Podaj nazwę: ");
                    String nazwa = scanner.nextLine();
                    System.out.print("Podaj cenę: ");
                    double cena = scanner.nextInt();
                    menu.put(nazwa,cena);
                    System.out.println("dodano: "+nazwa + "za: "+cena);
                    break;

                case "2":
                    System.out.println("menu: ");
                    System.out.println(menu);
                    break;
                case "3":
                    System.out.print("Podaj nazwę: ");
                    String danie_1 = scanner.nextLine();
                    menu.remove(danie_1);
                    break;
                case "4":
                    System.out.println("Podaj dania: - aby zatrzymac");
                    double suma = 0.0;
                    List<String> Dania = new ArrayList<>();
                    while (true){
                        String danie = scanner.nextLine();
                        if(danie.equals("-")){break;}
                        if (menu.containsKey(danie)) {
                            suma += menu.get(danie);
                            Dania.add(danie);
                        }

                    }
                    System.out.println("Suma: "+ suma );
                    break;
                case "5":
                    t = false;
                    break;




                default:
                    System.out.println("blad!");
                    break;

            }
        }
    }
}
