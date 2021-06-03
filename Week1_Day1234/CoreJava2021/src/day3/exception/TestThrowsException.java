package day3.exception;

public class TestThrowsException {
		  public static void main(String args[]){ 
		   try{ 
			   ThrowSException obj=new ThrowSException (); 
		      obj.myMethod(1); 
		   }catch(Exception ex){
		     System.out.println(ex);
		    } 
		  }
}
