import java.util.Random;

public class Lab03Task3 {
    public static void main(String[] args) {
        int n = 10;
        double[] data = new double[n];
        inputRandoms(data);

        System.out.println("Sum of positive: " + sumOfPositives(data));

    }
    public static void inputRandoms(double[] data){
        Random randNum = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = randNum.nextDouble(-10,10);
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
