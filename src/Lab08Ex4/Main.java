package Lab08Ex4;

public class Main {
    public static void main(String[] args) {
        int n = 1;
        try{
            new DivBy0Test(n);
            System.out.println("Div 9/" + n + ": " + 9/n);
        } catch (DivBy0Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
