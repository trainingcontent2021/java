package day2.array;
//display sum of all elements
public class TestMultiDimensionalArray {
	public static void main(String[] args) {
		int[ ][ ] arr = {
							{1,2,3,4,5},    //elements are 5
							{6,7,8,9,10},    // //elements are 5
							{11,12,13,14,15} // //elements are 5
							};
		for(int i=0;i<3;i++)
        {
        	for (int j = 0; j < 5; j++) {
        		
        		System.out.print(arr[i][j]+" ");  
			}
        	System.out.println();
                
        }
	}

}
