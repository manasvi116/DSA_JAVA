package LEC1;

import java.util.Scanner;

public class linerarsearch {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		
		
		
//
		
		int arr[] = new int [size];
		System.out.println("enter the values to be inserted");
		for(int i = 0; i <size ; i++) {
			arr[i] = sc.nextInt();
			
		}
	System.out.print("enter the value to be searched for ");
		int x = sc.nextInt();

//		output
		
		for(int i = 0 ; i < size ; i++) {
			if(arr[i] == x) {
				System.out.println("your searched value " + x + " exists in the array which is at index " + i);
			} 
			
		}
		System.out.println("exit");
	}
}


