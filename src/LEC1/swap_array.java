package LEC1;

public class swap_array {

	public static void main(String[] args) {
		
		
//		1 way of swapping 
//		int arr[] = {12,34,56,78,90};
//		System.out.println(arr[0] + " " + arr[1]);
//		Swap (arr[0],arr[1]);
//		System.out.println(arr[0] + " " + arr[1]);
//		
//
//		}
//	public static void Swap (int a , int b) {
//		int temp = a;
//		a = b ; 
//		b = temp; 
//	


	
	
//	2nd way of swapping 
//	int arr[]= {1,2,3,4,5};
//	System.out.println("before swapped values are");
//	System.out.println(arr[0] + " " + arr[1]);
//	Swap(arr , 0 , 1);
//	System.out.println("after swapped values are");
//	System.out.println(arr[0] + " " + arr[1]);

	
//	public static void Swap(int [] arr , int i , int j ) {
//		
//		int temp = arr[i];
//	 arr [i] = arr[j] ;
//	arr [j] = temp ; 
//		
//	}
		
		
		
		
		
//		3rd way of swapping  
		
		int arr[] = {12,34,56,78,90};
		int arr1[] = {1,2,3,4,5};
		System.out.println(arr[0] + " " + arr1[0]);
		Swap(arr , arr1, 0 , 0 );  
//		passing it as a value 
		System.out.println(arr[0] + " " + arr1[0]);
		
}
//	this is called functiom and we pass parameterrs inside the function
//	which can be names as any variable its not mandatorily has to be same like  argument
	
	
	public static void Swap(int [] a , int [] b, int i , int j ) {
		int temp = a[i];
//		AND HERE USING IT AS AN INDEXING 
		a[i]=b[j]  ;
		b[j] = temp ; 
	}

}