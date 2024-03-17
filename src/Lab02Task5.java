import java.util.Scanner;

public class Lab02Task5 {
    public static void main(String[] args) {
        boolean discount = inputBool("is there discount?\n[y/n]:");
        boolean bonus = inputBool("did you get bonus?\n[y/n]:");

        System.out.println(canYouBuyCar(discount, bonus));
    }

    public static boolean inputBool(String text) {
        System.out.print(text);
        Scanner scan = new Scanner(System.in);
        char x = scan.nextLine().charAt(0);
        if (x == 'y' || x == 'n') {
            return x == 'y';
        }
        return inputBool(text);
    }
    public static String canYouBuyCar(boolean discount, boolean bonus) {
        if (bonus && !discount) {
            return "You can buy a car, there is no discount";
        }
        if (!bonus && !discount) {
            return "You will have to wait, there is no discount";
        }
        if (!bonus) {
            return "There is a discount";
        }
        return "You can buy a car ";
    }
}
