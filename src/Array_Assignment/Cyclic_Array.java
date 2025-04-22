package Array_Assignment;

import java.util.Scanner;

public class Cyclic_Array {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		int arr[] = new int [size];
		System.out.println("enter values");
		
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		int result = cyclic_sum(arr , size);
		System.out.println(result);
	

	}
	public static int cyclic_sum(int[] arr, int size) {
		int updated [] = new int [size];
	    // First loop: cyclic addition with previous element
	    for (int i = 0; i < size; i++) {
	        if (i == 0) {
	            updated[i] = arr[i] + arr[size - 1]; // use last element as previous
	        } else {
	            updated[i] = arr[i] + arr[i - 1];
	        }
	    }

	    // Second loop: double each value
	    for (int i = 0; i < size; i++) {
	        updated[i] = 2*  updated[i];
	    }

	   
	    int sum = 0;
	    int mod = 1000000007;
	    for (int i = 0; i < size; i++) {
	        sum += updated[i];
	        sum= sum% mod;
	    }

	    return sum;
	}

}
