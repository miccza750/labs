import java.util.*;
class main
{
	public static void main(String[] arg)
	{
		Punkt p1 = new Punkt(1,1);
		Prostokat maly_punkt = new Prostokat(3, 6, "czerwony");
		Trojkat rownoboczny = new Trojkat(7, 4, "bia�y");
		Kwadrat kwadrat = new Kwadrat(4,"czarny");
		//maly_punkt.zwieksz(3,4);
		Figura[] tablicaFigur = new Figura[10];
		tablicaFigur[0] = new Prostokat(3, 9,"czarny");
		tablicaFigur[1] = rownoboczny;
		tablicaFigur[2] = new Kwadrat(2,"niebieski");
		tablicaFigur[3] = kwadrat;
		tablicaFigur[4] = rownoboczny;
		tablicaFigur[5] = kwadrat;
		tablicaFigur[6] = new Prostokat(1, 2,"czerwony");
		tablicaFigur[7] = rownoboczny;
		tablicaFigur[8] = new Kwadrat(3,"zielony");
		tablicaFigur[9] = rownoboczny;
		for(int i=0;i<10;i++){
		//	System.out.printf("\n");
		//	System.out.printf(tablicaFigur[i].opis());
		}
		Figura[] tabFigur = new Figura[4];

		tabFigur[0] = new Prostokat(4, 6,"rozowy");
		tabFigur[1] = new Kwadrat(4,"czerwony");
		tabFigur[2] = new Trojkat(4, 61,"bialy");
		for (int i = 0; i < 3; i++) {
			tabFigur[i].getPowierzchnia();
		}
		tabFigur[0].getPowierzchnia();
		tabFigur[3] = new Okrag("rozowy",p1,3);
		tabFigur[3].przesun(1,12);
		System.out.print(tabFigur[3].punkt);
	}
}