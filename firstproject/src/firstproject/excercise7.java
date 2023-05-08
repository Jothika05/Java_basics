package firstproject;

import java.util.Scanner;

public class excercise7 {

	public static void main(String[] args) {
             Scanner scanner= new Scanner(System.in);
             System.out.println("enter the number:");
             int num= scanner.nextInt();
       /* for(int i=num;i<=num*num;i=i+num) {
        	System.out.print(i + " ");
        	
             if(i%num==0) {
     		System.out.println();
    		} */
        for(int i=0;i<=10;i++) {
        	System.out.println(num*(i+1));
        }
        
     }
    
	}

