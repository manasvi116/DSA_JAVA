package LEC1;

public class reversearrayrange {

	public static void main(String[] args) {
	int arr[] = {1,2,3,4,5,6,7,8,9,10};
	Reversearray(arr);
	
	for(int i =0 ; i<arr.length ; i++) {
		System.out.print(arr[i] + " ");
	}
	
	
	
	}
	public static void Reversearray(int [] arr  ) {
		
		int i = 4;
		int j = 7;
///setting the range 
		while(i<j) {
		int temp = arr[i];
		arr[i]= arr[j];
		arr[j] = temp; 
		
		i++;
		j--;
	}

	}

}
