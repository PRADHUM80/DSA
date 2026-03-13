import java.util.Scanner;

public class PerfectSquare {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int i = 1;

        while( i * i < n) {
            i++;
            if( i * i == n) {
                System.out.println(n + " is a perfect square.");
                return;
            }
        }
        System.out.println(n + " is not a perfect square.");
    }
}
