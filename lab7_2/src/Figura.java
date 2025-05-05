//deklaracja klasy abstrakcyjnej

public abstract class Figura implements IFigury{
	
	//pola metody i kontruktory
	Punkt punkt;
	String kolor = "bialy";
	
	
	Figura(){
		punkt = new Punkt(0,0);
	}
	Figura(String kolor){
		this.kolor=kolor;
	}
	Figura(Punkt punkt){
		this.punkt=punkt;
	}
	String getKolor(){
		return kolor;
	}
	//metody abstrakcyjne
	public abstract String opis();
	public abstract void skaluj(int skala);
	public abstract float getPowierzchnia();
	public abstract boolean wPolu();

	public void przesun(int x, int y) {
	}
}
