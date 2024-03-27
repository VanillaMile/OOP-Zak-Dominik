package Lab06.Task1;

public class Square extends Prostokat{
    public Square(double wys, double szer) {
        super(wys, szer);
    }
    public double getWys(){
        return super.wys;
    }
    public double getSzer(){
        return super.szer;
    }
    public void setWys(double wys){
        super.wys = wys;
    }
    public void setSzer(double szer){
        super.szer = szer;
    }
}
