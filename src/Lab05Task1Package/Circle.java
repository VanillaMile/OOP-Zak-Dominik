package Lab05Task1Package;

public class Circle {
    private String name;
    private double r;

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public double getR() {return r;}

    public void setR(double r) {this.r = r;}

    public double area(double r){
        return Math.PI*Math.pow(r,2);
    }
    public double circumference(double r){
        return 2*Math.PI*r;
    }
    public void view1(){
        System.out.println("Figure: " + name +  ", " +
                "Radius:  " + r +  ", " +
                "Area: " + area(r) +  ", " +
                "Circumference: " + circumference(r));
    }
    public void view(){
        System.out.format("Figure: %s, radius: %.2f, area: %.2f, circumference: %.2f \n", name,r,area(r),circumference(r));
    }
}
