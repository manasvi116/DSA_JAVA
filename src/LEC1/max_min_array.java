package LEC1;
import java.util.*;
public class max_min_array {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int size = sc.nextInt();
	        int arr[] = new int[size];

	        for (int i = 0; i < size; i++) {
	            arr[i] = sc.nextInt();
	        }

	        int maxValue = max(arr);
	        int minValue = min(arr);

	        System.out.println("Max: " + maxValue);
	        System.out.println("Min: " + minValue);

	        // Output all array elements
	        for (int i = 0; i < size; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }

	    public static int max(int[] arr) {
	        int max = Integer.MIN_VALUE;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }
	        return max;
	    }

	    public static int min(int[] arr) {
	        int min = Integer.MAX_VALUE;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }
	        return min;
	    }
	}
