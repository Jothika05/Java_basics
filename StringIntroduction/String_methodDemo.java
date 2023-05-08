package StringIntroduction;

public class String_methodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  /* String s="ABCDEFGHIJKLMNOPQRSTUVWXYZA";
   System.out.println( s.charAt(5));   //F
   System.out.println(s.indexOf('U'));  //20
   System.out.println(s.lastIndexOf('A'));
   // char[] ch=s.toCharArray();
   //    for(int i=0;i<ch.length;i++) {
   // 	    System.out.println(ch[i]);
   //     } 
   System.out.println(s.contains("XYZ"));
   System.out.println(s.contains("xyz"));
   System.out.println(s.contains("ONM"));
   
   String a="AnishaShahi Aruljothi Aruna Bharathi";
   System.out.println(a.startsWith("AnishaShahi"));
   System.out.println(a.endsWith("Bharathi"));   
   System.out.println(s.toUpperCase());
   System.out.println(s.toLowerCase());   */
		
   String_methodDemo smd=new String_methodDemo();
   smd.confirmStarting("AnishaShahi");
   smd.confirmEnding("Bharathi");
   smd.printnumber("Arul@2001@gamil.com");
   smd.printalbhabet("arul@2001@gamil.com");
   smd.printspecialchar("arul2001@gamil.com");
   smd.printlowercase("Arul@2001@gamil.com");
   smd.printuppercase("Arul@2001@gamil.com");
  }





private void confirmStarting(String a1) {
	
		 String a2="AnishaShahi Aruljothi Aruna Bharathi";
		/* char[] ch=a1.toCharArray();
				    for(int i=0;i<ch.length;i++) {
				    	System.out.println(ch[i]);
				    }  */
		 int count=0;
		 for(int i=0;i<a1.length();i++) {
		 if(a1.charAt(i)==a2.charAt(i)) {
			count++; 
		   }
	    }
		 System.out.println(count);
		 if(a1.length()==count) {
			 System.out.println("yes,the given string start with "+a1);
		 }
		 System.out.println("----------------------------------------------------------------------------");	 
}
private void confirmEnding(String a1) {
	     
	    String a2="AnishaShahi Aruljothi Aruna Bharathi";
	    System.out.println(a2.length());
	    System.out.println(a1.length());
	    System.out.println(a2.length()-(a1.length()));
	      int start=a2.length()-(a1.length());
	      int j=0;
	      int count=0;
	      for(int i=start;i<a2.length();i++){
		     if(a2.charAt(i)==a1.charAt(j)) {
			    count++;
		       }
		     j++;
	       }
		    System.out.println(count);
		 if(a1.length()==count) {
			 System.out.println("yes,the given string ends with "+a1);
		 }
		     System.out.println("------------------------------------------------------------------");
}
private void printnumber(String a1) {
	            System.out.println("printing numbers only");
	              for(int i=0;i<a1.length();i++) {
	                if(a1.charAt(i)>='0'&& a1.charAt(i)<='9') 
		                System.out.println(a1.charAt(i));
	                   }
	               System.out.println("--------------------------------------------------------------");
}


private void printalbhabet(String a1) {
           	 System.out.println("printing albhabets only");
	          for(int i=0;i<a1.length();i++) {
		              if(a1.charAt(i)>='a'&& a1.charAt(i)<='z') 
			             System.out.println(a1.charAt(i));
                      }
	                   System.out.println("-----------------------------------------------------------");
}


private void printspecialchar(String a1) {
	        System.out.println("printing special characters only");
	           for(int i=0;i<a1.length();i++) {
		        if(a1.charAt(i)>='a'&& a1.charAt(i)<='z') {
			         continue;
		           }
		        else if(a1.charAt(i)>='0'&& a1.charAt(i)<='9') {
			          continue;
		              }
		             System.out.println(a1.charAt(i));		
	                }
                  	System.out.println("----------------------------------------------------------");
}




private void printlowercase(String a1) {
             System.out.println("prininting lowercase only");
            String s=a1.toLowerCase();
		     for(int i=0;i<a1.length();i++) {
		         if(s.charAt(i)>='a'&& s.charAt(i)<='z') 
			         System.out.println(s.charAt(i));
		             }	 

                 System.out.println("--------------------------------------------------------------------");
     }
private void printuppercase(String a1) {
	// TODO Auto-generated method stub
	  System.out.println("prininting uppercase only");
      String s=a1.toUpperCase();
	     for(int i=0;i<a1.length();i++) {
	         if(s.charAt(i)>='A'&& s.charAt(i)<='Z') 
		         System.out.println(s.charAt(i));
	             }	 

           System.out.println("--------------------------------------------------------------------");
}

}