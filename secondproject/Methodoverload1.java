package secondproject;

public class Methodoverload1{
	static int add(int a,int b) {
	   return a+b;
	}
	static double add(double a,double  b,double c) {
	   return a+b+c;
	}
	   static float add(float a) {
		   return a*a;
	    
}
 public static void main(String args[]) {
	 System.out.println(add(7,7));
	 System.out.println(add(7,9,7));
	 System.out.println(add(6));
	 
}
}