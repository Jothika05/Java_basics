package firstproject;

import java.util.Scanner;

public class jump2 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
	    double n,sum=0.0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number,enter a negative number to stop the loop:\n");
		while(true) {
			n=sc.nextDouble();
			if(n<0.0) {
				break;
		   }
		sum+=n;
       }
		System.out.println("sum is" + sum);
	
	}
}


