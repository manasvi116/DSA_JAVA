package Array_Assignment;
import java.util.*;
public class Watermelon_Split {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of watermelon to be shared");
		int w = sc.nextInt();
		
		watermelon(w);

	}
	
	public static void watermelon(int w) {
		if(w>2 && w%2 == 0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
