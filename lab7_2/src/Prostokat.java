
class Prostokat extends Figura implements IFigury  {
	int wys=0;
	int szer=0;
	
	Prostokat(int wys,int szer,String kolor){
		this.wys = wys;
		this.szer = szer;
		super.kolor = kolor;
	}
	@Override
	public String opis() {
		return "Prostokat o wymairach: "+szer+" x "+wys;
	}

	@Override
	public float getPowierzchnia() {
		return wys*szer;
	}

	@Override
	public boolean wPolu() {
		return false;
	}

	@Override
	public boolean wPolu(Punkt p) {
		return p.x < szer && p.y < wys;
	}

	@Override
	public void skaluj(int skala) {
		this.wys = this.wys * skala;
	}
}