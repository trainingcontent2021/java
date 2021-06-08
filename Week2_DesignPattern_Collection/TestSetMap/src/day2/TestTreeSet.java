package day2;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		 java.util.TreeSet<Integer> evenNumbers = new java.util.TreeSet<>();

	        // Using the add() method
	        evenNumbers.add(2);
	        evenNumbers.add(4);
	        evenNumbers.add(6);
	        System.out.println("TreeSet: " + evenNumbers);

	        TreeSet<Integer> numbers = new TreeSet<>();
	        numbers.add(1);

	        // Using the addAll() method
	        numbers.addAll(evenNumbers);
	        System.out.println("New TreeSet: " + numbers);
	        
	        
	        
	        // Calling iterator() method
	        Iterator<Integer> iterate = numbers.iterator();
	        System.out.print("TreeSet using Iterator: ");
	        // Accessing elements
	        while(iterate.hasNext()) {
	            System.out.print(iterate.next());
	            System.out.print(", ");
	        }

	}

}
