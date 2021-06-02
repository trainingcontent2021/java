package day1.datatype;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		    // creates an object of Scanner
		    Scanner input = new Scanner(System.in);

		    System.out.print("Enter your name: ");

		    // takes input from the keyboard
		    String name = input.nextLine();
		    // prints the name
		    System.out.println("My name is " + name);

		    
		    System.out.println(" Enter your age");
		    int age = input.nextInt();
		    System.out.println("My age is " + age);

		
		    // closes the scanner
		    input.close();
		  }
		

}
