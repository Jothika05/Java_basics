package Collections;

import java.util.*;

/*   set - only unique elements
 * HashSet -hashing
 */
public class Collectiondemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          // HashSet<String> h=new HashSet<String>();
    		  // LinkedHashSet<String> h=new LinkedHashSet<String>(); 
            TreeSet<String> h=new TreeSet<String>();  // albhabet order
  h.add("rama");
  h.add("seetha");
  h.add("abi");
  h.add("rama");
h.add("rrr");
h.add("rrr");
h.add("ak");
h.add("ra");
  
  
  
  System.out.println(h);
}
	}
