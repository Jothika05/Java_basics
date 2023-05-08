package Exceptionhandling;

import java.io.*;


public class Exception1 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
   int a=10;
   int b=0;
   int c=0;
   try {
      //int arr[]=null;
	// System.out.println(arr[1]);
	 c=a/b;
	 System.out.println("try block");
   
 // throw new NullPointerException ("demo"); //-->run direct exception
   }
   catch(ArithmeticException e)
   {
   System.out.println("Arithmetic error occur");
	}
   catch(NullPointerException e) 
   {
	   System.out.println("nullpointer error occur");
   }
   catch(Exception e)
   {
	   System.out.println("occured");
   }
   finally {
		System.out.println("STOP");
        }
//checked exception
  File f=new File("abc.txt");
   try {
        FileInputStream fs=new FileInputStream(f);
   }
   catch(FileNotFoundException e) {
		   e.printStackTrace();
	   }
		  
  
    System.out.println(c);
    System.out.println("End");
    
    
    
     /* int i=0;
      try( Scanner s=new Scanner(System.in)) //try with resource
      {
	    i=s.nextInt();
      }
	 System.out.println(i);  */
	
	 
	 double bal=500 ,withdraw=700;
	 try {
	 if(bal<withdraw)
		throw new InsufficientFundException(withdraw-bal);
	 }
	 catch(InsufficientFundException e) {
		 System.out.println("not enough money");
	 }
}
}
























