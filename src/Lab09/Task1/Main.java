package Lab09.Task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<String> people = new HashSet<>();
        inputName(people);
        for (String item : people){
            System.out.println("Name: " + item);
        }
        System.out.println("Unique names count: " + people.size());
    }
    public static void inputName(HashSet<String> peopleSet){
        Scanner scan = new Scanner(System.in);
        String text = "";
        while(true){
            try {
                System.out.print("Input name: ");
                text = scan.nextLine();
                if (text.equals("-")) break;
                else peopleSet.add(text);
            } catch (InputMismatchException e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static void inputName(ArrayList<String> peopleSet){
        Scanner scan = new Scanner(System.in);
        String text = "";
        while(true){
            try {
                System.out.print("Input name: ");
                text = scan.nextLine();
                if (text.equals("-")) break;
                else peopleSet.add(text);
            } catch (InputMismatchException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
