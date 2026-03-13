import java.util.Scanner;

public class LCM {
    
    static int gcd(int a, int b) {

        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " numbers: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = arr[0];
        for(int i = 1; i < n; i++) {
            res = lcm(res, arr[i]);
        }
        System.out.println("LCM of the array is: " + res);
    }
}
