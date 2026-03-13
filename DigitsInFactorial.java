import java.util.Scanner;

public class DigitsInFactorial {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        double sum = 0;
        for(int i = 1; i <= n; i++) {
            sum = sum + Math.log10(i);
        }
        int digits = (int)sum + 1;
        System.out.println("The number of digits in " + n + "! is: " + digits);
    }
}
