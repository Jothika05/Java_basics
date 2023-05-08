package secondproject;
//inner class
class Outer{
	int n;
	void outerDisplay()
	{
		System.out.println("outer class display ");
	}

 class Inner{
	int x;
	void innerDisplay() 
	{
			System.out.println("inner class display");	
			
	}
   }
}
public class Innerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Outer o=new Outer();
        //o.n=10;
        o.outerDisplay();
       Outer.Inner i=o.new Inner();
       i.innerDisplay();
	}
}

