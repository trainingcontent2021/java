package day4.fileio.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestObjectInputStreamDeserialization {

	public static void main(String[] args) {
		 try{  
			  //Creating stream to read the object  
			  ObjectInputStream in=new ObjectInputStream(new FileInputStream("d:\\temp\\emp.txt"));  
			  Employee s=(Employee)in.readObject();  
			  //printing the data of the serialized object  
			  System.out.println(s.getEmpNo()+" "+s.getEmpName());  
			  //closing the stream  
			  in.close();  
			  }catch(Exception e){System.out.println(e);}  
			 }  

}
