public class Main {
    public static void main(String[] args) {
    Punkt punkt1 = new Punkt(2,2);
    Punkt punkt2 = new Punkt(8,3);
    Punkt punkt3 = new Punkt(4,4);
    // punkt1.pokaz();
    // punkt1.zeruj();
    // punkt1.przesun(2,2);
     Prostokat prostokat = new Prostokat(2,3);
     Trojkat trojkat = new Trojkat(2,3);
     Figura prostokat1 = new Figura();
    Okrag okrag = new Okrag(4,punkt1);
    //System.out.print(okrag.wSrodku(punkt2));
    prostokat.przesun(3,5);
    System.out.print(prostokat.punkt.x);
        System.out.print(trojkat.opis());
        System.out.print(prostokat1.opis());
        System.out.printf(okrag.opis());
    }
}