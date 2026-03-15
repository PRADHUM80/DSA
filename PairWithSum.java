import java.util.Scanner;

public class PairWithSum {
    
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        boolean found = false;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] + arr[j] == target) {
                    found = true;
                    break;
                }
            }
        }

        if(found) {
            System.out.println("YES");
        } else {
            System.out.println("Pair not found");
        }
     }    
}
