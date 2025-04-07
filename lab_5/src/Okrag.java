public class Okrag extends Figura {
    Punkt srodek = new Punkt();
    double promien;

    public Okrag(double promien, Punkt srodek) {
        this.promien = promien;
        this.srodek = srodek;
    }

    public Okrag() {
        this.srodek.x = 0;
        this.srodek.y = 0;
        this.promien = 0;
    }

    public double getPowierzchnia(){
        return Math.PI * promien * promien;
    }
    public double getSrednica(){
        return promien*2;
    }
    public void setPromien(double p){
        this.promien = p;
    }

    public double getPromien() {
        return promien;
    }
    public boolean wSrodku(Punkt punkt) {
        if(Math.sqrt(Math.pow(srodek.x - punkt.x, 2) + Math.pow(srodek.y - punkt.y, 2)) <= promien) {
            return true;
        } else {
            return false;
        }
    }
    public Okrag(String kolor, double promien, Punkt srodek) {
        super(kolor);
        this.promien = promien;
        this.srodek = srodek;
    }

    @Override
    public String opis() {
        return "\nOkrag, srodek x : " + this.srodek.x + " srodek y : " +  this.srodek.y + "kolor: " + this.kolor;
    }
}
