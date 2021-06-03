package day3.exception.custom;

public class TestCustomException {

	
	public static void main(String[] args) {
		try {
			validate(10);
		} catch (InvalidAgeException e) {
			System.out.println(" Exception Occured"+ e.toString() );
		}

	}

	private static void validate(int age) throws InvalidAgeException {
		if ( age<18)
			throw new InvalidAgeException(" Not a valid age");
		else
			System.out.println("It is  valid age");
		
		
	}

}
