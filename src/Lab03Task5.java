import java.util.Scanner;

public class Lab03Task5 {
    public static void main(String[] args) {
        String word;
        System.out.println("Input word:");
        word = inputString();

        if(isPalindrome(word)){
            System.out.println("is palindrome");
        } else {
            System.out.println("is not palindrome");
        }

        System.out.println(Lab01.age());

    }
    public static String inputString(){
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
    public static boolean isPalindrome(String word){
        for (int i = 0; i < word.length() /2; i++) {
            if(word.charAt(i) != word.charAt(word.length()-1-i)){
                return false;
            }
        }
        return  true;
    }
}
