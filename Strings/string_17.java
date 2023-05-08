
package Strings;

public class string_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//first letter repeated or not
             
		String word="window";
               char ch=word.charAt(0);
               boolean repeat=false;
              for(int i=1;i<word.length();i++) {
    	       if(ch==word.charAt(i)) {
    		      System.out.println(ch + "  repeated");
    		       repeat=true;
    		        break; 
    	            }
                   }
            if(repeat==false) {
    	          System.out.println(ch + " not repeated");
                 }
		
//first non repeated character
		   String word1="window";
		   for(int i=0;i<word.length();i++) 
		   {  
	         char ch1=word.charAt(i);  //w
	         boolean repeat1=false;   
	         for(int j=i+1;j<word1.length();j++)  // w==i,w==n,w==d,w==o,w==w
	         {
	    	    if(ch1==word1.charAt(j)) {
	    		 //  System.out.println(ch + "  repeated");
	    		   repeat1=true;
	    		   break; 
	    	      }
	         }
		
	           if(repeat1==false) {
	    	        System.out.println(ch1 + " not repeated");
	    	        break;
	               }
	       }

}

}