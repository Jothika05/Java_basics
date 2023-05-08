package Strings;

public class string_methods_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//scenorio 1
		String s1=new String("arul");  //heap memory
		String s2="arul";   //string constant pool
		if(s1==s2)
			System.out.println("==");
		else
			System.out.println("not ==");
		if(s1.equals(s2))
			System.out.println("equals");
		else
			System.out.println("not equals");      //not==,equals
	//scenorio 2
		 s1=new String("arul");  //heap memory
	     s2=s1;   //heap memory
	     if(s1==s2)
				System.out.println("==");
			else
				System.out.println("not ==");
			if(s1.equals(s2))
				System.out.println("equals");
			else
				System.out.println("not equals");     //equals,==
	 //scenorio 3
		 s1=new String("arul");  //heap memory
	     s2=s1;   //heap memory
	     s2="arul"; //scp
	     if(s1==s2)
				System.out.println("==");
			else
				System.out.println("not ==");
			if(s1.equals(s2))
				System.out.println("equals");
			else
				System.out.println("not equals");   //not ==,equals
	//scenorio 4   
	     s1=new String("arul");  //heap memory
	     s2=s1;   //heap memory
	     s1="jothi"; //scp
	     if(s1==s2)
				System.out.println("==");
			else
				System.out.println("not ==");
			if(s1.equals(s2))
				System.out.println("equals");
			else
				System.out.println("not equals");   //not==,not equals
	//scenorio 5   
	     s1=new String("arul");  //heap memory
	     s2=s1;   //heap memory
	     s1="jothi"; //scp
	     s2="jothi";  //scp -->s1,s2 stored in same memory location   (same place) because same name(jothi)
	     //==,equal
	     if(s1==s2)
				System.out.println("==");
			else
				System.out.println("not ==");
			if(s1.equals(s2))
				System.out.println("equals");
			else
				System.out.println("not equals");    //==,equal
	//scenorio 6   
	     s1=new String("arul");  //heap memory
	     s2=s1;   //heap memory
	     s1=new String("jothi");
	     s2=new String("jothi");
	      
	     if(s1==s2)
				System.out.println("==");
			else
				System.out.println("not ==");
			if(s1.equals(s2))
				System.out.println("equals");
			else
				System.out.println("not equals");    //not==,equals
			
	//scenorio 7  
	         s1=new String("arul");  //heap memory
	         s2=s1;   //heap memory
	         s1=new String("jothi");  
	         s2=new String("jothi"); 
	         String s3=new String(s1); //heap memory
	            
	         if(s3==s2)
	 			System.out.println("==");
	 		else
	 			System.out.println("not ==");
	 		if(s3.equals(s2))
	 			System.out.println("equals");
	 		else
	 			System.out.println("not equals");         //not==,equals
	 		
		
	//scenorio 8  
	        s1=new String("arul");  //heap memory
	        s2=s1;   //heap memory
	    
	        
			if(s1==s2)
				System.out.println("==");
			else
				System.out.println("not ==");
			if(s1.equals(s2))
				System.out.println("equals");
			else
				System.out.println("not equals");         //==,equals
			
	//scenorio 9		
			s1=new String("arul");  //heap memory
	        s2="arul";  //scp
	        s1=null;   //memory is not point
	        if(s2==s1)
				System.out.println("==");
			else
				System.out.println("not ==");
			if(s2.equals(s1))
				System.out.println("equals");
			else
				System.out.println("not equals");         //not ==,not equals
			
    //scenorio 10		
			s1=new String("aru");  //heap memory
	        s2="arul";  //scp
	        s1=s1+"l";  //heap memory
	        if(s1==s2)
				System.out.println("==");
			else
				System.out.println("not ==");
			if(s1.equals(s2))
				System.out.println("equals");
			else
				System.out.println("not equals");         //not ==, equals
			
			
	//scenorio 11		
			s1="aru";  //scp  --aru
	        s2="arul";  //scp   --arul
	        s1=s1+"l";  // immutable  --arul scp
	        if(s1==s2)  //memory compare
				System.out.println("==");
			else
				System.out.println("not ==");
			if(s1.equals(s2)) //ulla irukura value compare
				System.out.println("equals");
			else
				System.out.println("not equals");         //not ==, equals
			
			
			
	//scenorio 12		
					s1="arul";  //scp  --aru
			        s2=s1+s1;  //scp   --arul
			        s3="arularul";
			        if(s2==s3)  //memory compare
						System.out.println("==");
					else
						System.out.println("not ==");
					if(s2.equals(s3)) //ulla irukura value compare
						System.out.println("equals");
					else
						System.out.println("not equals");         //not ==, equals
				
				
					
							

	}
	}

