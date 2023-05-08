package firstproject;

import java.util.Scanner;

public class elseif {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a marks(0 to 100)");
		int mark=sc.nextInt();
		if(mark>=90)
			System.out.println("grade A");
		else if(mark>=80)
			System.out.println("grade B");
		else if(mark>=70)
			System.out.println("grade C");
		else if(mark>=60)
			System.out.println("grade D");
		else 
			System.out.println("grade E ");
			
		
	}

}
