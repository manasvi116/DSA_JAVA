package Array_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Pair_of_Roses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target =10;
		Scanner sc =new Scanner (System.in);
		System.out.println("enter no. of rose");
		int rose =sc.nextInt();
		
		int arr[] = new int [rose];
		
		System.out.println("enter price of each rose");
		
		
		for(int i=0;i<rose;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
	pair_rose(arr , rose , target );
		
		
		
		
		// TODO Auto-generated method stub

	}
	
	public static void pair_rose(int [] arr , int rose , int target) {
		
		int i =0;
		int j = rose-1;
	    int min_dif = Integer.MAX_VALUE;	
		int rose1= 0;
		int rose2 = 0 ;
		int sum = 0;
		while(i<j) {
			sum = arr[i] + arr[j];
			
			
		
		if(sum == target) {
			int dif = Math.abs(arr[i] - arr[j]);
			if(dif<min_dif) {
				rose1 = arr[i];
				rose2 = arr[j];
				min_dif = dif ; 
			}
			i++;
			j--;
			
		}
		else if(sum>target){
			j--;
		}
		else {
			i++;
		}
		}
		System.out.println("deepak shoud buy roses who prices are "  + rose1 + " and " + rose2);
		System.out.println();
	}
	}
