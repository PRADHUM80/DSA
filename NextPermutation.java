import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        char[] arr = String.valueOf(n).toCharArray();

        int i = arr.length -2;
        while(i >= 0 && arr[i] >= arr[i+1]) {
            i--;
        }
        if( i < 0) {
            System.out.println(-1);
            return;
        }

        int j = arr.length - 1;
        while(arr[j] <= arr[i]) {
            j--;
        }

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        Arrays.sort(arr, i+1, arr.length);
        System.out.println(new String(arr));
    }
}
