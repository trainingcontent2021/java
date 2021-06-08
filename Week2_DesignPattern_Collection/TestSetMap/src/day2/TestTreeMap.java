package day2;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args)
	{
		TreeMap<Integer, String> tmap = new TreeMap<>();
		 /*Adding elements to HashMap*/
	      tmap.put(10, "Charlie");
	      tmap.put(20, "Rax");
	      tmap.put(70, "Sam");
	      tmap.put(43, "Alex");
	      tmap.put(32, "Martin"); 
	      tmap.put(32, "Martin1");//doesn’t allow duplicate keys. 
	      tmap.put(42, "Martin"); //But it can have duplicate values
	     // tmap.put(null, null);
	      //tmap.put(null, "Shawn");
	      
	      
	      for(Map.Entry m:tmap.entrySet()){    
	          System.out.println(m.getKey()+" "+m.getValue());    
	         }    
	}
}
