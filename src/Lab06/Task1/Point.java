package Lab06.Task1;

public class Point {
    private double x,y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {return x;}

    public void setX(double x) {this.x = x;}

    public double getY() {return y;}

    public void setY(double y) {this.y = y;}
    public void set0(){
        x = 0;
        y = 0;
    }
    public void view(){
        System.out.println("Point (" + x + ", " + y + ")");
    }
    public void move(double x, double y){
        this.x += x;
        this.y += y;
    }
    public void move(int x, int y){
        this.x += x;
        this.y += y;
    }
}

