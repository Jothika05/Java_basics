package StringIntroduction;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
	String s="abs";
	System.out.println("s-->"+ s+" :"+s.hashCode());
	s="abs";
	System.out.println("s-->"+ s+" :"+s.hashCode());
	s="ads";
	System.out.println("s-->"+ s+" :"+s.hashCode());
	String  s1="dghf";
	System.out.println(s1);
	
	
	String a1=new String("tamil");
	String a2=new String("tamil");
	String a3=new String("tamil");
	String a4=new String("tamil");
	String a5=new String("tamil");
	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a3);
	System.out.println(a4);
	System.out.println(a5);
	a1="english";
	System.out.println(a1);
	  
	
	   //concat 
	    a1="ABC";
	    a2="abc";
	   String a=a1.concat(a2);
	   System.out.println(a);
	   
	   //indexof
	   a="Tamil Tamilnadu Tamilan";
	   System.out.println(a.indexOf("Tamil"));
	   System.out.println(a.indexOf("Tamil",5));
	   
	   //
	   a=" ";
	   System.out.println(a.isBlank());
	   System.out.println(a.isEmpty());
	   
	   //
	   String names="Tamil Tamilnadu Tamilan";
	   String[] st=names.split(" ");
	   for(int i=0;i<st.length;i++) {
	     System.out.println(st[i]);
	   }
	   

	   //
	   String name="Latha";
	   char[] ch=name.toCharArray();
	   String name2=new String(ch);
	   System.out.println(name2);
	
	   System.out.println(name2.substring(3));
	   System.out.println(name2.substring(0, 3));
	}
}
