package day1.loop;

public class TestLoop {

	public static void main(String[] args) {
		 int n = 5;
		    // for loop  
		    for (int i = 1; i <= n; ++i) {
		      System.out.println("Java is fun");
	}
		    
		    int n1 = 5;
		    // for loop  
		    for (int i = 1; i <= n; ++i) {
		      System.out.println(i);
		    }
		   
	//--------- Loop------------
		    int[] numbers = {3, 7, 5, -5};
		    // iterating through the array - forEach loop
		    for (int number: numbers) {
		       System.out.println(number);
		    }

		 //--------While
		    int i = 0;
		    while (i < 5) {
		      System.out.println("Learning Java");
		      System.out.println("The value of i is = " + i);
		      i++;
		    }
		    System.out.println("The value of i became " + i + " that is why it broke out of the loop");
		  
	
	 int j = 0;
	    do {
	      j++;
	      System.out.println("The value of j is " + j);
	    }
	    while ( i != 5 );
	  }
	
	
	//-----------------Nested Loop
	int i,j, k;
    k = 0;
    for (i = 0; i < 6; i++) {
      for (j = 0; j < 6; j++) {
        System.out.print(k + "\t");
        k++;
      }
      System.out.println("");
    }
	
}}
