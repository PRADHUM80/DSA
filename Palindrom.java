import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
    

        int original = a;
        int reverse = 0;

        while(a > 0) {
            int digit = a % 10;
            reverse = reverse * 10 + digit;
            a = a / 10;
        }

        if(original == reverse) {
            System.out.println("The number is Palindrome");
        } else {
            System.out.println("The number is not Palindrome");
        }
    }
}