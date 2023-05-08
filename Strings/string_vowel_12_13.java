package Strings;

public class string_vowel_12_13 {
/*count of vowels in a string
 * vowels presemt or not present in a string
 * count of individual vowel in a string
 *  
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //county of vowel in a string
		String w="aeroplane";
		int count=0;
		 for(int i=0;i<w.length();i++) {
			 char ch=w.charAt(i);
		/*	 if(w.charAt(i)=='a')
				 count++;
			 else if(w.charAt(i)=='e')
					 count++;
			 else if (w.charAt(i)=='i')
				 count++;
			 else if(w.charAt(i)=='o')
			      count++;
			 else if (w.charAt(i)=='u')
						 count++;
			  else
	            System.out.println();
							 		 }*/
			 switch(ch) {
			 case 'a':count++; break;
			 case 'e':count++; break;
			 case 'i':count++; break;
			 case 'o':count++; break;
			 case 'u':count++; break;
			 }
		 }
		
		 System.out.println("count of vowels in a given string:"+count);
	
		 
		 System.out.println("--------------------------------------------------------------------------------")	;	
		 
		 String word="sivakumar";
			int countofa=0,countofe=0,countofi=0,countofo=0,countofu=0;
			 for(int i=0;i<word.length();i++) {
				 char ch=word.charAt(i);

				 switch(ch) {
				 case 'a':countofa++; break;
				 case 'e':countofe++; break;
				 case 'i':countofi++; break;
				 case 'o':countofo++; break;
				 case 'u':countofu++; break;
				 }
			 }
			 System.out.println("count of vowels a in a given string:"+countofa);
			 System.out.println("count of vowels e in a given string:"+countofe);
			 System.out.println("count of vowels i in a given string:"+countofi);
			 System.out.println("count of vowels o in a given string:"+countofo);
			 System.out.println("count of vowels u in a given string:"+countofu);
			 
			 System.out.println("--------------------------------------------------------------------------------")	;	 

			 String a="fgth";
				int count2=0;
				 for(int i=0;i<a.length();i++) {
					 char ch=a.charAt(i);

					 switch(ch) {
					 case 'a':count2++; break;
					 case 'e':count2++; break;
					 case 'i':count2++; break;
					 case 'o':count2++; break;
					 case 'u':count2++; break;
					 }
				 }
				 if(count2==0) System.out.println("no vowels present");
				 else
				 System.out.println("count of vowels in a given string:"+count2);
		System.out.println("--------------------------------------------------------------------------------")	;	
		//print only vowels in a string
		
		String v="aeroplane";
		for(int i=0;i<v.length();i++) {
			 char ch=v.charAt(i);
			 switch(ch) {
			 case 'a':
			 case 'e':
			 case 'i':
			 case 'o':
			 case 'u': 
				System.out.println(ch) ;
			 }
		}	 
	}
	
}

