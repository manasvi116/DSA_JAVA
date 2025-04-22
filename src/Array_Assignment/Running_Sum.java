package Array_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Running_Sum {

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
		
		int result [] =  running_sum(arr , size);
		
	
		for(int i = 0; i <size ; i++) {
			System.out.print(result[i]+ " ");
		}
		
		// TODO Auto-generated method stub

	}
	public static int [] running_sum(int []arr , int size) {
		int updated[] = new int [size];
		updated[0] = arr[0];
        for(int i=1; i<size;i++) {
			updated[i] = updated[i-1] + arr[i]; 
		}
		return updated;
	}

	}


