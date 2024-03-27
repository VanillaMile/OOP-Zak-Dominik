package Lab06.Task2;

public class Car extends Vehicle{
    private double wage;
    private double engineCap;
    private int passengerCap;

    public Car(String brand, String model, int body, String color, int productionYear, double mileage, double wage, double engineCap, int passengerCap) {
        super(brand, model, body, color, productionYear, mileage);
        this.wage = wage;
        this.engineCap = engineCap;
        this.passengerCap = passengerCap;
    }
}
