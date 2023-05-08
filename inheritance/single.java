

package inheritance;

class Food {
	void healthy() {
		System.out.println("food is healthy");
	}

	void taste() {
		System.out.println("food is very tasty");
	}
}

 class Idly extends Food{

	void soft() 
	{
		System.out.println("idly is very soft");
	}
 }
	public class single {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Idly a = new Idly();
			a.healthy();
			a.taste();
			a.soft();

		}
     }  
