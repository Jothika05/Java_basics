package StringIntroduction;

public class Calculator {
  int price;
 String brand;
  
 
	public static void main(String[] args) {
   //compare		
   String s="ABC";
   String s1= "BCD";
   System.out.println(s.compareTo(s1));  //compare two string
   
   s="ABC"; //65
   s1= "abc"; //97
   System.out.println(s.compareTo(s1));  //-32
   System.out.println(s.compareToIgnoreCase(s1));  //0
   
   s="BCD";
   s1= "ABCD";
   System.out.println(s.compareTo(s1));
   
   s="BCD";
   s1= "ABCD";
   System.out.println(s.compareTo(s1));
   
   s="ABCD";
    s1= "BCD";
   System.out.println(s.compareTo(s1)); 
   

	/*	Calculator c1=new Calculator();
		c1.price=700;
		c1.brand="orpat";
		Calculator c2=new Calculator();
		c2.price=600;
		c2.brand="casio";
		
		int result=(c1.compareTo(c2)); // compare two object
		if(result>0) {
			 System.out.println("C1 price is higher");
		}
		else if(result<0) {
			 System.out.println("C2 price is higher");		}
		else {
			 System.out.println("C1 and C2 price are equal");
		}
	}
	public int compareTo(Calculator c)
	{
		
		 if(this.price>c.price)
		      return 1;
		   else if(this.price<c.price)
		      return -1;
		   else
			  return  0; 
		
		int result=this.brand.compareTo(c.brand);  //1   //string object
		if(result>0)
			return 1;
		else if(result<0)
			return -1;
		else
			return 0;   */
		
		} 
		
} 