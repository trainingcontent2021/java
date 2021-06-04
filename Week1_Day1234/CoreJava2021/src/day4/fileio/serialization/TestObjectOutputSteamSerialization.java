package day4.fileio.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestObjectOutputSteamSerialization {

	public static void main(String[] args) {
		try {
		Employee employee = new Employee(101," Ashu");
		 //Creating stream and writing the object  
		  FileOutputStream fout=new FileOutputStream("d:\\temp\\emp.txt");  
		  ObjectOutputStream out=new ObjectOutputStream(fout);  
		  out.writeObject(employee);  
		  out.flush();  
		  //closing the stream  
		  out.close();  
		  System.out.println("success");  
		  }catch(Exception e)
		  {System.out.println(e);}  
	}

}
