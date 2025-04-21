package Array_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Inverse_Array {

	public static void main(String[] args) {
		int target =5;
		Scanner sc =new Scanner (System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		int arr[] = new int [size];
		System.out.println("enter values");
		
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
	System.out.print( "array after inverse is \n");
	int result [] = inverse(arr , size); 
	for (int i = 0 ; i < size ; i++) {
		System.out.print( result[i] + " ");
 	}
			
	
	}
	public static int [] inverse(int []arr, int size ) {
		int updated [] = new int [size];
		for(int i = 0 ;i < size ; i++) {
			updated[arr[i]]= i;
		}
	return updated;
	}

}
