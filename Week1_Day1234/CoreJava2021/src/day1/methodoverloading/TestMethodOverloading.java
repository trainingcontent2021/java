package day1.methodoverloading;

public class TestMethodOverloading {

	public static void main(String[] args) {
		//-------------Method Overloading: changing no. of arguments
		System.out.println(Adder.add(11,11));  
		System.out.println(Adder.add(11,11,11)); 
		
		//------------Different type of paramters
		System.out.println(Adder.add(11,11));  
		System.out.println(Adder.add(12.3d,12.6d)); 
}

}
