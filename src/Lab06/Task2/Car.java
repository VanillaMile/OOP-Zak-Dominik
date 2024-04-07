package Lab06.Task2;

public class Car extends Vehicle{
    private double weight;
    private double engineCap;
    private int passengerCap;

    public Car(String brand, String model, int body, String color, int productionYear, double mileage, double weight, double engineCap, int passengerCap) {
        super(brand, model, body, color, productionYear, mileage);
        setWeight(weight);
        setEngineCap(engineCap);
        setPassengerCap(passengerCap);
    }
    public Car() {
        super();
        this.weight = getDouble("Input weight in kg: ", 0);
        this.engineCap = getDouble("Input engine capacity in liters: ", 0);
        this.passengerCap = getInt("Input passenger capacity: ", 0, 20);
    }

    private double getWeight() {return weight;}
    private void setWeight(double weight) {this.weight = weight;}
    private double getEngineCap() {return engineCap;}
    private void setEngineCap(double engineCap) {this.engineCap = engineCap;}
    private int getPassengerCap() {return passengerCap;}
    private void setPassengerCap(int passengerCap) {this.passengerCap = passengerCap;}

    public void view(){
        super.view();
        System.out.println("Weight: " + getWeight());
        System.out.println("Engine capacity: " + getEngineCap());
        System.out.println("passenger capacity: " + getPassengerCap());
    }
}
