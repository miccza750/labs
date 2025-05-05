import java.util.*;
public class wypozyczalnia {
    private Map<String, Pojazd> pojazdy;

    {
        pojazdy = new HashMap<>();
    }

    public void dodajPojazd(Pojazd p) {
        pojazdy.put(p.getId(), p);
    }
}
