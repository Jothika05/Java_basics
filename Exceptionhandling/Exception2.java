package Exceptionhandling;

import java.io.PrintWriter;

public class Exception2 {
public static void main(String args[]) {
	PrintWriter pw;
   try 
   {
   PrintWriter pw1=new PrintWriter("abc.txt");
   pw1.println("saved");
   } catch(Exception e) {
	      System.out.println(e);
    }
	
	System.out.println("file saved successfully");
}
}

