package secondproject; /* using method */


public class Student1{
	String studentname;
	int studentid;
	int studentdob;
	char studentsection;
	
	
	void setdata(String name,int id,int yr,char sec)
	{
	    studentname=name;
	    studentid=id;
	    studentdob=yr;
	    studentsection=sec;
		
	}
	
	
	void display()
	{
	 System.out.println("student  name is   "  + studentname);
	 System.out.println("student id is  " +studentid);
	 System.out.println("student dob is  " +studentdob);
	 System.out.println("student section is  "+studentsection);
	 System.out.println();
	
	
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	/*Student1 stu1=new Student1("arul",5,2000,'A');
	stu1.display();
	Class cls=stu1.getClass();
	System.out.println("class name is "+cls.getClass());
	
	*/

	Student1 stu1=new Student1();
	stu1.setdata("arul",1005,2001,'a');
	stu1.display();
	Class cls=stu1.getClass();
	System.out.println("class name is "+cls.getName());


	/*Student1 stu2=new Student1();
	stu2.setdata("aruna",1006,2000,'a');
	stu2.display();*/

}

}


