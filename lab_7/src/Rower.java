public class Rower extends Pojazd{
    public Rower(String nazwa) {
        super(nazwa);
    }
    @Override
    public double obliczKoszt(int h) {
        return 5 * h;
    }
}
