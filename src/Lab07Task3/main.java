package Lab07Task3;

class main
{
	public static void main(String[] arg)
	{
		Prostokat prostokat = new Prostokat(3, 6, "czerwony");
		Trojkat trojkat = new Trojkat(7, 4, "bia³y");
		Kwadrat kwadrat = new Kwadrat(4, "Blue");

		System.out.println(prostokat.opis());
		System.out.println(trojkat.opis());
		System.out.println(kwadrat.opis());

		Figura[] tab = new Figura[10];

		tab[0] = new Prostokat(5, 6, "Yellow");
		tab[1] = new Kwadrat(6, "Green");
		tab[2] = new Kwadrat(7, "Green");
		tab[3] = new Kwadrat(8, "Green");
		tab[4] = new Kwadrat(9, "Green");
		tab[5] = new Kwadrat(10, "Green");
		tab[6] = new Kwadrat(11, "Green");
		tab[7] = new Kwadrat(12, "Green");
		tab[8] = new Kwadrat(13, "Green");
		tab[9] = new Kwadrat(14, "Green");

		System.out.println(tab[0].opis());
		System.out.println(tab[1].opis());
		System.out.println(tab[2].opis());
		System.out.println(tab[3].opis());
		System.out.println(tab[4].opis());
		System.out.println(tab[5].opis());
		System.out.println(tab[6].opis());
		System.out.println(tab[7].opis());
		System.out.println(tab[8].opis());
		System.out.println(tab[9].opis());
		tab[0].skaluj(5);

		IFigury[] iFigury = new IFigury[3];
		iFigury[0] = new Kwadrat(5, "Blue");
		iFigury[1] = new Prostokat(5, 6, "Blue");
		iFigury[2] = new Trojkat(5, 6, "Yellow");

		System.out.println(iFigury[0].getPowierzchnia());
		System.out.println(iFigury[0].wPolu(new Punkt(2,5)));
		System.out.println(iFigury[1].getPowierzchnia());
		System.out.println(iFigury[1].wPolu(new Punkt(3,5)));
		System.out.println(iFigury[2].getPowierzchnia());
		System.out.println(iFigury[2].wPolu(new Punkt(4,5)));

		Okrag okrag = new Okrag();
		okrag.skaluj(4);
		okrag.przesun(3,4);
	}
}