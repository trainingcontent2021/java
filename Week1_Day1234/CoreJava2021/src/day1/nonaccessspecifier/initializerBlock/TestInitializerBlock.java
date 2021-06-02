package day1.nonaccessspecifier.initializerBlock;

public class TestInitializerBlock {
	{
		System.out.println("Welcome ");
		System.out.println("This is Initializer block");

	}
	public TestInitializerBlock()
	{
		System.out.println("Default Constructor invoked"); 
	}
	public static void main(String as[])
	{
		 TestInitializerBlock obj = new  TestInitializerBlock();
		System.out.println("This is main() method");
	}
}
