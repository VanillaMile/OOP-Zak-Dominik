package Lab05Task1Package;

public class Cone {
    private String name;
    private double radius;
    private double height;

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public double getRadius() {return radius;}
    public double getHeight() {return height;}

    public void setRadius(double radius) {this.radius = radius;}
    public void setHeight(double height) {this.height = height;}

    //a2 + b2 = c2
    public double area(double radius, double height){
        return radius*(Math.sqrt(radius*radius+height*height))+Math.PI*radius*radius;
    }
    public double volume(double radius, double height){return (1.0/3.0)*Math.PI*radius*radius*height;}
    public void view(){
        System.out.format("Figure: %s, radius: %.2f, height: %.2f, area: %.2f, volume: %.2f \n",
                name, radius, height, area(radius, height),volume(radius, height));
    }
}
