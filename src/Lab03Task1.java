import java.util.Scanner;

public class Lab03Task1 {
    public static void main(String[] args) {
        //Task1

        int n = 0;

        while (n < 1){
            n = inputInt();
        }

        Double[] studArray = new Double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Input score for student " + (i+1) + ":");
            studArray[i] = inputDouble();
        }

        double sum = 0;
        int i = 0;
        while (i < n){
            sum += studArray[i];
            i++;
        }
        System.out.println("Avg score:");
        System.out.println(sum/n);
    }

    public static int inputInt(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number of students: ");
        return scan.nextInt();
    }
    public static double inputDouble(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input score: ");
        return scan.nextDouble();
    }
}
