package secondproject;   /* using constructor */

public class Students {
		String studentname;
		int studentid;
		int studentdob;
		char studentsection;
		
		
		Students(String name,int id,int yr,char sec)
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
	
		Students stu1=new Students("arul",1005,2001,'a');
		stu1.display();
		
		
		Students stu2=new Students("aruna",1006,2000,'a');
		stu2.display();

	}

}
