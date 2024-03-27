package Lab06.Task1;

public class Ring extends Figura{
    private Point middle = new Point();
    private double r;

    public Ring() {
        middle = new Point(0,0);
        this.r = 0;
    }
    public Ring(double x, double y, double r) {
        middle = new Point(x,y);
        this.r = r;
    }
    public Ring(Point middle, double r) {
        this.middle = middle;
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }
    public double getArea(){
        return Math.PI*r*r;
    }
    public double getDiameter(){
        return r+r;
    }
    public boolean isInside(Point otherPoint){
        return (middle.getX() - otherPoint.getX()) * (middle.getX() - otherPoint.getX()) +
                (middle.getY() - otherPoint.getY()) * (middle.getY() - otherPoint.getY()) <= r * r;
    }
    public String opis(){
        return "Middle: ("+ middle.getX() + ", " + middle.getY() + ")\n" + "Radius: " + r + "\n" +
                "Diameter: " + getDiameter() + "\n";
    }
}
