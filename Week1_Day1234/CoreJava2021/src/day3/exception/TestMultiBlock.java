package day3.exception;

public class TestMultiBlock {

	public static void main(String[] args) {
		try{
	         int a[]=new int[7];
	         a[41]=30/10;
	         System.out.println("First print statement in try block");
	     }
	     catch(ArithmeticException e){
	        System.out.println("Warning: ArithmeticException");
	     }
	     catch(ArrayIndexOutOfBoundsException e){
	        System.out.println("Warning: ArrayIndexOutOfBoundsException");
	     }
	     catch(Exception e){
	        System.out.println("Warning: Some Other exception");
	     }
	   System.out.println("Out of try-catch block...");
	  }

	}


