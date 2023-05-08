package Collections;

import java.util.*;

public class Collectiondemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q=new LinkedList<>();
		PriorityQueue<Integer> q1=new PriorityQueue<>(); //   1,3,8,10 --> sort
q.add(3);
q.add(10);
q.add(1);
q.add(8);
q1.add(3);
q1.add(10);
q1.add(1);
q1.add(8);
System.out.println("head is" +q.peek());
System.out.println("removed" +q.poll());
System.out.println("head is" +q.peek());
System.out.println();
System.out.println("head is" +q1.peek());
System.out.println("removed" +q1.poll());
System.out.println("head is" +q1.peek());
	
	}

}
