import java.util.Scanner;
import java.util.Random;
public class Tasks {
    public static boolean validPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
    public static void Tasks1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            int n2 = n;
            int suma = 0;
            while (n > 0) {
                int g = sc.nextInt();
                if (g >= 0 && g <= 10) {
                    suma += g;
                }
                n--;
            }
            System.out.println(suma / n2);
        }else{
            System.out.println("Zła liczba");
        }
    }
    public static void Tasks2() {
        int suma_d = 0;
        int suma_u = 0;
        int ile_u=0;
        int ile_d=0;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            int g = sc.nextInt();
            if(g<0){
                suma_u+=g;
                ile_u++;
            }else{
                suma_d+=g;
                ile_d++;
            }
        }
        System.out.println("Suma dodatnich wynosi: "+suma_d);
        System.out.println("Suma ujemnych wynosi: "+suma_u);
        System.out.println("ilość ujemnych wynosi: "+ile_u);
        System.out.println("ilość dodatnich wynosi: "+ile_d);

    }
    public static void Tasks3() {
        int tab[];
        int n = 1;
        int suma = 0;
        while(n>0){
            n--;
        }
    }
    public static void Tasks4() {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int suma = 0;
        for(int i=0;i<n;i++){
            int r = rand.nextInt(56)-10;
            if(r%2==0){
                suma += r;
            }
        }
        System.out.println("suma: "+suma);
    }
    public static void Tasks5() {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        boolean b = validPalindrome(str1);
        if (b){System.out.printf("palindrom");
        }
        else{
            System.out.printf("nie palindrom");
        }

    }
}