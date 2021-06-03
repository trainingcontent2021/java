package day3.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedList {

	public static void main(String[] args) {
	      /* Linked List Declaration */
	     LinkedList<String> l_list = new LinkedList<String>();
	      /*add(String Item) is used for adding 
	       * the Items to the linked list*/
	      l_list.add("Java");
	      l_list.add("Python");
	      l_list.add("Scala");
	      l_list.add("Swift");
	      System.out.println("Linked List Content: " +l_list);
	       
	      /*Add Items at specified position*/
	      l_list.add(2, "JavaScript");
	      l_list.add(3, "Kotlin");
	      System.out.println("l_list Content after editing: " +l_list);
	 
	      /*Add First and Last Item*/
	      l_list.addFirst("First Course");
	      l_list.addLast("Last Course");
	      System.out.println("l_list Content after addition: " +l_list);
	       
	      /*Get and set Items in the list*/
	      Object firstvar = l_list.get(0);
	      System.out.println("First Item: " +firstvar);
	      l_list.set(0, "Java9");
	      System.out.println("l_list Content after updating first Item: " +l_list);
	       
	      /* Remove from a position*/
	      l_list.remove(1);
	      l_list.remove(2);
	      System.out.println("LinkedList after deletion of Item in 2nd and 3rd position " +l_list);
	 
	      /*Remove first and last Item*/
	      l_list.removeFirst();
	      l_list.removeLast();
	      System.out.println("Final Content after removing first and last Item: "+l_list);
	       
	      /*Iterating the linked list*/
	      ListIterator<String> itrator = l_list.listIterator();
	      System.out.println("List displayed using list iterator:");
	      while (itrator.hasNext()) {
	          System.out.println(itrator.next());
	 
	    }// TODO Auto-generated method stub
	      
	      System.out.println(" Display using Iterator");
	      Iterator<String> itrator1 = l_list.iterator();
	      System.out.println("List displayed using iterator:");
	      while (itrator1.hasNext()) {
	          System.out.println(itrator1.next());
	 
	    }// TODO Auto-generated me

	}

}
