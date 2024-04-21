package Lab08Ex2;

import Lab08Task3.StringException;

import java.util.Scanner;

public class InputFromConsole {


    public int EnterInt(){
        Scanner scan = new Scanner(System.in);
        String inputS = scan.next();
        try{
            return Integer.parseInt(inputS);
        } catch (NumberFormatException e){
            System.out.println("Error: " + e.getMessage());
        }
        return 9;
    }
    public double EnterDouble(){
        Scanner scan = new Scanner(System.in);
        String inputS = scan.next();
        try{
            return Double.parseDouble(inputS);
        } catch (NumberFormatException e){
            System.out.println("Error: " + e.getMessage());
        }
        return 9;
    }
    public String EnterString(){
        Scanner scan = new Scanner(System.in);
        String inputS = scan.next();
        try{
            if (inputS != null) return inputS;
            else throw new StringException("String is null");
        } catch (StringException e){
            System.out.println("Error: " + e.getMessage());
        }
        return "9";
    }
}
