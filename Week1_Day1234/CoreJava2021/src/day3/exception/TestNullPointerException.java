package day3.exception;

public class TestNullPointerException {
	public static void main (String [] args)
	{try {
		String s =null;
		System.out.println("The length of string is: "+ s.length());
	}catch(NullPointerException es)
	{
		System.out.println(" Length not applicable on NULL");
	}
	}
}
