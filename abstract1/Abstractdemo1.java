package abstract1;
abstract class Shape{
	int h=6;
    int w=4;
	int b=3;
	int area= h*w*b;
	abstract void area(); 

	}
class Square extends Shape{
	void area()
	{
		System.out.println("Square area is " + area);
	}	
}
class Rectangle extends Shape{
	void area()
	{  
		System.out.println("Rectangle area is "+area);
	}

}

public class Abstractdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Square s1=new Square();
         Rectangle r1=new Rectangle();
      //  Shape s2=new Shape();    super class is not instantiate
          s1.area();
          r1.area();
         //create a array of object 
         Shape[] s=new Shape[4];
         s[0]=new Square();
         s[1]=new Square();
         s[2]=new Rectangle();
         s[3]=new Rectangle();
         
         for(Shape sh : s) {
        	sh.area();
         }
	}

}

