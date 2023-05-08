package Strings;

import java.util.Scanner;

public class string_countfirst_char_10_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s="ammaaaavha";
	Scanner sc=new Scanner(System.in);
//	System.out.println("enter the string:");  
//    String s=sc.nextLine();
//	System.out.println("which character you want to count?");
//   char c=sc.next().charAt(0); 
    char first=s.charAt(0);
     int count=1;
     for(int i=0;i<s.length()-1;i++) {
	     if(first==s.charAt(i))
		  count++;
       }
  System.out.println("count of first character :"+count);
  
  
    String word="Villupuram";
    char search='l';
    int count1=0;
    for(int i=0;i<word.length()-1;i++) {
           if(search==word.charAt(i))
	           count1++;
              }
  System.out.println("count of (one character) "+(search)+" in the string :"+count1);
	}
	
}
