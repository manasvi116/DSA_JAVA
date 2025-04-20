package LEC2;

import java.util.Scanner;

public class product_array_except_self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc  = new Scanner (System.in);
		System.out.println("enter size of your choice");
		int size = sc.nextInt();
		
		int arr[] = new int [size];
		System.out.println("enter values");
		for(int i = 0 ; i<size; i++) {
			arr[i] = sc.nextInt();	}
		
		int ans[] = product (arr , size);
//		output 
		for(int i = 0 ; i<size ; i++) {
			System.out.print(ans[i] + " " );
		}
		
	}
	
	public static int [] product (int [] arr , int size) {
		int product [] = new int [size];
//		for left
		int left [] = new int [size];
		left [0] = 1 ;
		for(int i = 1 ; i<size ; i++) {
			left[i] = left[i-1] * arr[i-1];
			
		}
		
		
//		right
		int right [] = new int [size];
		right [size-1] = 1 ;
		for(int i = size-2 ; i>=0 ; i--) {
			right[i] = right[i+1] * arr[i+1];
			
		}
		
//		concatenate
		
		for(int i = 0 ; i<size ; i++) {
			product [i]= left[i] * right[i];
			}
		
		return product  ;
	}
	


	}


