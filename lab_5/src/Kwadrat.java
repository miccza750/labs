public class Kwadrat extends Prostokat{
    public Kwadrat(float wys, float szer, String kolor) {
        super(wys, szer, kolor);
    }

    public Kwadrat(float wys, float szer) {
        super(wys, szer);
    }
    public float getWys(){
        return this.wys;
    }
    public float setszer(){
        return this.wys;
    }
    public float getszer(){
        return this.wys;
    }
    public float setWys(){
        return this.wys;
    }
    @Override
    public String opis() {
        return "kwadrat, szerokosc: " + this.szer + " wysokość: " + this.wys + "kolor: " + this.kolor;
    }
}
