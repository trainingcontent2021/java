package day3.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestCollections {
public static void  main(String [] args)
{
	 //Create collections lists    
    List<Integer> list = Arrays.asList(20, 10, 100, 140, 250);  
        Integer max = Collections.max(list);  
        System.out.println("Maximum element is: "+max);
        Collections.reverse(list);
         System.out.println( "reverse List is :"+ list);
}
}
