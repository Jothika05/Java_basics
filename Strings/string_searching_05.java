package Strings;

public class string_searching_05 {

	public static void main(String[] args) {
		
		String s1="Tamilnadu Chennai Chennai Chennai Chennai";
		        // 012345678
	System.out.println("first occurance of a:"+s1.indexOf('a'));
	System.out.println(s1.indexOf("Chennai"));
	System.out.println(s1.indexOf('a', 9));
	System.out.println(s1.indexOf("nn", 9));	
		
	System.out.println("last ocuurance of a: "+s1.lastIndexOf('a'));	
	System.out.println("last ocuurance of Chennai: "+s1.lastIndexOf("Chennai"));
	System.out.println(s1.lastIndexOf('a', 9));
	System.out.println(s1.lastIndexOf("Chennai", 19));	
		
		
		
		
		
		
		
		
		
		
		
		
}
}