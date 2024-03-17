import java.util.Scanner;

public class Lab02Task3 {
    public static void main(String[] args) {
        double x = inputDouble("Input x:");
        double y = inputDouble("Input y:");
        double z = inputDouble("Input z:");

        double[] data = new double[]{x, y, z};
        sort3(data);
        System.out.println("Sorted min to max: " + data[0] + ", " + data[1] + ", " +  data[2]);

    }
    public static double inputDouble(String text){
        System.out.print(text);
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }
    public static void sort3(double[] data){
        double temp;
        for (int i = 0; i < 2; i++) {
            if (data[i] > data[i + 1]) {
                temp = data[i];
                data[i] = data[i+1];
                data[i+1] = temp;
            }
        }
        if (data[0] > data[1]) {
            temp = data[0];
            data[0] = data[1];
            data[1] = temp;
        }
    }
}
