import java.awt.image.AreaAveragingScaleFilter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Odczyt {
    public static void main(String[] args) {
        ArrayList<Pesel> lista = new ArrayList<Pesel>();
        int licznik_kobiet = 0;
        int licznik_mezczyzn = 0;
        int licznik_1 = 0;
        int licznik_2 = 0;
        int licznik_3 = 0;
        File plik = new File("pesele.txt");
        try {
            Scanner scanner = new Scanner(plik);
            while (scanner.hasNext()) {
                Pesel pesel = new Pesel(scanner.next());
                lista.add(pesel);
                if (pesel.plec == "k") {
                    licznik_kobiet++;
                } else {
                    licznik_mezczyzn++;
                }
                if (Integer.valueOf(pesel.rok) > 50 && Integer.valueOf(pesel.rok) < 80) {
                    licznik_1++;
                }

                if (Integer.valueOf(pesel.rok) > 80 && Integer.valueOf(pesel.rok) <= 99) {
                    licznik_2++;
                }

                if (Integer.valueOf(pesel.rok) > 0 && Integer.valueOf(pesel.rok) <= 25) {
                    licznik_3++;
                }

                // System.out.println(pesel.To_Data());
            }
        } catch (
                IOException e) {
            System.out.println("Wystąpił błąd.");
            e.printStackTrace();
        }

        System.out.println("kobiet: " + licznik_kobiet + ", mężczyzn: " + licznik_mezczyzn);
        System.out.println("ilośc osób pomiędzy: 1950-1980: " + licznik_1);
        System.out.println("ilośc osób pomiędzy: 1981-1999: " + licznik_2);
        System.out.println("ilośc osób pomiędzy: 2000-2025: " + licznik_3);
        try {
            FileWriter writer = new FileWriter("dane.txt");
            for (Pesel i : lista) {
                writer.write(i.To_Data()+"\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Błąd zapisu.");
            e.printStackTrace();


        }
    }
}
