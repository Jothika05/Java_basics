package secondproject;
class Cycle{
	void display() {
		System.out.println("you are riding a cycle");
	}
}
             /*class bike	extends Cycle{
	             void display() {
		         System.out.println("you are riding a bike");
	              }
                 } */


public class Anonymousdemo {

	public static void main(String[] args) {
        Cycle c=new Cycle() {   // Anonymous class
	       void display() {
		   System.out.println("you are riding a bike");
		   }
          };
          c.display();
          
          Cycle c2=new Cycle();
          c2.display();
      }
	}

 