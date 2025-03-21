public class Osoba {
    String imie,nazwisko;
    int wiek;
    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public Osoba(int wiek, String imie) {
        this.nazwisko = "";
        this.wiek = wiek;
        this.imie = imie;
    }
    public Osoba(){
        this.wiek = 0;
        this.nazwisko = "";
        this.imie = "";
    }
    public void wyswietl(){
        System.out.printf(imie);
        System.out.printf(nazwisko);
        System.out.print(wiek);
    }
    public int getWiek() {
        return wiek;
    }


}
