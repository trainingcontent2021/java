package day2.coreJava8.lambda;

public class TestMultipleParameter {

	public static void main(String[] args) {
		  // lambda expression with multiple arguments
    	StringCat s= (str1, str2) -> str1 + str2;
        System.out.println("Result: "+s.sconcat("Hello ", "World"));

	}

}
