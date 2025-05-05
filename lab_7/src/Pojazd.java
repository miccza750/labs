public abstract class Pojazd {
    String nazwa;
    boolean wypo;
    public Pojazd(String nazwa) {
        this.nazwa = nazwa;
        this.wypo = false;
    }

    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public void setWypo(boolean wypo) {
        this.wypo = wypo;
    }
    public abstract double obliczKoszt(int h);
    public boolean isWypo() {
        return wypo;
    }
    public void wypozycz() {
        this.wypo = true;
    }
    public void zwroc() {
        this.wypo = false;
    }
}
