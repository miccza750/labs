enum PizzaClass {
    MALA(13),
    SREDNIA(17),
    DUZA(20);
    private int cena;
    // Konstruktor
    PizzaClass(int cena) {
        this.cena = cena;
    }
    public int getCena() {
        return cena;
    }
}
