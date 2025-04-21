package Array_Assignment;
import java.util.*;
public class Sum_of_Pair {

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
		Arrays.sort(arr);
		Pair_of_Sum(arr , size , target);
		
		
		
//		for(int i = 0; i <size ; i++) {
//			System.out.print(arr[i]+ " ");
//		}
		// TODO Auto-generated method stub

	}
	public static void Pair_of_Sum(int [] arr , int size , int target) {
		int sum = 0;
		int i=0;
		int j= size -1;
		while(i<j) {
			sum= arr[i] + arr[j];
			if(sum== target) {
				System.out.println("("+arr[i] + ","+ arr[j]+")");
				System.out.println();
				i++;
				j--;
			}
			else if( sum > target) {
				j--;
				
			}
			else {
				i++;
			}
		}
		
	}

}
