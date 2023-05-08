package Strings;

public class string_a0_count_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String word= "Chennai 600018";
//print number only
    /* for(int i=0;i<word.length();i++)
    {
  	  if(word.charAt(i)>='0')
  		  if(word.charAt(i)<='9')
  			  System.out.print(word.charAt(i));
    }
    System.out.println(word.replaceAll("[a-zA-Z]"," "));
     */
    
//print only number in a string
   
    /* int numcount=0;
       for(int i=0;i<word.length();i++) {
    	 if(word.charAt(i)>='0')
    		 if(word.charAt(i)<='9')
    			 numcount++;
	}
	if(numcount==word.length())
		 System.out.println("All are number in a string");
	else
		 System.out.println("No,someother charactor in a String"); */
    
 /* String s=word.replaceAll("[a-zA-Z]"," ");
        if(s.length()==word.length())
		 System.out.println("only number");
	    else
		 System.out.println("No,someother charactor in a String");  */
	 
	
 /*  
 //print albhabets only
          for(int i=0;i<word.length();i++)
           {
  	       if(word.charAt(i)>='a') {
  	     	  if(word.charAt(i)<='z')
  			     System.out.println(word.charAt(i));
  	          }
  	        else if(word.charAt(i)>='A')	{
  		         if(word.charAt(i)<='Z')
  			        System.out.println(word.charAt(i));
               }
	}
            System.out.println(word.replaceAll("[0-9]"," ")); */
  
//print albhabet
      /* int alcount=0;
          String word2=word.replaceAll("[0-9]"," ");
          
         if(word2.length()==word.length())
		       System.out.println("only albhabet");
	      else
		         System.out.println("No,someother number"); */
	 
}
}