package Strings;

import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the string:");  
   String s1=sc.nextLine();
    System.out.println("which character you want to count?");
    char c=sc.next().charAt(0);
    int count=0;
    for(int i=0;i<s1.length();i++) {
    	if(c==s1.charAt(i)) {
    		count++;
    	}
    }
    System.out.println(c +" is "+count+" time in given string");
	}
}
