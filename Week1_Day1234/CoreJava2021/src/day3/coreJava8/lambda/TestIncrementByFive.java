package day3.coreJava8.lambda;

public class TestIncrementByFive {

	public static void main(String[] args) {
		   // lambda expression with single parameter num
   IncrementByFive f = (num) -> num+5;
        System.out.println(f.increment(22));

	}

}
