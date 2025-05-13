enum PizzaClass {
    MALA(13),
    SREDNIA(17),
    DUZA(20);
    private int srednica;
    // Konstruktor
    PizzaClass(int srednica) {
        this.srednica = srednica;
    }
    public int getCena() {
        switch (srednica){
            case 13:
                return 20;
            case 17:
                return 30;
            case 20:
                return 40;
        }
        return 0;
    }
}
