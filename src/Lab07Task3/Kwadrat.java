package Lab07Task3;

class Kwadrat extends Prostokat implements IFigury{
	Kwadrat(int bok,String kolor){
		super(bok,bok,kolor);
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