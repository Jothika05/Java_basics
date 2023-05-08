package Strings;

public class string_strip_repeatmethods_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s=" Tamilnadu Chennai ";
  System.out.println(s);
  System.out.println(s.toLowerCase());
  System.out.println(s);
  System.out.println(s.toUpperCase());
  System.out.println(s.length());
  String s2=s.strip();
  System.out.println(s2.length());
  
  System.out.println(s.trim());
  System.out.println(s.stripLeading());
  System.out.println(s.stripTrailing());
  
  System.out.println(s.repeat(4));
  System.out.println(s.indent(20));
  
  System.out.println(s.toCharArray());
  
	}

}
