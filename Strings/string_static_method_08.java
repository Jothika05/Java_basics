package Strings;

public class string_static_method_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s="Tamilnadu Chennai Tamilnadu";
  System.out.println(s.matches("\\w{9} \\w{7}"));
  System.out.println(s.replace('T','t'));
  System.out.println(s.replace("Ta", "TA"));
  System.out.println(s.replaceAll("\\s", "-"));
  System.out.println(s.replaceFirst("\\s", "-"));
  String[] s2=s.split(" ");
  for(String ss:s2) 
  System.out.println(ss);
	//System.out.println(s2.length);
 
  System.out.println();
  String[] s3=s.split(" ",2);
  for(String ss:s3) 
	  System.out.println(ss);
	  
  
  System.out.println(String.join("-" ,"18","02","2000"));
   int no=5;
   String a= String.valueOf(no);
   System.out.println(a);
   System.out.println(no+5);
   System.out.println(a+5);
   s="Tamilnadu";
   System.out.println(s.contains("Tamil"));
 
}
}