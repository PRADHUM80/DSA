import java.util.Scanner;

public class ThirdLargest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        
        if (n < 3) {
            System.out.println("Invalid Input. Array must have at least 3 elements.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {
            // Case 1: New largest found
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } 
            // Case 2: New second largest found (and not a duplicate of first)
            else if (num > second && num != first) {
                third = second;
                second = num;
            } 
            // Case 3: New third largest found (and not a duplicate of first/second)
            else if (num > third && num != first && num != second) {
                third = num;
            }
        }

        if (third == Integer.MIN_VALUE) {
            System.out.println("There is no distinct third largest element.");
        } else {
            System.out.println("Third Largest element is: " + third);
        }
    }
}
