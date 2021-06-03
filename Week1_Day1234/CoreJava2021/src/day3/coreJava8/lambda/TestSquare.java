package day3.coreJava8.lambda;

@FunctionalInterface
interface PrintNumber{
	public void print(int num1);
}

public class TestSquare {

	public static void main(String[] a) {
		PrintNumber p = n -> System.out.println("square is: "+ n*n);
		p.print(5);
	}
}