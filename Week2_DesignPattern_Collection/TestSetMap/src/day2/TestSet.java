package day2;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
			
			//Add an element
			Set<String> names = new HashSet<>();
			names.add("Tom");
			names.add("Mary");
			names.add("Mary"); // No duplicates allowed
			names.add(null);
			names.add(null); // Only one null value allowed
			 
					
			//Traverse all elements
			Iterator<String> iterator = names.iterator();
			 
			while (iterator.hasNext()) {
			    String name = iterator.next();
			    System.out.println(name);
			}

	}

}
