package oppsconcept;
class Fruit{  /// fruit is a class
	String  name="Apple";
	String colour="red";

	
	void taste() {
		System.out.println("my favoraite  fruit  is  "+ name);
		System.out.println(name + " is "+  colour +" colour");
	}

	
}

public class Classandobjectdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Fruit f=new  Fruit();   // f is a object
		 
		 
       f.taste();
	
        
	}

}
