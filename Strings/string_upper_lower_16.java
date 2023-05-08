package Strings;

public class string_upper_lower_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s="tamilnadu";
 //using char
 char[] ch=s.toCharArray();
 ch[0]=(char) (ch[0]-32);
// System.out.print(ch[0]);
 for(char s2:ch) {
	 System.out.print(s2);
 } 
 
 
 
 System.out.println();
 System.out.println(""
 		+ " ----------------------------------------------");
   for(int i=0;i<ch.length;i++) {
	    if(i%2==0)
		   if(ch[i]>='a'&&ch[i]<='z')
		          ch[i]=(char) (ch[i]-32);
    }
   s=new String(ch);
   System.out.println("using char:   "+s);
	
//using substring
	String a="tamilnadu";
	//System.out.println(a.substring(0,1).toUpperCase() +a.substring(1));
	for(int i=0;i<a.length();i++) {
	    if(i%2==0)
	    	System.out.print(a.substring(i,i+1).toUpperCase());
	    else
	    	System.out.print(a.substring(i,i+1).toLowerCase());
	}
	
}
}