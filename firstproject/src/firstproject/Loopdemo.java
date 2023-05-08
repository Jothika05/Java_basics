
package firstproject;

import java.util.Scanner;

public class Loopdemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int i=1;
		Scanner scanner = new Scanner(System.in);
	    System.out.println("how many star do you want:");
	    n= scanner.nextInt();
	    do {
	    	System.out.print("*");
	    	i++;
	    }while(i<=n);
	    }
	     
	    
	}

