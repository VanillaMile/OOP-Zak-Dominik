import java.util.Scanner;

public class Lab02Task2 {
    public static void main(String[] args) {
        double x = inputDouble("Input x:");
        System.out.println("a(x) = " + getValueA(x));
        System.out.println("b(x) = " + getValueB(x));
        System.out.println("c(x) = " + getValueC(x));
    }
    public static double inputDouble(String text){
        System.out.print(text);
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }
    public static double getValueA(double x){
        if(x > 0){
            return 2*x;
        }
        if(x == 0){
            return 0;
        }
        if(x < 0) {
            return -3 * x;
        }
        return 0;
    }
    public static double getValueB(double x){
        if(x >= 1){
            return x*x;
        }
        if(x < 1) {
            return x;
        }
        return 0;
    }
    public static double getValueC(double x){
        if(x > 2){
            return 2+x;
        }
        if(x == 2){
            return 8;
        }
        if(x < 2) {
            return x-4;
        }
        return 0;
    }
}
