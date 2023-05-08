package secondproject;  /* using object */

public class Student {
	String stuname;
	int stuid;
	int dob;
	char sec;
	
	void display()
	{
	 System.out.println("student  name is   "  + stuname);
	 System.out.println("student id is  " +stuid);
	 System.out.println("student dob is  " +dob);
	 System.out.println("student section is  "+sec);
	 System.out.println();
	
	
    }
	public static void main(String[] args) {
		Student stu1=new Student();
		stu1.stuname="arul";
		stu1.stuid=1005;
		stu1.dob=2001;
		stu1.sec='b';
        stu1.display();
        
        Student stu2=new Student();
		stu2.stuname="aruna";
		stu2.stuid=1006;
		stu2.dob=2000;
		stu2.sec='b';
        stu2.display();


	}

}
