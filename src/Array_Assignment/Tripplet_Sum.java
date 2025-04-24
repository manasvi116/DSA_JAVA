package Array_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Tripplet_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target =8;
		Scanner sc =new Scanner (System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		int arr[] = new int [size];
		System.out.println("enter values");
		
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		triplet_sum(arr , size , target);
		
//		

	}
	public static void triplet_sum(int [] arr , int size , int target) {
		int sum = 0 ;
		int i =0;
		
		for ( i=0 ; i < size-2 ; i++) {
			int j = i+1;
			int k = size-1;
			while(j<k) {
				sum = arr[i] + arr[j] + arr[k] ;
				if(sum==target) {
					System.out.println("(" + arr[i] +","+ arr[j]+ "," + arr[k] + ")");
					j++;
					k--;
				}
				else if(sum>target) {
					k--;
				}
				else {
					j++;
				}
			}
		}
		
		
		
		
	}

}
