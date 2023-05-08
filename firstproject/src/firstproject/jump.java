package firstproject;
import java.util.Scanner;
//for a given n,find the nearest number divisible by 10 than is less than n.
/* 78  - 70
 * 58 -50
 * 99  =90
 */
public class jump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		n=sc.nextInt();
		while(true) {
			if(n%10==0) {
				System.out.println(n);
		       break;
			}
		n--;
		}
		
		
		
		       
		      
		
		
		

	}

}
