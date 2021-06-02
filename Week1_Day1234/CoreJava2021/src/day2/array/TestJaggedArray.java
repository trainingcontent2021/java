package day2.array;

public class TestJaggedArray {

	public static void main(String ... args ) { //varargs
		int arr[ ][ ] = {{1,2,3}  // elements are 3
						 ,{4,5}, // elements are 2
						 {6,7,8,9}}; // elements are 4
        for(int i=0;i<3;i++)
        {
        	for (int j = 0; j < arr[i].length; j++) {
        		
        		System.out.print(arr[i][j]+" ");
			}
        	System.out.println();
                
        }

	}

}
