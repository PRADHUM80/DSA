import java.util.Scanner;

public class AntiClockwiseRotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements of array");
        for(int i = 0; i <= n-1; i++) 
        {
            arr[i] = sc.nextInt();
        }


        // Logic..
        int first = arr[0];
        for(int i = 0; i < n-1; i++) 
        {
            arr[i] = arr[i + 1]; // Shift all elements one position to the left.
        }
         
            arr[n -1] = first; // Place the first elemnts at the last position

            // print
            for(int i = 0; i < n; i++)
            {
                System.out.print(arr[i] + " ");
            }
    }
    
}
