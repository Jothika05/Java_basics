package inheritance;
class Animal{
	void sleep() {
		System.out.println("sleeping");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("barking");
	}
}
class Cat extends Animal{
	void meow() {
		System.out.println("meowing");
	}
}
public class hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Cat c=new Cat();
    c.sleep();
    //c.bark();
    c.meow();
    
	}

	
}
