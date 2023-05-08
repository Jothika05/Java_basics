
package Strings;

public class string_BB_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="hi";
     s=s+5+6;
     System.out.println(s);
     for(int i=0;i<1000;i++) {
    	 s=s+i;
     }
     //System.out.println(s);
     
     /*
      * stringBuffer-->synchronized
      * synchronized means Multithreading
      * StringBuilder-->non  synchronized
      * 
      */
     StringBuffer sb=new StringBuffer("Arul");
     sb.append("jothi"); 
     System.out.println(sb);
     System.out.println(sb.charAt(5));
     System.out.println(sb.deleteCharAt(0));
     sb.reverse();
     System.out.println(sb);
     sb.replace(0, 6, "loosupo");
     System.out.println(sb);
	}

}
