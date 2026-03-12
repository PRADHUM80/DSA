import java.util.Scanner;

public class RotateArray {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number of rotations:");
        int k = sc.nextInt();

        // Rotation logic
        for(int r = 0; r < k; r++) {
            int last = arr[n-1];

            for(int i = n-1; i > 0; i--) {
                arr[i] = arr[i-1];
            }

            arr[0] = last;
        }

        System.out.println("Array after rotation:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
