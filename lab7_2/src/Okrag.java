public class Okrag extends Figura implements RuchFigury{
    int promien=0;
    Punkt punkt = new Punkt(0,0);

    public Okrag(String kolor, Punkt punkt, int promien) {
        super(kolor);
        this.punkt = punkt;
        this.promien = promien;
    }


    public Punkt getPunkt() {
        return punkt;
    }

    public void setPunkt(Punkt punkt) {
        this.punkt = punkt;
    }

    public int getPromien() {
        return promien;
    }

    public void setPromien(int promien) {
        this.promien = promien;
    }

    @Override
    public String opis() {
        return "";
    }

    @Override
    public void skaluj(int skala) {
        promien = promien * skala;
    }

    @Override
    public float getPowierzchnia() {
        return 0;
    }

    @Override
    public boolean wPolu(Punkt p) {
        return false;
    }

    @Override
    public boolean wPolu() {
        return false;
    }

    @Override
    public void przesun(int x, int y) {
        this.punkt.x += x;
        this.punkt.y += y;

    }
}
