package LEC1;

import java.util.Scanner;

public class reverseofarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		int arr[] = {1,2,3,4,5};
		

		Reversearray(arr);
		
		
		for (int i =0 ; i <arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
		
		public static void Reversearray(int [] arr) {
		int i = 0;	
		int j = arr.length -1;
		
			while(i<j) {
				int temp = arr[i] ; 
				arr[i] = arr[j] ; 
				arr[j] = temp ; 
				
				i ++; 
				j--;
				
			}	
			}
	
		
	}


