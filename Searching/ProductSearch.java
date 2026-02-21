package Searching;

import java.util.Scanner;

public class ProductSearch {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Total no of products in the inventory: ");
        int n = sc.nextInt();
// jis type ka output hoga uss type ka input lete hain...
        String products[] = new String[n];

        System.out.println(" AcceptProducts from the user: ");
        for(int i= 0; i < n; i++) {
            products[i] = sc.next();
        }

        System.out.println("Products name to Search ? ;");
        String searchProduct = sc.next();

        // Logic..

        boolean found = false;
        for(int i = 0; i <n; i++)
        {
            if(products[i].equals(searchProduct))
            {
                found = true;
                break;
            }
        }

        if(found) 
        {
            System.out.println("Product Found");
        }
        else {
            System.out.println("Product not found.");
        }
    }
    
}
