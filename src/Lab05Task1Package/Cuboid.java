package Lab05Task1Package;

public class Cuboid {
    private String name;
    private double[] edge = new double[3];
    // height
    // length
    // width

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public double[] getEdge() {return edge;}

    public void setEdge(double edgeA, double edgeB, double edgeC) {
        this.edge[0] = edgeA;
        this.edge[1] = edgeB;
        this.edge[2] = edgeC;
    }

    public double area(double[] edge){
        return (edge[0]*edge[1]*2)+(edge[0]*edge[2]*2)+(edge[1]*edge[2]*2);
    }
    public double volume(double[] edge){return edge[0]*edge[1]*edge[2];}
    public void view(){
        System.out.format("Figure: %s, height: %.2f, length: %.2f, width: %.2f, 2f area: %.2f, volume: %.2f \n",
                name, edge[0], edge[1], edge[2],area(edge),volume(edge));
    }
}
