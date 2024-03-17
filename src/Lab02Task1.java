import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Lab02Task1 {
    public static void main(String[] args) {
        double a, b, c;

        a = inputDouble("Input a:");
        b = inputDouble("Input b:");
        c = inputDouble("Input c:");

        calculateXs(a, b, c);
    }

    public static double inputDouble(String text){
        System.out.print(text);
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }

    public static void calculateXs(double a, double b, double c){
        double delta = b*b - 4*a*c;
        if(delta < 0){
            System.out.println("Delta is negative");
            return;
        }
        if (delta == 0){
            System.out.println("Delta is 0, X = " + (-b/2*a));
            return;
        }
        System.out.println("X1 = " + ((-b+sqrt(delta))/2*a));
        System.out.println("X1 = " + ((-b-sqrt(delta))/2*a));
    }

}
