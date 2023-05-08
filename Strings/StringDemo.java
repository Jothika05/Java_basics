
package Strings;

public class StringDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   StringDemo sd=new StringDemo();
   
   String[] names= {"arul","mala","kala","bala"};
   sd.joinWords(names);
	}

	private void joinWords(String[] names) {
      String sentence=" ";
      StringBuffer sb=new StringBuffer();  //append
      StringBuffer sb1=new StringBuffer("adhi");  //threadsafe,synchronized
      sb1.insert(1, 'a');
      System.out.println(sb1);
      sb1.replace(0, 1, "am");
      System.out.println("after replace "+sb1);
      System.out.println(sb1.reverse());
     /*for(int i=0;i<names.length;i++)
	  *System.out.println(names[i]);
	  **/
      
	 for(String name:names) {  //forward direction only
		 sb.append(name);  //adding at the end
	 
			System.out.println("StringBuffer hashcode:"+sb.hashCode());
		 
		 //System.out.println(name);
			sentence=sentence+name;	
		    System.out.println("String hashcode:"+sentence.hashCode());
		    
		    
		    System.out.println(sb);
		    System.out.println(sentence);
		    
	 }   
		    StringBuilder bu=new StringBuilder("");
		    System.out.println(bu.hashCode());
		    bu.append("arul");
		    System.out.println(bu);
		    System.out.println(bu.hashCode());
		    System.out.println(bu.reverse());
		    bu.replace(0, 1, "A");
		    System.out.println(bu);
	 
	  
	}

	

}

