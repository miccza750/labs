

class Trojkat extends Figura implements IFigury {
	int wys=0;
	int podst=0;
	Trojkat(int wys,int podst,String kolor){
		
		this.wys = wys;
		this.podst = podst;
		super.kolor = kolor;
	}

	@Override
	public void skaluj(int skala) {
		this.wys = wys*skala;
		this.podst = podst*skala;
	}

	@Override
	public String opis() {
		return "trojkat o wysokosci i podstawie: "+wys+", "+podst;
	}
	@Override
	public float getPowierzchnia() {
		return wys*podst/2;
	}

	@Override
	public boolean wPolu() {
		return false;
	}

	@Override
	public boolean wPolu(Punkt p) {
		return false;
	}
}