
package secondproject; /* Reflection */

import java.lang.reflect.*;

public class StudentR{
	String studentname;
	int studentid;
	int studentdob;
	char studentsection;
	
	StudentR (String name,int id,int dob,char sec)
	{
	    studentname=name;
	    studentid=id;
	    studentdob=dob;
	    studentsection=sec;
	}
	
	

public static void main(String[] args) {
	// TODO Auto-generated method stub

	StudentR stu1=new StudentR("arul",1005,2001,'a');
	Class cls=stu1.getClass();
	System.out.println("class name is "+cls.getName());
	System.out.println(cls.getClass());
	
	Method[] methods=cls.getMethods();
	for(Method m:methods) {
		System.out.println(m.getName());
		}
	try {
		  System.out.println(methods[0].invoke(stu1,null));
	} catch (IllegalAccessException e ) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalArgumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvocationTargetException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

}


private void getName() {
	// TODO Auto-generated method stub
	
}

}


