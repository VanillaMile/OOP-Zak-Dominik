package Lab05Task1Package;

import java.util.Scanner;

public class Run {
    public void Running(){
        int choice;
        while(true){
            Menu();
            choice = inputInt("Select(input number): ");
            if(choice == 99){break;}
            switch (choice){
                case 1 -> setCircle();
                case 2 -> setSquare();
                case 3 -> setRectangle();
                case 4 -> setCube();
                case 5 -> setCuboid();
                case 6 -> setSphere();
                case 7 -> setCone();
                default -> System.out.println("Error");
            }
            switch (choice){
                case 1 -> circle.view();
                case 2 -> square.view();
                case 3 -> rectangle.view();
                case 4 -> cube.view();
                case 5 -> cuboid.view();
                case 6 -> sphere.view();
                case 7 -> cone.view();
                default -> System.out.println("Error");
            }
        }
    }
    public void Menu(){
        System.out.println("Menu:");
        System.out.println("1.Circle.");
        System.out.println("2.Square.");
        System.out.println("3.Rectangle.");
        System.out.println("4.Cube.");
        System.out.println("5.Cuboid.");
        System.out.println("6.Sphere.");
        System.out.println("7.Cone.");
        System.out.println("99.Exit.");
    }
    public int inputInt(String text){
        Scanner scan = new Scanner(System.in);
        System.out.print(text);
        int num = scan.nextInt();
        return ((num > 0 && num < 8) || num == 99) ? num : inputInt("Invalid choice, try again:");
    }
    public double inputDouble(String text){
        Scanner scan = new Scanner(System.in);
        System.out.print(text);
        double num = scan.nextDouble();
        if(!(num > 0)){
            System.out.println("Number is less than 0, changing to: " + Math.abs(num));
        }
        return (num > 0) ? num : Math.abs(num);
    }
    Circle circle = new Circle();
    Square square = new Square();
    Rectangle rectangle = new Rectangle();
    Cube cube = new Cube();
    Cuboid cuboid = new Cuboid();
    Sphere sphere = new Sphere();
    Cone cone = new Cone();
    private void setCircle(){
        circle.setName("Circle");
        circle.setR(inputDouble("Input radius: "));
    }
    private void setSquare(){
        square.setName("Square");
        square.setSide(inputDouble("Input side: "));
    }

    private void setRectangle(){
        rectangle.setName("Rectangle");
        rectangle.setSide(inputDouble("Input sideA: "), inputDouble("Input sideB: "));
    }
    private void setCube(){
        cube.setName("Cube");
        cube.setEdge(inputDouble("Input edge: "));
    }
    private void setCuboid(){
        cuboid.setName("Cuboid");
        cuboid.setEdge(inputDouble("Input Height: "), inputDouble("Input Width: "), inputDouble("Input Length: "));
    }
    private void setSphere(){
        sphere.setName("Sphere");
        sphere.setR(inputDouble("Input Radius: "));
    }
    private void setCone(){
        cone.setName("Cone");
        cone.setRadius(inputDouble("Input Radius: "));
        cone.setHeight(inputDouble("Input Height: "));
    }
}
