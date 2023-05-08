
package Collections;

import java.util.*;

public class Collectiondemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]=new int[4];
       ArrayList<Integer> alist=new ArrayList<Integer>();
       for(int i=1;i<=10;i++) 
    	   alist.add(i);
          alist.add(100);
          alist.add(100);
          alist.add(100);
          System.out.println(alist);
          System.out.println(alist.get(0));
          alist.remove(5);
          System.out.println(alist);
          alist.set(0, 100);   //update
          System.out.println(alist.get(0));
        
          for (int i:alist)  
        	  System.out.println(i);
          Iterator<Integer> i=alist.iterator();
          System.out.println("using iterator");
          System.out.println(i.next());
          while(i.hasNext()) {
        	  System.out.println(i.next());
          
          }
      
      
         LinkedList<String> llist=new LinkedList<String>();
         llist.add("arul");
          
         System.out.println(llist);
       
          
	}

}
 
