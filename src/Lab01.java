import java.util.Random;
import java.util.Scanner;

public class Lab01 {

    public static void main(String[] args) {
        System.out.println("Name: " + name()); // Task 1
        System.out.println("Age: " + age());

        System.out.println("Give number to calc"); // Task 2
        double a = inputDouble();
        double b = inputDouble();
        calc(a, b);

        System.out.println("Give number to check if even."); // Task 3
        a = inputDouble();
        if (isEven(a)) {
            System.out.println("Even.");
        } else {
            System.out.println("Odd.");
        }

        System.out.println("Give number to check if dev by 3 && 5."); // Task 4
        a = inputDouble();
        if (isDev3n5(a)){
            System.out.println("Yes.");
        } else {
            System.out.println("No.");
        }

        System.out.println("Give number to power3."); // Task 5
        a = inputDouble();
        System.out.println("a^3 = " + power3(a));

        System.out.println("Give number to square."); // Task 6
        a = inputDouble();
        System.out.println("sqrt a = " + sqrtA(a));


        // Task 7
        System.out.println("Give lower bound.");
        a = inputDouble();
        System.out.println("Give upper bound.");
        b = inputDouble();

        Random random = new Random();
        double randA = ((double) Math.round(random.nextDouble(a, b) * 100) /100);
        double randB = ((double) Math.round(random.nextDouble(a, b) * 100) /100);
        double randC = ((double) Math.round(random.nextDouble(a, b) * 100) /100);

        if (canTriangle(randA, randB, randC)){
            System.out.println("Yes:");
            System.out.println("a = " + randA);
            System.out.println("b = " + randB);
            System.out.println("c = " + randC);
        } else {
            System.out.println("No:");
            System.out.println("a = " + randA);
            System.out.println("b = " + randB);
            System.out.println("c = " + randC);
        }




    }

    public static int age() {
        return 11;
    }

    public static String name() {
        return "Dominik";
    }
    public static boolean canTriangle(double a, double b, double c){
        return (a * a) + (b * b) == (c * c);
    }

    public static double sqrtA(double a){
        return  Math.sqrt(a);
    }

    public static double power3(double a){
        return a*a*a;
    }

    public static boolean isDev3n5(double a) {
        return a % 3 == 0 && a % 5 == 0;
    }

    public static boolean isEven(double a) {
        return a % 2 == 0;
    }

    public static void calc(double a, double b) {
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
    }

    public static double inputDouble() {
        Scanner input = new Scanner(System.in);
        System.out.println("Give number:");
        return input.nextDouble();

    }
}