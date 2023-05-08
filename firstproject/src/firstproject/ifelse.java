package firstproject;
import java.util.Scanner;

public class ifelse {
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		if(num>=0) {
			System.out.println(num + " positive number");
		}
		//else if(num==0) {
		  //System.out.println(num + " neutral number");
		//}
		else {
				System.out.println( num   + " negative number");
		}
		
	}
		
}
