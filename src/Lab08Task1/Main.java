package Lab08Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        doSqrt();
    }

    public static void doSqrt(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        String input = scan.nextLine();
        try {
            double inputDouble = Double.parseDouble(input);
            if(inputDouble < 0f) throw new IllegalArgumentException("Number is less than 0");
            System.out.println("Sqrt(" + inputDouble + "): " + Math.sqrt(inputDouble));
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
