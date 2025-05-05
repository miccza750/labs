public class Hulajnoga extends Pojazd{
    public Hulajnoga(String nazwa) {
        super(nazwa);
    }
    @Override
    public double obliczKoszt(int h) {
        return 6 * h;
    }
}
