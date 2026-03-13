import java.util.Scanner;

public class PrimeNo {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        int count = 0;
        int num = 1;

        while(count < n) {
            num++;
            if(isPrime(num)) {
                count++;
            }
        }
        System.out.println(num);
    }

    public static boolean isPrime(int x) {
        if(x <= 1) {
            return false;
        }
        for(int i = 2; i <= x /2; i++) {
            if(x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
