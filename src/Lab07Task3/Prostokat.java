package Lab07Task3;

class Prostokat extends Figura implements IFigury{
	int wys=0;
	int szer=0;
	
	Prostokat(int wys,int szer,String kolor){
		this.wys = wys;
		this.szer = szer;
		super.kolor = kolor;
	}
	public String opis(){
		return "Prostokat o wymairach: "+szer+" x "+wys;
	}

	@Override
	public void skaluj(float skala) {
		System.out.println("Skaluje o " + skala);
	}

	@Override
	public float getPowierzchnia() {
		return 0;
	}

	@Override
	public boolean wPolu(Punkt p) {
		return false;
	}
}