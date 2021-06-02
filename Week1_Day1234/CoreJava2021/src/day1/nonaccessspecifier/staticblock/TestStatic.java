package day1.nonaccessspecifier.staticblock;

public class TestStatic {
	static
	{
		System.out.println("Welcome to revature.com");
		System.out.println("This is static block");

	}
	
	public static void main(String as[])
	{
		System.out.println("This is main() method");
	}
	//--------When we have multiple static blocks then each block executes in the sequence. 
	static
	{
		System.out.println("**********************");
		System.out.println("This is static block II");

	}
}
