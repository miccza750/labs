enum Swiatlo {
    CZERWONE("Stop!"),
    ZIELONE("Jedź"),
    ZÓŁTE("Uwaga");
    private String opis;

    Swiatlo(String opis) {
        this.opis = opis;
    }

    public String getKomunikat() {
        return opis;
    }
    }

