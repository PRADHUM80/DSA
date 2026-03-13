import java.util.Scanner;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        int largestPrime = 1;
        for(int i = 2; i <= n; i++) {
            while(n % i == 0) {
                largestPrime = i;
                n = n / i;
            }
        }
        System.out.println("The largest prime factor is: " + largestPrime);
        sc.close();
    }
}
