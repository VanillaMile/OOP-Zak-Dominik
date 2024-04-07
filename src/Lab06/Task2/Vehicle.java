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

    private Scanner scan = new Scanner(System.in);
    public Vehicle(){
        scan.useDelimiter("\n");
        brand = getString("Input brand: ");
        model = getString("Input Model: ");
        body = getInt("Input Body number: ", -1);
        scan.nextLine();
        color = getString("Input Color: ");
        productionYear = getInt("Input production year: ", 1600);
        mileage = getDouble("Input Mileage: ", -1);
    }
    protected String getString(String text){
        System.out.print(text);
        return scan.nextLine();
    }
    protected int getInt(String text, int minValue){
        int input = 0;
        while (true){
            System.out.print(text);
            input = scan.nextInt();
            if(input>minValue) return input;
            System.out.println("Invalid input, try again");
        }
    }
    protected int getInt(String text, int minValue, int maxValue){
        int input = 0;
        while (true){
            System.out.print(text);
            input = scan.nextInt();
            if(input > minValue && input < maxValue) return input;
            System.out.println("Invalid input, try again");
        }
    }
    protected double getDouble(String text, double minValue){
        double input = 0;
        while (true){
            System.out.print(text);
            input = scan.nextDouble();
            if(input>minValue) return input;
            System.out.println("Invalid input, try again");
        }
    }
    protected double getDouble(String text, double minValue, double maxValue){
        double input = 0;
        while (true){
            System.out.print(text);
            input = scan.nextDouble();
            if(input>minValue && input < maxValue) return input;
            System.out.println("Invalid input, try again");
        }
    }

    private String getBrand() {return brand;}
    private String getModel() {return model;}
    private int getBody() {return body;}
    private String getColor() {return color;}
    private int getProductionYear() {return productionYear;}
    private double getMileage() {return mileage;}

    public void view(){
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Body: " + getBody());
        System.out.println("Color: " + getColor());
        System.out.println("Production Year: " + getProductionYear());
        System.out.println("Mileage: " + getMileage());
    }
}
