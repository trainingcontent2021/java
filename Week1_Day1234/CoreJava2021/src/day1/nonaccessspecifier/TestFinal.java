package day1.nonaccessspecifier;

public class TestFinal {

	public static void main(String[] args) {
		//Final modifier can be used with variable, method and class. if variable is declared final then we cannot change its value. If method is declared final then it can not be overridden and if a class is declared final then we can not inherit it.
		
		final int x=10;
		System.out.println(x);
		x=15;
		

	}

}
