public class Student {
    String imie,nazwisko, nazwaSpecjalnosci;
    int nr_index, rok;
    Osoba osoba;
   // Osoba os = new Osoba();

    public Student(Osoba osoba, int rok) {
        this.osoba = osoba;
        this.imie = osoba.imie;
        this.osoba.wiek = osoba.wiek;
        this.rok = rok;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwaSpecjalnosci() {
        return nazwaSpecjalnosci;
    }

    public void setNazwaSpecjalnosci(String nazwaSpecjalnosci) {
        this.nazwaSpecjalnosci = nazwaSpecjalnosci;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getNr_index() {
        return nr_index;
    }

    public void setNr_index(int nr_index) {
        this.nr_index = nr_index;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public int getWiek() {
        return osoba.getWiek();
    }
    public void setWiek(int wiek) {
        this.osoba.setWiek(wiek);
    }

    public Student(String imie, String nazwisko, String nazwaSpecjalnosci, int nr_index, int rok) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nazwaSpecjalnosci = nazwaSpecjalnosci;
        this.nr_index = nr_index;
        this.rok = rok;
    }
    public Student(Osoba osoba, String nazwaSpecjalnosci) {
        this.imie = osoba.imie;
        this.nazwisko = osoba.nazwisko;
        this.osoba = osoba;
        this.nazwaSpecjalnosci = nazwaSpecjalnosci;
    }
    public Student() {
        this.osoba = new Osoba();
        this.imie = "";
        this.nazwisko = "";
        this.nr_index = 0;
        this.nazwaSpecjalnosci ="";
        this.rok = 0;
    }
    public void reset() {
        this.osoba = new Osoba();
        this.osoba = osoba;
        this.imie = "";
        this.nazwisko = "";
        this.nr_index = 0;
        this.nazwaSpecjalnosci ="";
        this.rok = 0;
    }
    public void wyswietl(){
        System.out.printf("Student: \nimie: "+getImie()+"\nnazwisko: "+getNazwisko()+"\nnr. indeksu: "+getNr_index()+"\nnazwa specjalizacji: "+getNazwaSpecjalnosci()+"\nrok: "+getRok()+"\nwiek: "+getWiek());
    }
}
