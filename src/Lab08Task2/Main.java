package Lab08Task2;

public class Main {
    public static void main(String[] args) {
        int n = 6;
        try{
            new CheckNegative(n);
            System.out.println(FactorialEx(n));
        } catch (NegativeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static int FactorialEx(int n){
        if (n == 0) return 1;
        else return n * FactorialEx(n - 1);
    }
}
