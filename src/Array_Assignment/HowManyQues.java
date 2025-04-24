package Array_Assignment;
import java.util.*;

public class HowManyQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner (System.in);
		System.out.println("enter the numbers of questions to be attempted");
		int n = sc.nextInt();
		int count = 0 ;
		int sum = 0;
		
		
		for(int i =0; i < n ; i++) {
		
			int vanya = sc.nextInt();
			int petya = sc.nextInt();
			int tanya = sc.nextInt();
			
			sum = vanya + tanya + petya ; 
			
			
			if(sum >= 2) {
				count++;
				
			}
		}
		System.out.println(count);
		
		

	}

}
