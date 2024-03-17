import java.util.Random;
import java.util.Scanner;

public class Lab03Task4 {
    public static void main(String[] args) {
        int n = 0;
        while(n < 1){
            n = inputInt();
        }

        double[] data = new double[n];
        inputRandoms(data);
        System.out.println("Sum of positives: " + sumOfPositives(data));

    }
    public static int inputInt(){
        Scanner scan = new Scanner(System.in);
            System.out.println("Input n: ");
            return scan.nextInt();
    }
    public static void inputRandoms(double[] data){
        Random randNum = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = randNum.nextDouble(-10,45);
        }
    }
    public static double sumOfPositives(double[] data){
        double sum = 0;
        for (double item : data){
            if(item > 0){
                sum += item;
            }
        }
        return sum;
    }
}
