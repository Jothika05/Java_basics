package inheritance;

class Animal {  //parent class
	
	void eat()
	{
		System.out.println("Animal is Eating");
	}
  void forestanimal() 
  {
	  System.out.println("Forest animal are live in forest");
	  
  }
    
  }


class Petanimal extends Animal{ // child class --> petanimal acces parent class methods eat()& forestanimal()
	void verycute()
	{
		System.out.println("pet animals are very cute");
	}
	
}
class Domesticanimal extends Petanimal{   //child sub class --> domesticanimal access petanimal methods and animal methods
	void veryworstpa()
	{
		System.out.println("domestic animals are very worst");
	}
}

public class multi {        // main classs

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Domesticanimal da = new Domesticanimal();
		
		da.eat();
		da.forestanimal();
		da.verycute();
		da. veryworstpa();
	}

}
