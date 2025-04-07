
class Prostokat extends Figura {
	float wys=0, szer=0;
	
	Prostokat(float wys,float szer){
		this.wys = wys;
		this.szer = szer;
			
	}
	public Prostokat(float wys, float szer, String kolor) {
		super();
		this.wys = wys;
		this.szer = szer;
		this.kolor = kolor;
	}

	float getPowierzchnia() {
        return (szer * wys);
    }
	void przesun(float x, float y){
		this.punkt.x += x;
		this.punkt.y += y;
	}
	@Override
	public String opis() {
		return "\nProstokat, szerokosc: " + this.szer + " wysokość: " + this.wys + "kolor: " + this.kolor;
	}
}
