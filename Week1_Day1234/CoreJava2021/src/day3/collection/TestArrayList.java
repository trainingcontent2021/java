package day3.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestArrayList {

	public static void main(String[] args) {
		//1. Ways to declare an arrayList
		ArrayList<String> list1 = new ArrayList<String>();            //First Method //  //'list' can hold 10 elements (Default Initial Capacity)
		ArrayList<Integer> list2 = new ArrayList<Integer>(20);         //Second Method
        ArrayList<Integer> list3 = new ArrayList<Integer>(list2);  //Third Method
               
        

      // Add elements
        list1.add("ONE");
        list1.add("TWO");
        list1.add("THREE");
        list1.add("FOUR");
        list1.add("ONE");
        
      //find the number of elements present in an ArrayList  
        System.out.println(list1.size());  //5
        list1.ensureCapacity(20);
		
	//Check empty 
        System.out.println(list1.isEmpty()); //True/false
		  
		  //Check availability 
        System.out.println(list1.contains("TWO"));
		  
		  //check position System.out.println(list1.indexOf("ONE"));
		  System.out.println(list1.lastIndexOf("ONE"));
		  
		  //Get element in particular position 
		  System.out.println(list1.get(3));
		  
		  //Remove an element 
		  list1.remove(2); 
		  System.out.println(list1);
		  
		  
		  
		  //Join two array list
		  ArrayList<String> list4 = new ArrayList<String>();
		  list4.add("555");
		  list4.add("666"); 
		  list4.add("777");
		  list4.add("888");
		  list4.addAll(list1);
		  list1.addAll(2, list4);
		  System.out.println("Watch: "+list1); 
		  //Inserting all elements of list4 at index 2 of list1 //
		  System.out.println(list4);
		
		  
		//Traverse Array using Iterator
		  System.out.println(" Display element using Iterator");
		  Iterator<String> it =list4.iterator(); //Declaring Iterator 
		  while(it.hasNext()) {
		  System.out.print("\nElement of Arraylist: "+ it.next()+" ");  
		}

}
}