package day2.array;

public class TestOneDArray {
	public static void main(String[] args)
	{
	  //int[] arr = new int[5];
	  int[] arr = {10,20,30,40,50};  //Declaring array + initializing
	  
      for(int x : arr)
      {
              System.out.println(x);
      }
      
      for(int i=0;i<arr.length;i++)
      {
              System.out.println(arr[i]);
      }
}
}