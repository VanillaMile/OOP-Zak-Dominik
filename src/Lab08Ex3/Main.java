package Lab08Ex3;

public class Main {
    public static void main(String[] args) {
        int[] n = {5, 2, 2};
        int sum = 0;
        try{
            for(int i = 0; i < 4; i++){
                sum += n[i];
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Sum = " + sum);
        }
    }
}
