package Lab06.Task1;
class Trojkat extends Figura
{
	double wys=0, podst=0;

	Trojkat(double wys, double podst)
	{
		this.wys = wys;
		this.podst = podst;
	}
	public String opis(){
		return "Trojkat: \n" + "Wys= " + wys + "\nPodst= "+ podst + "\n";
	}
}