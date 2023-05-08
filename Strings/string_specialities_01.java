package Strings;

public class string_specialities_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s=new String("arul");   //heap memory
      
      String s1="Jothi"; // String Literal
      System.out.println(s1);
      s1="arunaa"; // stored-->string constant pool,strings are immutable.
      System.out.println(s1);
      //concatenation operator (+)
      System.out.println(5+9); //
      System.out.println("arul"+"jothi");
      System.out.println(5+"8");
      
      System.out.println(5+5+"arun"+10+10);
      System.out.println("arun"+3+5);
      System.out.println("arun"+3+"5");
      
	}

}
