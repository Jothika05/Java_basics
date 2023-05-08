package oppsconcept;
abstract class vehicle{
	abstract void speed ();
	void licence() {
		System.out.println("you must need license ");
	}
}
 class  bike extends vehicle{

	@Override
	void speed() {
		// TODO Auto-generated method stub
		System.out.println("please! go slow");
	}

}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       vehicle v=new bike();
       v.licence();
       v.speed();
	}

}
