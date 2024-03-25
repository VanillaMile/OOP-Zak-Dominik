package Lab05Task1Package;

public class Sphere {
    private String name;
    private double r;

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public double getR() {return r;}

    public void setR(double r) {this.r = r;}

    public double area(double r){
        return 4*Math.PI*Math.pow(r,2);
    }
    public double volume(double r){
        return (4.0/3.0)*Math.PI*Math.pow(r,3);
    }
    public void view(){
        System.out.format("Figure: %s, radius: %.2f, area: %.2f, volume: %.2f \n", name, r,area(r),volume(r));
    }
}
