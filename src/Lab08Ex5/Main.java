package Lab08Ex5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        randomNumbers();
    }

    public static void randomNumbers(){
        Random rand = new Random();
        int i = 0;
        int j = 0;
        int tries = 3;

        while(tries > 0){
            try{
                i = rand.nextInt(-10, 10);
                j = rand.nextInt(-10, 10);
                System.out.println(i + "/" + j + " = " + i/j);
            } catch (ArithmeticException e){
                System.out.println("Error: " + e.getMessage());
                tries -= 1;
            }
        }
    }
}
