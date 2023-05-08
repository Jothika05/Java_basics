package Strings;

public class string_comparition_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Arul");
		String s2=new String("Arul");
		boolean result=s1.equals(s2);
		System.out.println(result);
		
		s1=new String("Arul");
	    s2=new String("arul");
		boolean re=s1.equalsIgnoreCase(s2);
		System.out.println(re);
		
		s1=new String("Arul");
	    s2=new String("PgiArul");
	    StringBuffer s3=new StringBuffer("Arul");
	     re=s1.contentEquals(s3);  //two string
		System.out.println(re);
		re=s1.contentEquals(s3);  //string and string buffer
		System.out.println(re);
		
		s1=new String("pavi");
		s2=new String("anisha");
		int res=s1.compareTo(s2); //-ve,0,+ve
		System.out.println(res);
		
		s1=new String("kavi");
		s2=new String("Kavi");
		 res=s1.compareToIgnoreCase(s2); //-ve,0,+ve
		System.out.println(res);
		
		s1=new String("kavi");
		s2=new String("Kavi");
	    re=s1.startsWith("k");
		System.out.println(re);
		re=s2.endsWith("i");
		System.out.println(re);
}}