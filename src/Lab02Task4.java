import java.util.Scanner;

public class Lab02Task4 {
    public static void main(String[] args) {
        boolean rain = inputBool("is it raining?\n[y/n]:");
        boolean bus = inputBool("is there bus?\n[y/n]:");

        System.out.println(willYouMakeIt(rain, bus));
    }
    public static boolean inputBool(String text){
        System.out.print(text);
        Scanner scan = new Scanner(System.in);
        char x = scan.nextLine().charAt(0);
        if (x == 'y' || x == 'n'){
            return x == 'y';
        }
        return inputBool(text);
    }
    public static String willYouMakeIt(boolean rain, boolean bus){
        if(rain && bus){
            return "Take umbrella, you will make it";
        }
        if(rain){
            return "You won't make it";
        }
        if(bus){
            return "You'll make it \n Have a nice day";
        }
        return "You'll make it, \nbut you have to walk";
    }
}
