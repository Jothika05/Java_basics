

package secondproject;

public class Wrapper {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		int i=10;               //primitive dadatypes
		float f;
	
		
		Integer i2=Integer.valueOf(345);   //boxing or wrapping    //i2 is a box
		
		int j=i2.intValue();     //unboxing
                    
		Integer i3=20;     // Integer.valueof(20)  --> auto boxing
	
  	    int k=i2;        // autounboxing
	    
	    
	    String s="12334"; 
	    
	    int i4= Integer.parseInt(s);
	    System.out.println(i2);
	    System.out.println(i3);
	    System.out.println(i4);

	    
	}

}
