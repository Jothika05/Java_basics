package inter;
interface Animal{
	 void animalSound();
	 void sleep();
}
class Pig implements Animal{
	public void animalSound() {
		System.out.println("tha pig says:wee wee weeeeee");
	}
	public void sleep() {
		System.out.println("Zzz Zzz");
	}
	
public interface inerface {
 public static void main(String args[]) {
	 Pig myPig=new Pig();
	 myPig.animalSound();
	 myPig.sleep();
 }
}
}
 