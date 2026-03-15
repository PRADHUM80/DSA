import java.util.Scanner;

public class Rotate1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        k = k % n; // In case k is greater than n

        // print the last k elements
        for(int i = n -k; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // print the first n-k elements
        for(int i = 0; i < n - k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
