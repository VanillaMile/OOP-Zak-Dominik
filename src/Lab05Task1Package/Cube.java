package Lab05Task1Package;

public class Cube {
    private String name;
    private double edge;

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public double getEdge() {return edge;}

    public void setEdge(double edge) {this.edge = edge;}

    public double area(double edge){
        return edge*edge*6;
    }
    public double volume(double edge){return edge*edge*edge;}
    public void view(){
        System.out.format("Figure: %s, edge: %.2f, area: %.2f, volume: %.2f \n", name, edge,area(edge),volume(edge));
    }
}
