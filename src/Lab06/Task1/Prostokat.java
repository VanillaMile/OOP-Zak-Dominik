package Lab06.Task1;
class Prostokat extends Figura{
	double wys=0, szer=0;
	
	Prostokat(double wys,double szer){
		this.wys = wys;
		this.szer = szer;
	}

	public Prostokat(String kolor, double wys, double szer) {
		super(kolor);
		this.wys = wys;
		this.szer = szer;
	}
	public Prostokat(Point point, double wys, double szer) {
		super(point);
		this.wys = wys;
		this.szer = szer;
	}

	public void move(float x, float y){
		this.punkt.setX(this.punkt.getX() + x);
		this.punkt.setY(this.punkt.getY() + y);
	}

	public double getPowierzchnia() {
        return (szer * wys);
    }
	public String opis(){
		return "Prostokat: \nKolor=  " + kolor + "\nWys= " + wys + "\nSzer= "+ szer + "\n";
	}
    
    
}