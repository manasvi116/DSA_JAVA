package LEC2;

public class trapping_rain_water {

	public static void main(String[] args) {
		int arr[]= {0,1,0,2,1,0,1,3,2,1,2,1,};
		int n = arr.length;
		trapwater(arr ,n );
	}
		
		public static void trapwater(int[] arr , int n) {
//	for left 
		int left []= new int[n];
		left[0] = arr[0];
		for(int i = 1 ; i<n;i++) {
			left[i]= Math.max(left[i-1], arr[i]);
			
		}
		
//		for right
		int right []= new int [n];
		right[n-1]= arr[n-1];
		for(int i=n-2 ; i>=0 ; i--) {
			right[i]= Math.max(right[i+1], arr[i]);
			
		}
		
//for comparison
		int sum=0;
		for(int i=0 ; i<arr.length ; i++) {
			sum = ( sum + Math.min(right[i], left[i])) - arr[i];
			
		}
		
	System.out.println(sum);
	}
	
	
}





//write a program two classes and show the visibility mode of defualt and private access specifier 