package Lab06.Task2;

import java.util.Scanner;

public class Inputs {
    private Scanner scan = new Scanner(System.in);

    public String inputRegularString(String text){
        System.out.print(text);
        return scan.nextLine();
    }
    public int inputRegularInt(String text){
        System.out.print(text);
        return scan.nextInt();
    }
}
