package oppsconcept;//polymorphism ---> methodoverloading -->compiletime polymorphism
class CircleArea{
	double area(double x) {
		return  3.14 *x;
	}
}
class SquareArea{
	int area(int x) {
		return x*x;
	}
}
class RectangleArea{
	int area(int x,int y) {
		return x*y;
	}
}
class TraiangleArea{
	int area(int y,int x) {
		return y*x/2;
	}
}
public class polymorohism {

	public static void main(String[] args) {
		CircleArea c=new CircleArea();
		SquareArea s=new SquareArea ();
	   RectangleArea r=new  RectangleArea();
	   TraiangleArea t=new TraiangleArea();
	System.out.println("CircleArea   " +c.area(1));
	System.out.println ("SquareArea   " +s.area(7));
	System.out.println ("RectangleArea "+r.area(5,7));
	System.out.println ("raiangleArea   "+t.area(80, 3));
	}

}
//methodoverriding--->runtime polymorphism
/* class user{
	String name;
	int age;
    user(String n,int a){
		this.name=n;
		this.age=a;
	  }
	public void display() {
		System.out.println("Name  : "+name);
		System.out.println("Age   : "+age);
	}
	
}

class Mainprogrammer extends user{
	String companyName;
	Mainprogrammer(String n,int a,String c){
		super(n,a);
		this.companyName=c;
	}
	public void display() {
		System.out.println("Name  : "+name);
		System.out.println("Age   : "+age);
		System.out.println("CompanyName :"+companyName);
	}
	
}
public class polymorohism {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mainprogrammer  m=new Mainprogrammer("raama",25,"wipro");  
		m.display();
	}

}
*/