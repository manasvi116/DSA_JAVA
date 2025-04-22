package Array_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Square_element {

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
		
		int result [] =  square(arr , size);
		Arrays.sort(result);
	
		for(int i = 0; i <size ; i++) {
			System.out.print(result[i]+ " ");
		}
		
		// TODO Auto-generated method stub

	}
	public static int [] square(int [] arr , int size) {
		int updated [] = new int [size];
		for(int i =0; i<size ;i++) {
			updated[i] = (arr[i] *arr[i]);
		}
		return updated;
	}

}
