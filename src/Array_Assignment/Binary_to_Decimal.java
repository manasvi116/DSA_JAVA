package Array_Assignment;

import java.util.Scanner;

public class Binary_to_Decimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of binary numbers to be entered:");
        int size = sc.nextInt();
       

        // Taking input
        for (int i = 0; i < size; i++) {
            System.out.println("Enter binary number " + (i + 1) + ":");
          int data = sc.nextInt();
          int result = conversion(data);
          System.out.println(result);
          }

        
        // Converting and printing
       

        sc.close();
    }

    public static int conversion(int n) {
        int sum = 0, mul = 1;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * mul;
            n /= 10;
            mul *= 2;
        }
        return sum;
    }
}
