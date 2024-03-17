import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Lab03Task2 {
    public static void main(String[] args) {
        double[] data = new double[10];

        for (int i = 0; i < data.length; i++) {
            data[i] = inputDouble();
        }

        PositiveNegative(data);

    }

    public static double inputDouble(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number: ");
        return scan.nextDouble();
    }
    public static void PositiveNegative(double[] data){
        int negatives = 0;
        double[] negativesA = new double[data.length];
        int positives = 0;
        double[] positivesA = new double[data.length];
        int zero = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > 0){
                positives += 1;
                positivesA[i] = data[i];
                continue;
            }
            if (data[i] < 0){
                negatives += 1;
                negativesA[i] = data[i];
                continue;
            }
            zero += 1;
        }
        System.out.println("Positives: " + positives);
        System.out.println("Negatives: " + negatives);
        System.out.println("Unsigned: " + zero);
        System.out.println("Sum of positives: " + DoubleStream.of(positivesA).sum());
        System.out.println("Sum of negatives: " + DoubleStream.of(negativesA).sum());
    }
}
