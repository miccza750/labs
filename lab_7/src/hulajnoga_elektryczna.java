public class hulajnoga_elektryczna extends Pojazd implements Elektryczny{
    int poziom_baterii;

    public hulajnoga_elektryczna(String nazwa) {
        super(nazwa);
    }

    @Override
    public boolean isWypo() {
        return super.isWypo();
    }

    @Override
    public double obliczKoszt(int h) {
        return obliczKoszt(23);
    }

    @Override
    public void laduj() {

    }

    @Override
    public int poziom_baterii() {
        return 0;
    }

    @Override
    public void wypozycz() {
        super.wypozycz();
    }

    @Override
    public void zwroc() {
        super.zwroc();
    }
}
