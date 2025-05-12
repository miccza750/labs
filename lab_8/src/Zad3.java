public class Zad3 {
    public static void main(String[] args) {
        try {
            Adres adres = new Adres(0, null, null, null);
            System.out.println("Adres: " + adres);
        } catch (NieprawidlowyAdresException e) {
            System.out.println("Błąd: "+e.getMessage()+"\n");
    }
}
}
