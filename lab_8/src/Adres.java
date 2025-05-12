class NieprawidlowyAdresException extends Exception {
    public NieprawidlowyAdresException(String message) {
        super(message);
    }
}
public class Adres {

    private String ulica;
    private int numerDomu;
    private String kodPocztowy;
    private String miasto;

    public Adres(int numerDomu, String ulica, String kodPocztowy, String miasto) throws NieprawidlowyAdresException{
        String bledy = new String();
        if (ulica == null) {
            bledy+=("Ulica nie może być nullem ");
        }
        if (numerDomu <= 0) {
            bledy+=("Numer domu musi być większy od zera ");
        }
        if (kodPocztowy == null) {
            bledy+=("Kod pocztowy nie może być nullem ");
        }
        if (miasto == null) {
            bledy+=("Miasto nie może być nullem ");
        }
        if (!bledy.isEmpty()) {
            throw new NieprawidlowyAdresException(bledy);
        }
        this.numerDomu = numerDomu;
        this.ulica = ulica;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
    }


}
