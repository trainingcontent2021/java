package day3.exception;

public class TestFinallyBlock {

	public static void main(String[] args) {
		 try{  
			 int num=121/10;  
			 System.out.println(num);
			 System.exit(1);
		      }  
				
				  catch(ArithmeticException e){
				  System.out.println("Number should not be divided by zero"); }
				  
		      /* Finally block will always execute
		       * even if there is no exception in try block
		       */
		      finally{
			 System.out.println("This is finally block");
		      } 
		 
		 
		      System.out.println("Out of try-catch-finally");  
		   }   

}
