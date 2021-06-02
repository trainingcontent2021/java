package day1.classcontructor.Employee;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1= new Employee(100,"Ginni");
		
		//Passing object as an argument to constructor
		Employee e2= new Employee(e1);
		Employee e3=e2;
		
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e3.greetEmployee());
		
		Employee e4= new Employee(200,"Mini");

	}

}
