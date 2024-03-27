package Lab06.Task2;

import java.util.Scanner;

public class Vehicle {
    private String brand;
    private String model;
    private int body;
    private String color;
    private int productionYear;
    private double mileage;

    public Vehicle(String brand, String model, int body, String color, int productionYear, double mileage) {
        this.brand = brand;
        this.model = model;
        this.body = body;
        this.color = color;
        this.productionYear = productionYear;
        this.mileage = mileage;
    }

    Scanner scan = new Scanner(System.in);
    public Vehicle(){
        brand = getString("Input brand: ");
        model = getString("Input Model: ");
    }
    private String getString(String text){
        System.out.print(text);
        return scan.nextLine();
    }

    public void view(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Body: " + body);
        System.out.println("Color: " + color);
        System.out.println("Production Year: " + productionYear);
        System.out.println("Mileage: " + mileage);
    }
}
