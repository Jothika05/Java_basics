package firstproject;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a,b;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter first number:");
      a=sc.nextInt();
      System.out.println("enter second  number:");
      b=sc.nextInt();
      int operator;
      System.out.println("enter the operator +,-,*,/,% :");
      operator=sc.next().charAt(0);
      switch(operator) {
      case '+':
    	  System.out.println(a + " + " + b + " = " + (a+b) );
    	  break;
      case '-':
    	  System.out.println(a + " - " + b + " = " + (a-b) );
    	  break;
      case '*':
    	  System.out.println(a + " * " + b + " = " + (a*b) );
    	  break;
      case '|':
    	  System.out.println(a + " | " + b + " = " + (a|b) );
    	  break;
      case '%':
    	  System.out.println(a + " % " + b + " = " + (a%b) );
    	  break;
      default:
    	  System.out.println("yoy entered incorrect operator" );
    	  
    	  
   
    	  
      }
      
    
	}

}
