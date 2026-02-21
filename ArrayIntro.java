import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // Size
        System.out.println("Enter Array Length: ");
        // Size Declaration..
        int size = sc.nextInt();

        // Declaration..
        int arr[] = new int[size];
//       Enter The Elements..
        System.out.println("Enter " + arr.length + " Elements: ");
        for(int i = 0; i <= arr.length -1; i++) {
            arr[i] = sc.nextInt();
        }
// Print...
        System.out.println("Number is: ");
        for(int i = 0; i <= arr.length -1; i++) {
            System.out.println(arr[i]);
        }
    }
}
