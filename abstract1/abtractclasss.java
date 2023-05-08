package abstract1;

abstract class Fruit{
	void shape() {
		System.out.println("fruits are round shape");
	}
	abstract void colour();
}
class Apple extends Fruit{
	void colour() {
		System.out.println("colour is red");
		System.out.println("-------------");
	}
	
}
class Orange extends Fruit{
	void colour() {
		System.out.println("colour is Orange");
	}
	void taste(){
		System.out.println("vera level taste");
	}
}
 public class abtractclasss{
public static void main(String args[]) {
	 Apple a=new  Apple();
	 Orange o=new Orange();
	 a.shape();
	 a.colour();
	 o.shape();
	 o.colour();
	
	 o.taste();
	
}
}