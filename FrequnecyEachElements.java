

import java.util.Scanner;
public class FrequnecyEachElements {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array: ");
        int n = sc.nextInt();

        int a[] = new int[256]; //    
        System.out.println("enter " + n + "elements of array: ");
        for(int i = 0; i < n; i++) {
            a[sc.nextInt()]++;
        }

        for(int i = 0; i < 256; i++) {
            if(a[i] > 0) {
                System.out.println("Element " + i + " occurs " + a[i] + " times.");
            }
        }
    }

}
