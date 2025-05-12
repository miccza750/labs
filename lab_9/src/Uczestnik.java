import java.util.Objects;

public class Uczestnik {
    private int id;
    private String imie;
    private int wiek;

    public Uczestnik(String imie, int wiek, int id) {
        this.imie = imie;
        this.wiek = wiek;
        this.id = id;
    }

    public int getWiek() {

        return wiek;
    }

    @Override
    public String toString() {
        return "Uczestnik{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Uczestnik uczestnik = (Uczestnik) o;
        return id == uczestnik.id && wiek == uczestnik.wiek && Objects.equals(imie, uczestnik.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imie, wiek);
    }
}
