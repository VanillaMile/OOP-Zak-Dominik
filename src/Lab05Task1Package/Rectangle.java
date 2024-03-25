package Lab05Task1Package;

public class Rectangle {
    private String name;
    private double[] side = new double[2];

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public double[] getSide() {return side;}

    public void setSide(double sideA, double sideB) {
        this.side[0] = sideA;
        this.side[1] = sideB;
    }

    public double area(double[] side){
        return side[0]*side[1];
    }
    public double circumference(double[] side){
        return side[0]*2+side[1]*2;
    }
    public void view() {
        System.out.format("Figure: %s, sideA: %.2f, sideB: %.2f area: %.2f, circumference: %.2f \n", name, side[0],
                side[1], area(side), circumference(side));
    }
}
