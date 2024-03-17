import java.util.Scanner;

public class Lab02Task6 {
    public static void main(String[] args) {
        double a = inputDouble("Input a: ");
        double b = inputDouble("Input b: ");

        System.out.println("Menu:");
        System.out.println("1.Add");
        System.out.println("2.Sub");
        System.out.println("3.Mul");
        System.out.println("4.Div");
        System.out.println("5.Rem");

        printOperation(a, b, inputIntM());
    }
    public static int inputIntM(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        int x = scan.nextInt();
        return (x < 6 && x > 0) ? x : inputIntM();
    }
    public static double inputDouble(String text){
        System.out.print(text);
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }
    public static void printOperation(double a, double b, int x){
        switch (x){
            case 1:
                System.out.println(a + " + " + b + " = " + (a+b));
                break;
            case 2:
                System.out.println(a + " - " + b + " = " + (a-b));
                break;
            case 3:
                System.out.println(a + " * " + b + " = " + (a*b));
                break;
            case 4:
                System.out.println(a + " / " + b + " = " + (a/b));
                break;
            case 5:
                System.out.println(a + " % " + b + " = " + (a%b));
                break;
            default:
                throw new IllegalStateException("Unexpected value");
        }
    }
}
