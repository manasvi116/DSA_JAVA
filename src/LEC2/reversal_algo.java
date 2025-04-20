package LEC2;

public class reversal_algo {

	public static void main(String[] args) {
		 int arr[] = {1, 2, 3, 4, 5, 6, 7};
	        int k = 3;
	        k = k % arr.length; // To handle k > n
	        reverse(arr, 0, arr.length - 1);
	        reverse(arr, 0, k - 1);
	        reverse(arr, k, arr.length - 1);

	        for (int i : arr) {
	            System.out.print(i + " ");
	        }
	    }

	    public static void reverse(int[] arr, int start, int end) {
	        while (start < end) {
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	        }
	    }
	}