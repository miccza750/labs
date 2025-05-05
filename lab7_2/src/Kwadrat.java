

class Kwadrat extends Prostokat{
	@Override
	public void skaluj(int skala) {
		super.skaluj(skala);
	}

	Kwadrat(int bok, String kolor){
		super(bok,bok,kolor);

	}

	@Override
	public float getPowierzchnia() {
		return super.getPowierzchnia();
	}

	@Override
	public boolean wPolu(Punkt p) {
		return super.wPolu(p);
	}

	@Override
	public String opis() {
		return "kwadrat o boku: "+this.szer;
	}
}