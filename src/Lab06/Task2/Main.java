package Lab06.Task2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle("Brand2", "Model2", 3, "Blue", 1998, 9.99);

        car.view();
        vehicle1.view();
        vehicle2.view();
    }
}
