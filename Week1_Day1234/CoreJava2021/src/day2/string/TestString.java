package day2.string;

public class TestString {
	public static void main(String[] args) {
	
		  // create a string
		// create first string
	    String first = "Java "; //It will be Strign pool
	    System.out.println("First String: " + first);

	    // create second
	    String second = "Programming";
	    System.out.println("Second String: " + second);

	    // join two strings
	    String joinedString = first.concat(second);
	    System.out.println("Joined String: " + joinedString);
	    System.out.println(" Length of string :" +first);
	    
	    
	    //===============Compare two String
	 // create 3 strings
	    String first1 = "java programming";
	    String second1 = "java programming";
	    String third1 = "python programming";

	    // compare first and second strings
	    boolean result1 = first1.equals(second1);
	    System.out.println("Strings first and second are equal: " + result1);

	    // compare first and third strings
	    boolean result2 = first1.equals(third1);
	    System.out.println("Strings first and third are equal: " + result2);
	  }
	}


