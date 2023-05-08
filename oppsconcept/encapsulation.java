package oppsconcept;
class Student{
	private String name; //it has a private datamember,and getter and setter methods to be used
	
   public String getName() 
   {
	return name;
   }
   public void setName( String n)
    {
	  this.name=n;
    }
}
public class encapsulation{
	public static void main(String args[]) {
		Student s=new Student();
		s.setName("Arul");
		System.out.println(s.getName());
	}
}