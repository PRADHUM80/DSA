import java.util.Scanner;

public class PalindromString {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        String original = str;
        String reverse = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        if(original.equals(reverse)) {
            System.out.println("The String is Palindrome");
        } else {
            System.out.println("The String is not Palindrome");
        }
    }
}
