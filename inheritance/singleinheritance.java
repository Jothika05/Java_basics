package inheritance;

/* single inheritance */
	 class Bird{
	 void eat()
	 {
	   System.out.println("eating");
	 }
	}
	class Parrot extends Bird{
	void huming() {
	   System.out.println("humming");
	     }
	}
	public class singleinheritance {
		public static void main(String[] args) {
	  // TODO Auto-generated method stub
	  Parrot p=new Parrot();
	  p.eat();
	  p.huming();
	        }
	}

