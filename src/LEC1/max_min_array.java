package LEC1;
import java.util.*;
public class max_min_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		System.out.println("enter size of your choice");
		int size = sc.nextInt();
		
		int arr[] = new int [size];
		System.out.println("enter elemenets");
		for(int i = 0 ; i < size ; i++) {
			arr[i] = sc.nextInt();
}
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
//		inbuilt constants in java
		
		
		for(int i = 0 ; i < size ; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
			if(arr[i]>max) {
			max = arr[i];
			}
		}
		
		
System.out.println("smallest value is "+ min);
System.out.println("graetest value is "+ max);
	}

}
