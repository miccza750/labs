
class Trojkat extends Figura
{
	float wys=0, podst=0;

	Trojkat(float wys, float podst)
	{
		this.wys = wys;
		this.podst = podst;
	}

	public Trojkat(float podst, float wys,String kolor) {
		super();
		this.podst = podst;
		this.wys = wys;
		this.kolor = kolor;

	}
	@Override
	public String opis() {
		return "\nTrojkat, podst: " + this.podst + " wysokość: " + this.wys + "kolor: " + this.kolor;
	}
}
