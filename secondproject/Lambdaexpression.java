
package secondproject;

interface Family{
	 void read();  // single abstract  interface method 
}
  class Father implements Family{
	public void read() {
		System.out.println("father is reading newspaper");
	}


}
class Mother implements Family{ 
	public void read() {
		System.out.println("Mother is reading a novel");
		
	}
}
	class Children implements Family{
	public void read() {
		System.out.println("Children is reading a school book");
		
	}

}

public class Lambdaexpression{
	public static void main(String args[]) {
		Father fa=new Father();
		Mother m=new Mother();
		Children c=new Children();
		      fa.read();
	          m.read();
	          c.read();
	          
	    Family f1=new Family() {
	    	public void read() {
	    	System.out.println("i am reading a book");
	    }
	    };
	      f1.read();
	      //LambdaExpression - functional interface

	      Family f=()->{System.out.println("i am reading a story book");};
              f.read();
}
}














