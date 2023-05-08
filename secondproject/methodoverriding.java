package secondproject;
class user{
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
public class methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mainprogrammer  m=new Mainprogrammer("raama",25,"wipro");  
		m.display();
	}

}
