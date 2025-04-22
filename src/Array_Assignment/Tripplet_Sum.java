package Array_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Tripplet_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target =5;
		Scanner sc =new Scanner (System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		int arr[] = new int [size];
		System.out.println("enter values");
		
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		triplet_sum(arr , size);
//		for(int i = 0; i <size ; i++) {
		
//		}

	}
	public static int triplet_sum(int [] arr , int size) {
		
		
	}

}
