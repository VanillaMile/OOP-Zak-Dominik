package Lab06.Task2;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle;
        Car car1, car2;
        Inputs input = new Inputs();
        vehicle = new Vehicle(
                input.inputRegularString("Input Brand: "),
                input.inputRegularString("Input Model: "),
                input.inputRegularInt("Input body number:"),
                input.inputRegularString("Input Color: "),
                8,
                90);

        vehicle.view();
    }
}
