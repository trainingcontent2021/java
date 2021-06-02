package day2.object;

public class TestObjectClass {
	public static void main(String [] args)
	{
		Object obj = new String("Training at revature");
        Class c1 = obj.getClass();
        System.out.println("Class of Object obj is : "
                           + c1.getName());
   //---------------
        String a = "Andrew";  
        String b = "Andrew";  
  
        if(a.equals(b)){   //checking the equality of objects using equals() methods  
            System.out.println("a & b are equal variables, and their respective hashvalues are:" + " "+ a.hashCode() + " & " + b.hashCode());  
          
        }  
  
        String c = "Maria";  
        String d= "Julie";  
  
        if(!c.equals(d)){    //checking  the equality of objects using equals() method  
            System.out.println("\nc & d are Un-equal variables, and their respective hashvalues are:" + " "+ c.hashCode() + " & " + d.hashCode());  
              
        }  
         
	}
}
