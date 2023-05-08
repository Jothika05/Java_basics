package StringIntroduction;
import java.util.Scanner;
public class StringDemo2 {
    String name;
    int id;
	
	public StringDemo2(String name, int id) {
	this.name=name;
	this.id=id;
	}
   public String toString() {
	   return this.name+" "+this.id;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stu
	 StringDemo2 s=new StringDemo2("hiii",234); //create constructor and add toString() method
	 System.out.println(s);
	s.countofVowels();
    s.countofWords(); 
    s.countofSentence(); 
     
}

	private void countofVowels() {
            String s=" arul ";
		    System.out.println(s.length());
		    System.out.println(s.contains("r"));
		    System.out.println(s.startsWith(" ar"));
		    System.out.println(s.endsWith("ul "));
		    String s3=s.trim();
		    System.out.println(s3.length());
		   
		 String s1=new String("aruljothi");
		 //System.out.println(s1.length());
		 int i=0;
		 int count=0;
		 while(i<s1.length()) {
			 char ch=s1.charAt(i);
			 if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u')
	 			 count++;
			 
	     // System.out.println(s2.charAt(i));
	     i++;
		 }
	    System.out.println("No.of .Vowels:"+count);
	    
	}

	private void countofWords() {
		
	   String s2="arul selvi";
	   int i=0;
	   int count=1;
	   while(i<s2.length()) {
	   if(s2.charAt(i)==' ')
		  count++;
	     i++;
	   }
	
        System.out.println("No.of.words:"+count);
	}		
	
	private void countofSentence() {
		String s2="i am aruljothi. i am very sad. because i feel very glity. my emailid is arul@gmail.com. ";
		int i=0;
		int count=0;
		while(i<s2.length()) {
		  if(s2.charAt(i)=='.' )
			  if(s2.charAt(i+1)==' ')
			  count++;
		  i++;
		}
		
	      System.out.println("No.of.Sentence:"+count);
		}		
	
		
}


