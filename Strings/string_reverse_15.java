package Strings;

import java.util.Scanner;

public class string_reverse_15 {

	public static void main(String[] args) {
//print reverse, reverse a string,palindrome
String s1="ABCD";
String s2="";
   for(int i=s1.length()-1;i>=0;i--) {
	   s2=s2+s1.charAt(i);
	   System.out.println(s1.charAt(i));  //print reverse
   }
   System.out.println(s2); //reverse a string
   if(s1.equals(s2))
	   System.out.println("palindrome");  //,palindrome
	   else
		   System.out.println("not palimdrom");
   
   
   /*
     Scanner sc=new Scanner(System.in);
   System.out.println("enter the string:");  
   String s1=sc.nextLine();
   String s2=" ";
   for(int i=s1.length()-1;i>=0;i--) {
	   s2=s2+s1.charAt(i);
	   System.out.println(s1.charAt(i));  //print reverse
   }
   System.out.println(s2); //reverse a string
   if(s1.equals(s2))
	   System.out.println("palindrome");  //,palindrome
	   else
		   System.out.println("not palimdrom");
   
	}

}

    */
	}
	
	

}
