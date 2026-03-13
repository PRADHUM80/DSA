import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size : ");
        int n = sc.nextInt();
        int sum = 0;

        System.out.println("Enter " + n + " numbers: ");
        for(int i=0;i<n-1;i++)
        {
            sum = sum + sc.nextInt();
        }

        int total = n*(n+1)/2;

        int missing = total - sum;

        System.out.println("The missing number is: " + missing);
    }
}
