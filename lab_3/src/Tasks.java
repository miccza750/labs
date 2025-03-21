import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Tasks {
    public static int silnia(int n) {
        if (n == 0) {
            return 1;
        }
        return n * silnia(n - 1);
    }
    public static void Tasks1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj poczatek przedzialu");
        int a = sc.nextInt();
        System.out.println("podaj koniec przedzialu");
        int b = sc.nextInt();
        System.out.println("ilosc");
        int ilosc = sc.nextInt();
        int[] arr = Rands.RandVal(a,b,ilosc);
        System.out.println(Arrays.toString(arr));

    }
    public static void Tasks2() {
        int[] arr1 = {1,3,2,4};
        int[] arr2 = {1,3,4};
        for (int i = 0; i < arr1.length; i+=2) {
            System.out.println(arr1[i]);
        }
        for (int i = 0; i < arr1.length; i+=2) {
            System.out.println(arr2[i]);
        }
        }
    public static void Tasks3() {
        String[] slowa = new String[3];
        slowa[0] = "ala";
        slowa[1] = "ma";
        slowa[2] = "kota";
        for(String i : slowa){
            System.out.printf(i.toUpperCase()+"\n");
        }

    }
    public static void Tasks4() {
        Scanner scanner = new Scanner(System.in);
        String[] slowa = new String[5];
        for (int i = 0; i < 5; i++) {
            slowa[i] = scanner.nextLine();
        }
        for (int i = 4; i >= 0; i--) {
            StringBuilder s = new StringBuilder(slowa[i]);
            System.out.println(s.reverse().toString());
        }
    }
    public static void Tasks5() {
        Scanner sc = new Scanner(System.in);
        int[] liczby = new int[8];
        for (int i = 0; i < 8; i++) {
            System.out.print("Liczba " + (i + 1) + ": ");
            liczby[i] = sc.nextInt();
        }
        for (int i = 1; i < liczby.length; i++) {
            int a = liczby[i];
            int j = i - 1;
            while (j >= 0 && liczby[j] > a) {
                liczby[j + 1] = liczby[j];
                j--;
            }
            liczby[j + 1] = a;
        }
        for (int i = 0; i < liczby.length; i++) {
            System.out.print(liczby[i] + "\n");
        }
    }
    public static void Tasks6() {
        Scanner sc = new Scanner(System.in);
        int[] liczby = new int[5];
        for (int i = 0; i < 5; i++) {
            liczby[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.printf(silnia(liczby[i])+"\n");
        }
    }
    public static void Tasks7() {
        String[] tab1 = {"Ala","pies"};
        String[] tab2 = {"Ala","pies"};
        if (Arrays.equals(tab1, tab2)) {
            System.out.println("Tablice są takie same");
        } else {
            System.out.println("Tablice się różnią");
        }
    }
}