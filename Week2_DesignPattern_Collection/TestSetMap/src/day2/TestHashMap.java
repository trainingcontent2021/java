package day2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		/* This is how to declare HashMap */
	      HashMap<Integer, String> hmap = new HashMap<Integer, String>();

	      /*Adding elements to HashMap*/
	      hmap.put(10, "Charlie");
	      hmap.put(20, "Rax");
	      hmap.put(70, "Sam");
	      hmap.put(43, "Alex");
	      hmap.put(32, "martin"); 
	      hmap.put(32, "martin1");//doesn’t allow duplicate keys. 
	      hmap.put(42, "martin"); //But it can have duplicate values
	      hmap.put(null, null);
	      hmap.put(null, "Shawn");

	      /* Display content using Iterator*/
	      Set set = hmap.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	      }

	      /* Get values based on key*/
	      String var= hmap.get(43); //get() method is used to get the value by its Key. 
	      System.out.println("Value of key 70 "+var);

	      /* Remove values based on key*/
	      hmap.remove(32);
	      System.out.println("Map key and values after removal:");
	      Set set2 = hmap.entrySet();
	      Iterator iterator2 = set2.iterator();
	      while(iterator2.hasNext()) {
	          Map.Entry mentry2 = (Map.Entry)iterator2.next();
	          System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
	          System.out.println(mentry2.getValue());
	       }


	}

}
