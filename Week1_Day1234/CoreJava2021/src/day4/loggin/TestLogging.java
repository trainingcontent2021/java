package day4.loggin;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestLogging {
	private static final Logger LOGGER = Logger.getLogger(TestLogging.class.getName());
	public static void main(String[] args) {
		
		LOGGER.info("Logger Name: "+LOGGER.getName());
        
        LOGGER.warning("Can cause ArrayIndexOutOfBoundsException");
         
        //An array of size 3
        int []a = {1,2,3};
        int index = 4;
             
        try{
            System.out.println(a[index]);
        }catch(ArrayIndexOutOfBoundsException ex){
            LOGGER.log(Level.SEVERE, "Exception occur", ex);
        }
	}

}
