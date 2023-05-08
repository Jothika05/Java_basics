package inter;


interface Family{
	 void read();
}
 class Father implements Family{
	  public void read() {
			System.out.println("father is reading newspaper");
		}
}
class Mother implements Family{ 
	public void read() {
		System.out.println("Mother is reading a novel");
		
	}
}
	class Children implements Family{
	public void read() {
		System.out.println("Children is reading a school book");
		
	}

}

public class InterfaceDemo{
	public static void main(String args[]) {
		Family f=new Father();
		Father fa=new Father();
		Mother m=new Mother();
		Children c=new Children();
	
	          fa.read();
	          m.read();
	          c.read();

}
}
