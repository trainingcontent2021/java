package day3.exception;

import java.io.IOException;

public class ThrowSException {
		  void myMethod(int num) throws IOException, ClassNotFoundException{ 
		     if(num==1)
		        throw new IOException("IOException Occurred");
		     else
		        throw new ClassNotFoundException("ClassNotFoundException");
		  } 
		} 

