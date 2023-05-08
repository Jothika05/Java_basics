package secondproject;

class Employee implements Cloneable{
	  String name;
	  int salary;

	public static void main(String[] args) {
	Employee e1=new Employee();
	e1.name="arul";
	e1.salary=35000;
	System.out.println("employee1 name is "+e1.name);
	System.out.println("Employee1 salary is "+e1.salary);
	

	try {
		Employee e2=(Employee)e1.clone();
		System.out.println("employee2 name is "+e2.name);
		System.out.println("Employee2 salary is "+e2.salary);
		System.out.println();
		
		e2.name="jothi";
		System.out.println("empolyee2 name is "+e2.name);
		System.out.println("Employee2 salary is "+e2.salary);
		
		}
	catch  (Exception e){
		System.out.println(e);
	}
		
	}
}
