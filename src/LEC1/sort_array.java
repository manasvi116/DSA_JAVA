package LEC1;
import java.util.*;

public class sort_array {

	public static void main(String[] args) {
		Scanner sc  = new Scanner( System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		
		int arr[] = new int [size];
		for (int i=0; i <size; i ++) {
			arr[i] = sc.nextInt();
			
		}
		
		boolean isAscending = true; 
		for(int i =0 ; i <size -1; i++) {
		 if (arr[i] > arr[i+1]) {
			 isAscending = false;
			 break;
		 }
		
		}
		boolean isDescending = true; 
		for(int i =0 ; i <size -1; i++) {
			 if (arr[i] < arr[i+1]) {
				 isDescending = false;
				 break;
			 }
		}
		
	if(isAscending) {
		System.out.println("your array is in ascending order");
	}
	else if (isDescending) {
		System.out.println("your array is in descending order");
	}
	else {
		System.out.println("your array is neither ascending nor descending");
	
	}

}
}
