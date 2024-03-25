package Lab05Task1Package;

public class Square {
    private String name;
    private double side;

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public double getSide() {return side;}

    public void setSide(double side) {this.side = side;}

    public double area(double side){
        return side*side;
    }
    public double circumference(double side){
        return side*4;
    }
    public void view(){
        System.out.format("Figure: %s, side: %.2f, area: %.2f, circumference: %.2f \n", name,side,area(side),circumference(side));
    }
}
