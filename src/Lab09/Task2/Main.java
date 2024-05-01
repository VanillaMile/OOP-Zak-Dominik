package Lab09.Task2;

import java.util.*;

import static Lab09.Task1.Main.inputName;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();
        inputName(people);
        System.out.print("Input name to find partner for: ");
        Scanner scan = new Scanner(System.in);
        String name = "";
        try{
            name = scan.nextLine();
        } catch (InputMismatchException e){
            System.out.println(e.getMessage());
        } finally {
            if(people.contains(name)){
                Random rand = new Random();
                System.out.println("Partner for " + name + ": " + people.get(rand.nextInt(0, people.size() - 1)));
            } else {
                System.out.println("No " + name + " in set.");
            }
        }
    }

}

