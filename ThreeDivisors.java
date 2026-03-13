// 3 Divisor count and square 

import java.util.Scanner;

public class ThreeDivisors {

    public static boolean isPrime(int n) {
        if(n < 2) return false;

        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println("Enter a number:");
        int limit = (int)Math.sqrt(N);
        int count = 0;

        for(int i = 2; i <= limit; i++) {
            if(isPrime(i)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
