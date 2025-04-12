package LEC1;
import java.util.*;

public class basicsofarray {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		
		
		
//		basic array define , input and output 
		
		int arr[] = new int [size];
		System.out.println("enter the values to be inserted");
		for(int i = 0; i <size ; i++) {
			arr[i] = sc.nextInt();
			
		}

//		output
		System.out.println("here is your values in the form of array");
		for(int i = 0 ; i < size ; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
